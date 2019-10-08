import java.util.*;
class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] score = new int[land.length][land[0].length];
        
        for(int i = 0 ; i < land[0].length ; i++)
        {
            score[0][i] = land[0][i];
        }
        
        for(int i = 1 ; i < land.length ; i++)
        {
            for (int j = 0 ; j < 4 ; j++)
            {
                for(int k = 0 ; k < 4 ; k++)
                {
                    if( j != k )
                    {
                        score[i][j] = Math.max( score[i][j] , land[i][j] + score[i-1][k] );
                    }
                }
            }
        }
        
        for(int i=0; i<4; i++)
            answer = Math.max(answer, score[land.length-1][i]);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}