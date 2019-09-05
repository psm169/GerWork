import java.util.*;
class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int sum = red + brown;
//가로 >= 세로
//         행렬 ㅁㅁㅁㅁ 행 <= 열
// R1 - B8 / 3,3 // R2 - B10 / 4,3
// R3 B12 / R4 - 12 / R5 - 16 / R6 - 14 / R7 - 20 / R8 - 16 / R9 - B 16/
// 15     / 16      / 21      / 20      / 27      / 24      / 25
// 5,3    / 4,4     / 7,3     / 5,4     / 9,3     / 6,4     / 5,5
        if(red == 1)
        {
            answer[0] = 3 ;
            answer[1] = 3 ;
            return answer;
        }
        if(red==2)
        {
            answer[0] = 4;
            answer[1] = 3;
            return answer;
        }
        int temp = red + brown;
        for (int i = 3 ; i <= Math.sqrt(red+brown) ; i++)
        {
            
            if(sum % i == 0)
            {
                int x = sum / i;
                if((x-2)*(i-2) == red)
                {
                    answer[0] = x;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}