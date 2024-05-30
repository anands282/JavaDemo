public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int addToner(int tonerAmount){
        int tempCheck = tonerLevel + tonerAmount;
        if(tempCheck <0 || tempCheck>100)
            return -1;
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pagesToPrint){
        int sheetsOfPaper = pagesToPrint;
        if(duplex){
            sheetsOfPaper = (int)Math.ceil(pagesToPrint/2);
            System.out.println("Duplex Printer");
        }
        pagesPrinted +=sheetsOfPaper;
        return sheetsOfPaper;

    }
}
