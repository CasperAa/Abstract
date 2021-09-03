import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main4 {

    public static void main(String[] args) {

        Set<String> strset= new HashSet<>(); //Ecols metode
        strset.add("erik");
        strset.add("jon");
        System.out.println("size= " + strset.size());

        strset.add("erik");
        strset.add("jon");
        System.out.println("size= " + strset.size());



       /*
       boolean b = strset.contains("erik");
       System.out.println(b);
       System.exit(1);
       */

        Set <HTMLTag> pset = new HashSet<>();
        PTag p1 = new PTag("p1", "Jeg er et p1 tag");
        PTag p2 = new PTag("p2", "jeg er et p2 tag");

        pset.add(p1);
        pset.add(p2);

        PTag p3 = new PTag("p1", "Jeg er et p1 tag");
        PTag p4 = new PTag("p2", "jeg er et p2 tag");

        pset.add(p3);
        pset.add(p4);

        pset.clear();

        for(int i = 0; i < 100; i++){
            PTag pmany = new PTag("p" + i, "Jeg er er pTag ID= " + i);
            pset.add(pmany);
        }

        for(HTMLTag t: pset){
            t.print();
        }

        Set <HTMLTag> sortet = new TreeSet<>(pset);


    }
}
