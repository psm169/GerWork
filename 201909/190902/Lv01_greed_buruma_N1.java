import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int keep = 0;
        int resv = 0;
        //lost and reserve
        for(int i = 0 ; i < lost.length ; i++)
        {
            for(int j = 0 ; j < reserve.length ; j++)
            {
                if(lost[i] == reserve[j])
                {
                    reserve[j] = -100;
                    lost[i] = -100;
                    keep++;
                    break;
                }
            }
        }
        
        for(int i = 0 ; i < lost.length ; i++)
        {
            for(int j = 0 ; j < reserve.length ; j++)
            {
                if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1)
                {
                    resv++;
                    reserve[j] = -100;
                    break;
                }
            }
        }
        answer = n - lost.length + keep + resv;
        return answer;
    }
}