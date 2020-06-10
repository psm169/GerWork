import java.util.*;
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int index = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int date = 0 ; date < k ; date++)
        {
            if( index < dates.length && date == dates[index] )
            {
                heap.add(supplies[index++]);
            }
            if( stock == 0 )
            {
                stock = stock + heap.poll();
                answer++;
            }
            stock = stock - 1;
        }
        return answer;
    }
}