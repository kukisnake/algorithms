
public class LargestString {


    public static int solution (String S) {

        String[] splitStrings = S.split("\\?|\\.|\\!");

        int longestNumberOfWords = 0;

        for (String oneWord : splitStrings) {
            oneWord.replaceAll("\\s+","");
            int tempNumberOfWords = 0;
            for (int i=0; i<oneWord.length(); i++) {
                char c = oneWord.charAt(i);
                if (c == ' ') {
                    tempNumberOfWords ++;
                }
            }
            if (tempNumberOfWords > longestNumberOfWords) {
                longestNumberOfWords = tempNumberOfWords;
            }
        }

        System.out.println(longestNumberOfWords);

        return longestNumberOfWords;
    }

    public static void main(String[] args) {
        String S = "We test coders. Give us a try?";

        solution(S);
    }
}
