class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long max = (long)w;
        long min = (long)h;
        if( max < min)
        {
            long t = max;
            max = min;
            min = t;
        }
        long val = 1;
        while( val > 0 )
        {
            val = max % min;
            max = min;
            min = val;
        }//최대공약수
       
        answer = ( (long)w * (long)h ) - ( (long)w+(long)h - max );
        
        return answer;
    }
}