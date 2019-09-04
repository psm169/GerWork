import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        permutation("", numbers ,set);
        
        while(set.iterator().hasNext())
        {
            int a = set.iterator().next();
            set.remove(a);
            if(a == 2)
                answer++;
            if(isSosu(a) && a%2 != 0)
                answer++;
            
        }
        
        
        return answer;
    }
    
    public boolean isSosu(int num)
    {
        if(num == 0 || num == 1) return false;
        for(int i = 3 ; i <= (int)Math.sqrt(num) ; i = i+2)
        {
            if( num % i == 0 )
                return false;
        }
        
        return true;
    }
    
    public void permutation(String pre , String str , HashSet<Integer> set)
    {
        int n = str.length();
        if(!pre.equals("")) set.add(Integer.valueOf(pre));
        for(int i = 0 ; i < n ; i++)
        {
            permutation(pre + str.charAt(i) , str.substring(0,i) + str.substring(i+1, n) , set);
        }
    }
}