import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Vremya {
        public Vremya(String t) {
            String[] word = t.split("\\s*(\\s|,|!|\\.)\\s*");
            Pattern p = Pattern.compile("^[0-2][0-9]:[0-5][0-9]");
            for(String w : word){
                Matcher b = p.matcher(w);
                if(b.matches())
                    System.out.println(w);
            }
        }
    }

