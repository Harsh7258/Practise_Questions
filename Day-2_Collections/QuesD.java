import java.util.*;

public class QuesD {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "john", "Bob", "Alice", "BOB");

        // HashSet -> checks duplicates (case-insensitive)
        // ArrayList -> keeps original insertion order
        // First occurrence's original case is preserved

        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String name : names) {
            String lower = name.toLowerCase();
            if (seen.add(lower)) { // add returns false if already exists
                result.add(name);
            }
        }

        for (String name : result) {
            System.out.println("Names: " + name); // John, Alice, Bob
        }
    }
}
