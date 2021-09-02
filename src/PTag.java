public class PTag extends HTMLStyle{


    public PTag(String id, String text) {
        super(id, text);
    }

    @Override
    String toHTMLstring() {
        return "<p " + this.toSyleString() + '>' + this.getText() + " </p>";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLstring());
    }
}
