import java.awt.dnd.DragGestureEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

    public static Map readUrl (String urlin, ArrayList<String> words) throws Exception{
        URL url = new URL(urlin);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        Map <String, Integer> mp = new HashMap<>();
        for(String s: words) {
            mp.put(s,0);
        }
        String urlstr = "";
        while (urlstr != null) {
            for (String sord : words) {
                int i1 = urlstr.indexOf(sord);
                if (i1 > 0) {
                    Integer i = mp.get(sord);
                    i++;
                    mp.put(sord, i);
                }
                urlstr = br.readLine();
            }
        }
        br.close();
        return mp;
    }

    public static Map<String, Map<String, Integer>> getNyheder(ArrayList<String> ord) throws Exception{
        ArrayList <String> urls = new ArrayList<>();
        urls.add("https://dr.dk/");
        urls.add("https://ekstrabladet.dk/");
        urls.add("https://berlinske.dk/");
        urls.add("https://bt.dk/");
        Map<String, Map<String, Integer >> nyheder = getNyheder(ord);

        Set<String> sset2 = nyheder.keySet();

        for(String s: sset2){
            System.out.println(s);
        }
        return nyheder;
    }

    public static void main(String[] args) throws Exception{

        ArrayList <String> ord = new ArrayList<>();
        ord.add("DBU");
        ord.add("vold");
        ord.add("Vacine");
        ord.add("VM");
        ord.add("Danmark");

        Map <String, Map<String, Integer>> nyheder = getNyheder(ord);
            Set<String> sset2 =  nyheder.keySet();

            for( String s: sset2){
                System.out.println("På " + s + " er føglende ord brugt: ");
                Map <String, Integer> wmap = nyheder.get(s);
                Set<String> sset3 = wmap.keySet();

                for(String s2: sset3){
                    int n = wmap.get(s2);
                    String sn = "der står " + s2 + " " + n + " gange";
                    System.out.println(sn);
                }


            }

            Map<String, HTMLTag> map = new HashMap<>();

            PTag p1 = new PTag("p1", "Jeg er p1");
            PTag p2 = new PTag("p2", "Jeg er p2");

            map.put(p1.getId(), p1);
            map.put(p2.getId(), p2);

            HTMLTag ht1 = map.get("p1");
            //ht1.print();
    }
}
