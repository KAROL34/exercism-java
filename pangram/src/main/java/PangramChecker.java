
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        return input.chars()
                .filter(Character::isLetter).map(Character::toLowerCase).distinct().count()==26;
    }

    public static void main(String[] args) {
        String aaa="a quick movement of the enemy will jeopardize five gunboats";
        System.out.println(aaa.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count());
    }

}
