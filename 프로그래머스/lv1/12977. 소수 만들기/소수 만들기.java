class Solution {
    public int solution(int[] nums) {
        int answer = 0, num = 0;
        boolean chk = false;
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j +1; k<nums.length; k++){
                    num = nums[i] + nums[j] + nums[k];
                    if(num >= 2) chk = decimal(num);
                    if(chk == true) answer++;
                }
            }
        }
        return answer;
    }
    public boolean decimal(int num){
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}