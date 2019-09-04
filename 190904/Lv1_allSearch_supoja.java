import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] stu1Ans = {1,2,3,4,5};
        int[] stu2Ans = {2,1,2,3,2,4,2,5};
        int[] stu3Ans = {3,3,1,1,2,2,4,4,5,5};
        
        int[] stuCnt = new int[3];
        
        for(int a = 0 ; a < answers.length ; a++)
        {
            if( stu1Ans[a%5] == answers[a])
                stuCnt[0]++;
            if(stu2Ans[a%8] == answers[a])
                stuCnt[1]++;
            if(stu3Ans[a%10] == answers[a])
                stuCnt[2]++;
        }
        
        int best = stuCnt[0];
        for(int a = 0 ; a < stuCnt.length ; a++)
        {
            if(best < stuCnt[a])
                best = stuCnt[a];
            
        }
        
        
        List<Integer> list = new ArrayList<Integer>();
               
        for(int a = 0 ; a < 3 ; a++)
        {
            if(best == stuCnt[a])
            {
                list.add(a+1);
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer; 
    }
}