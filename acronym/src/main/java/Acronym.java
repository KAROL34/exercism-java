import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Arrays.stream(phrase.replaceAll("[^A-Za-z -]", "")
                .split("\\W+"))
                .map(x -> x.charAt(0)).
                        map(x -> x.toString().
                                toUpperCase()).
                        collect(Collectors.joining());
    }


}
