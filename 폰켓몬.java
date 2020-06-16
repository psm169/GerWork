import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!hash.containsKey(nums[i]))
            {
                hash.put(nums[i],0);
            }
        }
        if( answer > hash.size() )
            answer = hash.size();
        return answer;
    }
}