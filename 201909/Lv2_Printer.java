import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int loc = location;
        int cmp = 0;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i  = 0 ; i < priorities.length ; i++)
        {
            list.add(priorities[i]);
        }
        
        while( !list.isEmpty() )
        {
            int nowPriority = list.get(0);
            for(int i = 1 ; i < list.size() ; i++)
            {
                if( nowPriority < list.get(i))
                {
                    if (loc == 0 )
                    {
                        loc = list.size()-1; 
                    }
                    else
                        loc--;
                
               
                list.remove(0);
                list.add(nowPriority);
                nowPriority = 0;
                break;
                }
                
                
            }
            
            if(nowPriority != 0)
            {
                list.remove(0);
                answer++;
                if(loc == 0 )
                    break;
                else
                    loc--;
            }
        }
        
        
        return answer;
    }
}