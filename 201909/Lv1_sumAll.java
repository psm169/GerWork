import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int all = n;
        int div = 0;
        while(true)
        {
            if( all == 0 )
                break;
            
            answer = answer + all % 10;
            all = all/10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}