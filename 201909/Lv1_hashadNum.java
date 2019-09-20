class Solution {
  public boolean solution(int x) {
      boolean answer = false;
      int result = 0;
      int n = x;
      while( n > 0 )
      {
          result +=  n % 10;
          n = n / 10;
      }

      if( x % result == 0 )
          answer = true;

      return answer;
  }
}