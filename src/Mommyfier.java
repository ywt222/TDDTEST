public class Mommyfier {

    public String mommyfy(String input) {
        String mommyString = "mommy";
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < vowels.length; i++) {
            if (input.equals(vowels[i])) {
                return mommyString;
            } else if (input.contains(vowels[i])) {
                String[] parts = input.split(vowels[i]);


                String result = parts[0] + mommyString+ parts[1];
                return result;
            }
        }
        return input;
    }
}
