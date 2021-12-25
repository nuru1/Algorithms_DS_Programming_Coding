package leetCode.contests.biweekly_contest_68;

//https://leetcode.com/contest/biweekly-contest-68/problems/maximum-number-of-words-found-in-sentences/
public class MaxWords {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s:sentences){
            String[] words = s.trim().split("\\s+");
            max = max > words.length ? max : words.length;
        }
        return max;
    }
}
