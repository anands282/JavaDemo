public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)? tonerLevel:-1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

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
            sheetsOfPaper = (int)Math.ceil(pagesToPrint/2.0);
            System.out.println("Duplex Printer");
        }
        pagesPrinted +=sheetsOfPaper;
        return sheetsOfPaper;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
