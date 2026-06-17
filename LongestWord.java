public class LongestWord {
    public static void main(String[] args) {

        String[] words = {
                "cat",
                "flag",
                "green",
                "country",
                "w3resource"
        };

        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }
    }
}