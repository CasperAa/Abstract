import java.util.ArrayList;

public class main2 {

    public static void main(String[] args) {
        ArrayList<HTMLTag> lst = new ArrayList<>();

        /*
        HeaderTag ht = new HeaderTag("h1-2", "Jeg er et h1 tag", 1);
        ht.print();
        HeaderTag ht2 = new HeaderTag("h1-3", "Jeg er et h1 tag", 1);
        ht2.print();

        lst.add(ht);
        lst.add(ht2);

        PTag pt = new PTag("p1", "Jeg er et pTag");

        lst.add(pt);
        */
        for(int i = 1; i<=4; i++){
            HeaderTag ht3 = new HeaderTag("h"+ i, "Jeg er en h" + i, i);
            ArrayList <String> lstcol = HTMLStyle.colors;
            ht3.setColor(lstcol.get(i-1));
            lst.add(ht3);
            for(int k=1; k<=4; k++){
                PTag pt2 = new PTag("p"+ k, "Jeg er pTag nummer: " + k);
                pt2.setColor(lstcol.get(i+1));
                lst.add(pt2);
            }
        }

        for (HTMLTag htt: lst){
            htt.print();
        }
    }
}
