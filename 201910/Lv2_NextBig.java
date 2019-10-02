class Solution {
  public int solution(int n) {
      int answer = n + 1;
      int num = n;
      int Ncnt = 0;
      int cnt = 0;
      
      int tmp ;
      
      // n count ;
      while( num > 0)
      {
          if(num % 2 == 1)
              Ncnt++;
          num = num / 2;
      }
      int i = 1;
      num = n;
      while( true )
      {
          answer = num + i ;
          cnt = 0;
          while( answer > 0)
          {
            if( answer % 2 == 1 )
                cnt++;
            answer = answer/2;
          }
          
          if( cnt == Ncnt)
          {
              answer = num + i;
              break; 
          }
              
          i++;
          
      }
      return answer;
  }
}