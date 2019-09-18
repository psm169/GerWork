class Solution {
  public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int big , small;
      if( n > m)
      {
          big = n ; small = m;
      }
      else
      {
          big = m ; small = n;
      }
      
      answer[0] = gcd(big,small);
      answer[1] = big * small / answer[0];
      
      
      
      return answer;
  }
    //최대공약수
    public int gcd(int a , int b)
    {
        while( true )
        {
            int r = a % b;
            if( r == 0 )
                return b;
            else
            {
                a = b;
                b = r;
            }
        }
    }
}