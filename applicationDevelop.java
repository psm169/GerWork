import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //앞기능이 먼저 완성 되기전 까지 뒷 기능은 배포 될 수 없다.
        //queue사용 
        //progresses.i & speeds.i 배포되는 개수 answer++ -> answer[index] = answer , answer = 0;
        
        //미리 계산 arr[ 7 , 3 , 9]를 넣고 while(arr[i] > cmpVal) answer++
        Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
        int arr[] = new int[progresses.length];
        for(int i = 0 ; i < progresses.length ; i++)
        {
            int tmp = 100 - progresses[i];
            
            if( tmp % speeds[i] != 0)
            {
                tmp = tmp / speeds[i] + 1;               
            }
            else
                tmp = tmp / speeds[i];

            arr[i] = tmp;
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            q.add(arr[i]);
        }
        
        List<Integer> result = new ArrayList<Integer>();
        int standard = q.poll();
        int cnt = 1;
        while(!q.isEmpty()) {
            int num = q.poll();
            if(standard >= num) {
                cnt++;
            }else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }
       
        for(int i = 0 ; i < arr.length ; i++)
        {
            q.add(arr[i]);
        }
        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
       
        return answer;
    }
}