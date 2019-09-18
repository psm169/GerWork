class Solution {
  public int solution(long num) {
      int answer = 0;
      long result = num;

      if(num == 1 )
          return 0;

      while( result != 1)
      {          
          result = (result % 2 == 0) ? result / 2 : (result * 3) + 1 ;
          answer++;
          if(answer == 500)
          {
              answer = -1;
              break;
          }
      }


      return answer;
  }
}