import java.util.*;

public class IdentifyCharNum {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                // Repeat the last character 'count' times
                if (result.length() > 0) {
                    char last = result.charAt(result.length() - 1);
                    for (int j = 0; j < count - 1; j++) {
                        result.append(last); // Add the character count-1 times
                    }
                }
            } else {
                result.append(ch); // Add the character to result
            }
        }

        System.out.println(result.toString());
        ss.close();
    }
}
