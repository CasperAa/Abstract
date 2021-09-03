public class HeaderTag extends HTMLStyle{

   private int number;


    public HeaderTag(String id, String text, int number) {
        super(id, text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    String toHTMLstring() {
        return "<h" + this.getNumber() + " "+ "id=" + '"' + this.getId() + '"' + " " + this.toSyleString() + ">" + this.getText() + "</h"+ this.getNumber() +">";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLstring());
    }

}
