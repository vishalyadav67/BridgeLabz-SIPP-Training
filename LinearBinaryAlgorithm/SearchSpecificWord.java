public class SearchSpecificWord {

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; 
            }
        }
        return "Not Found"; 
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The sun rises in the east.",
            "Java is a powerful programming language.",
            "Always stay positive and focused.",
            "Linear search is easy to implement."
        };

        String searchWord = "Java";

        String result = findSentenceWithWord(sentences, searchWord);
        System.out.println("Result: " + result);
    }
}
