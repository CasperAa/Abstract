import java.util.Objects;

public abstract class HTMLTag{

    private String id;
    private String text;

    public HTMLTag() {
    }

    public HTMLTag(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String name) {
        this.text = text;
    }

    abstract String toHTMLstring();


    abstract void print();

    @Override
    public boolean equals(Object o) {
        // return true; //Snyder til at alle er ens, så vi får ken 1 elemet i vores set

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HTMLTag htmlTag = (HTMLTag) o;
        return Objects.equals(id, htmlTag.id);

    }


    @Override
    public int hashCode() {
        //return 1; Tvinger til at kalde equals uanset hvad
        //return Objects.hashCode(System.nanoTime()); // giver nyt id hvert milli sekond
        return Objects.hash(id);
    }

    /*
    @Override
    public int compareTo(Object o) {
        Integer i1 = this.hashCode();
        Integer i2 = o.hashCode();
        return i1.compareTo(i2);
    }
    */
}
