import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCount {
    String word;


        public Map<String, Integer> phrase (String word){
            Map<String, Integer> rez = new HashMap<>();

            String[] ar = word.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll("( )+", " ").split(" ");
            for (String str : ar) {
                if (rez.containsKey(str)) {
                    rez.computeIfPresent(str, (k, v) -> v + 1);
                } else rez.put(str, 1);
            }
            return rez;
        }

    }
