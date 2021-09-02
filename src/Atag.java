import java.util.ArrayList;

public class Atag extends HTMLStyle {

    private String url;
    public static ArrayList<String> links;

    public Atag(String id, String text) {
        super(id, text);
        links = new ArrayList<>();
        links.add("https://github.com/");
        links.add("https://stackoverflow.com/");
        links.add("https://youtube.com/");
        links.add("https://reddit.com/");
        links.add("https://google.com/");
        links.add("https://amazon.com/");
        links.add("https://edition.cnn.com/");
        links.add("https://bbc.com/");
        links.add("https://yahoo.com/");
        links.add("https://imdb.com/");
        links.add("https://pinterest.com/");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


//<a href="https://www.dr.dk/">Link til DR<a></a>


    @Override
     String toHTMLstring() {
        return "<a " + this.toSyleString() + ' ' + " href" + "=\"" + this.getUrl() + "\">" + this.getText() + "<a></a>";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLstring());
    }
}
