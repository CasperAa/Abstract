import java.util.ArrayList;

public abstract class HTMLStyle extends HTMLTag{

    private String color;

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
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toSyleString(){
        return "style=" + '"' + "color:" + this.getColor() + '"';
    }
}
