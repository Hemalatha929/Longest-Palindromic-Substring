import java.util.HashMap;

public class Main {
    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String s = "swiss";

        char result = firstNonRepeating(s);

        if (result == '-') {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
    }
}
