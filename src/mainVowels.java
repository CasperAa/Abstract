import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class mainVowels {

        public static String getVowels(String str){
            ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o', 'u', 'æ','ø','å'));

            char [] charr = str.toCharArray();

            Set<Character> chset = new HashSet<>();

            for(char c: charr){
                //System.out.println(c);
                boolean b = vowels.contains(c);
                if (b){
                    chset.add(c);
                }
            }

            String res = chset.toString();

            return res;
        }


        public static void main(String[] args) {

            String va = getVowels("Jeg er en hårdtarbejdende studerende");
            System.out.println(va);
            String vb = getVowels("Jeg er en høne");
            System.out.println(vb);
            String vc = getVowels("Jeg er en Hund");
            System.out.println(vc);
        }

    }

