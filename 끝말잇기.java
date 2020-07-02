import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String,Integer> hash = new HashMap<>();
        int index = 1 ;
        int times = 1 ;
        char temp = words[0].charAt(words[0].length()-1);
        boolean flag = false;

        for( String word : words)
        {
            hash.put(word,0);
        }
        
        for( int i = 0 ; i < words.length ; i++)
        {
            
            if(hash.get(words[i]) != 2 ){
                hash.put(words[i] , hash.get(words[i]) + 1 );
            }
            
            if(i > 0)
            {
                if( hash.get(words[i]) == 2 || temp != words[i].charAt(0) )
                {
                    flag = true;
                    break;
                }
            }
            
            
            if( index == n )
            {
                index = 0;
                times++;
            }
            index++;
            
            temp = words[i].charAt(words[i].length()-1);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        if(flag)
        {
            answer[0] = index;
            answer[1] = times;
        }
        return answer;
    }
}