import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> word = new ArrayList<>();
       for (int i = 0; i < strings.length; i++) {
            word.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(word);
        for(int i=0; i<word.size(); i++){
            answer[i] = word.get(i).substring(1, word.get(i).length());
        }
        
        return answer;
    }
}