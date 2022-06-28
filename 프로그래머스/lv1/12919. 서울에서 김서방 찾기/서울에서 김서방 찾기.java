class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String k = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                k = Integer.toString(i);
                break;
            } 
        }
        answer = "김서방은 " + k + "에 있다";
        return answer;
    }
}