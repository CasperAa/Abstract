import java.util.ArrayList;

public abstract class HTMLStyle extends HTMLTag{

    private String color;
    private int green, red, blue;

    public static ArrayList<String> colors;

    public HTMLStyle(String id, String text) {
        super(id, text);
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Olive");
        colors.add("Pink");
        colors.add("Crimson");
        colors.add("Cyan");
        colors.add("Purple");
        colors.add("Indigo");
        colors.add("Salmon");
        colors.add("Orange");
        colors.add("Gold");
        colors.add("Lime");
        colors.add("DarkGreen");
        colors.add("Aqua");
        colors.add("SteelBlue");
        colors.add("Navy");
        colors.add("Peru");
        colors.add("DarkSlateGray");
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toSyleString(){
        return "style=" + '"' + "background-color: rgb" + '(' + this.red + ',' + this.green + ',' + this.blue + ");" + " color:" + this.getColor() + '"';
    }

    public int randomInt(){
        return 1+(int)(Math.random()*((253 - 1)+1));
    }
}
