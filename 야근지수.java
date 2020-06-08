import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> hard = new PriorityQueue<>(Collections.reverseOrder());
        
        for( int work : works )
        {
            hard.offer(work);
        }
        
        while( n != 0 )
        {
            int max = (int)hard.poll();
            if( max <= 0) break;
            hard.offer(max-1);
            n--;
        }
        
        while( !hard.isEmpty() )
        {
            answer = answer + (long)Math.pow(hard.poll() , 2);
        }
            
        
        return answer;
    }
}