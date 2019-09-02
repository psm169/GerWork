class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean flag;
        for(String find : participant)
        {
            flag = true; //true is find 
           for(int i = 0 ; i < completion.length ; i++)
           {
               if(find.equals(completion[i]))
               {
                   flag = false;
                   completion[i] = "";
                   break;
               }
               
           }
            if(flag)
                answer += find;
            
        }
        
        return answer;
    }
}