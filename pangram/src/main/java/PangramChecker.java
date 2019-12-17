
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        return input.chars()
                .filter(Character::isLetter).map(Character::toLowerCase).distinct().count()==26;
    }



}
