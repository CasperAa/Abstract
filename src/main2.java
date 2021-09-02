import java.util.ArrayList;
import java.util.Random;

public class main2 {

    public static void main(String[] args) {
        ArrayList<HTMLTag> lst = new ArrayList<>();


        for(int j = 1; j<=11; j++){
            Atag atag = new Atag("a"+j, "Link: " + j);
            ArrayList <String> lstLinks = Atag.links;
            ArrayList <String> lstcol = HTMLStyle.colors;
            atag.setUrl(lstLinks.get(j-1));
            atag.setColor(lstcol.get(j-1));
            atag.setRed(atag.randomInt());
            atag.setGreen(atag.randomInt());
            atag.setBlue(atag.randomInt());
            lst.add(atag);
        }

        for(int i = 1; i<=5; i++){
            HeaderTag headerTag = new HeaderTag("h"+ i, "Jeg er en h" + i, i);
            ArrayList <String> lstcol = HTMLStyle.colors;
            headerTag.setColor(lstcol.get(i-1));
            headerTag.setRed(headerTag.randomInt());
            headerTag.setGreen(headerTag.randomInt());
            headerTag.setBlue(headerTag.randomInt());
            lst.add(headerTag);
            for(int k=20; k>=1; k--){
                PTag pTag = new PTag("p"+ k, "Jeg er pTag nummer: " + k);
                pTag.setColor(lstcol.get(k-1));
                pTag.setRed(headerTag.randomInt());
                pTag.setGreen(headerTag.randomInt());
                pTag.setBlue(headerTag.randomInt());
                lst.add(pTag);
            }
        }





        for (HTMLTag htt: lst){
            htt.print();
        }
    }
}
