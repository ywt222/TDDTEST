import java.util.Arrays;
import java.util.List;

public class Mommyfier {
    private final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    private final String mommyString = "mommy";

    public String mommyfy(String input) {
        if (shouldMommified(input)) {
            String result = "";
            boolean previousCharacterIsVowel = false;
            for (Character c : input.toCharArray()) {
                if (vowels.contains(c)) {
                    if (!previousCharacterIsVowel) {
                        result += mommyString;
                    }
                    previousCharacterIsVowel = true;
                } else {
                    result += c;
                    previousCharacterIsVowel = false;
                }
            }
            return result;
        }
        return input;
    }

    public boolean shouldMommified(String input) {
        double count = 0;
        for (Character c : input.toCharArray()) {
            count += vowels.contains(c) ? 1 : 0;
        }
        double percent = count / (double) input.length() * 100;
        return percent > 30;
    }
}
