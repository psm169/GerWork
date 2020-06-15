class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 2 )
            return 1;
        int bf = 1;
        int bff  = 1;
        for(int i = 2 ; i < n ; i++)
        {
            answer =( bf + bff ) % 1234567;
            bff = bf;
            bf = answer;
        }
        return answer;
    }
}