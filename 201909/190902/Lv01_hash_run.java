import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap <String, Integer> hm = new HashMap<String, Integer>();
        
        for(String input : participant)
        {
            if(hm.get(input) == null)
                hm.put(input , 1);
            else
                hm.put(input , hm.get(input)+1);
        }
        for(String input : completion)
        {
            hm.put(input , hm.get(input) - 1);
        }
        for(String data : participant)
        {
            if(hm.get(data) == 1)
            {
                answer = data;
            }
        }
        return answer;
    }
}