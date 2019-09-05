import java.util.*;
class Solution {
    public int solution(int[][] baseball) {
        int answer = 0;
        boolean flag = true;
        Stack<String> stk = new Stack<>();
        for(int i = 1 ; i < 10 ; i++)
        {
            for(int j = 1 ; j < 10 ; j ++)
            {
                for( int k = 1 ; k < 10 ; k++)
                {
                    if(i != j && j != k && k != i)
                    {
                        stk.add(String.valueOf(i*100+j*10+k));
                    }
                }
            }
        }
        
        while(!stk.isEmpty())
        {
            String temp = stk.pop();
            for(int i = 0; i < baseball.length && flag; i++)
            {
                int strike = strike( temp , String.valueOf(baseball[i][0]) );
                int ball = ball( temp , String.valueOf(baseball[i][0])) - strike ;
                if( strike != baseball[i][1] || baseball[i][2] != ball)
                {
                    flag = false;
                }
            }
                
                if(flag)
                {
                    answer++;
 
                }
                flag = true;
        }
        
        
        
        return answer;
    }
    public int strike(String n , String target)
    {
        int ans = 0;
        for(int i = 0 ; i < target.length() ; i ++)
        {
            char chN = n.charAt(i) ;
            char chT = target.charAt(i);
            if(chN == chT)
            {
                ans++;
            }
        }
        return ans;
    }
    
    public int ball(String n , String target)
    {
        int ans = 0 ;
        for(int a = 0 ; a < target.length() ; a++)
        {
            ans = n.contains(String.valueOf(target.charAt(a))) ? ans + 1 : ans ;
        }
        
        return ans;
    }
}