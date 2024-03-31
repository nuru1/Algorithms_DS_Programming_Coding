public class ReverseWords {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        String s1 = "";
        for (int i = words.length-1; i>=0 ; i--){
            s1 = s1 + words[i] + " ";
        }
        return s1.trim();
    }
}

