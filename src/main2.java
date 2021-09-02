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
            atag.setUrlName(lstLinks.get(j-1).substring(8));
            atag.setColor(lstcol.get(1));
            atag.setRed(220);
            atag.setGreen(220);
            atag.setBlue(220);
            lst.add(atag);
        }

        int count = 0;
        for(int i = 1; i<=5; i++){
            HeaderTag headerTag = new HeaderTag("h"+ i, "Jeg er en h" + i, i);
            ArrayList <String> lstcol = HTMLStyle.colors;
            headerTag.setColor(lstcol.get(i-1));
            headerTag.setRed(headerTag.randomInt(253,0));
            headerTag.setGreen(headerTag.randomInt(253,0));
            headerTag.setBlue(headerTag.randomInt(253,0));
            lst.add(headerTag);
            for(int k=1; k<=200; k++){
                PTag pTag = new PTag("p"+ k, "Jeg er pTag nummer: " + (k+count));
                pTag.setColor(lstcol.get(headerTag.randomInt(19,0)));
                pTag.setRed(headerTag.randomInt(253,0));
                pTag.setGreen(headerTag.randomInt(253,0));
                pTag.setBlue(headerTag.randomInt(253,0));
                lst.add(pTag);
            }
            count += 200;
        }





        for (HTMLTag htt: lst){
            htt.print();
        }
    }
}
