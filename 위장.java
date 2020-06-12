import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hash = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i++)
        {
            if(hash.containsKey(clothes[i][1])){
                hash.replace( clothes[i][1] , hash.get(clothes[i][1]) + 1);
            }
            else
            {
                hash.put(clothes[i][1] , 1);
            }
        }
        
        for( int i : hash.values()){
            answer *= ( i + 1 ) ;
        }
        answer -= 1;
        
        
        return answer;
    }
}