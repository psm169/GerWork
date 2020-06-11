class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n == 1 )
        {
            return 1;
        }
        if ( n == 2)
        {
            return 2;
        }
        if ( n == 3 )
        {
            return 3;
        }
        int a = 3 ;
        int b = 2 ;
        for(int i = 4 ; i <= n ; i++ )
        {
            answer = ( a + b ) % 1000000007;
            b = a;
            a = answer;
        }
        return answer;
    }
}