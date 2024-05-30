public class Bed {
    private String style;
    private String pillow;
    private int height;
    private int sheet;
    private int quilt;

    public Bed(String style, String pillow, int height, int sheet, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheet = sheet;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public String getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheet() {
        return sheet;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make(){
        System.out.println("Bed -> Making |");

    }
}
