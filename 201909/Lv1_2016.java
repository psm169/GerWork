class Solution {
  public String solution(int a, int b) {
      String answer = "";
      int Year = 2016;
      int Month = a;
      int Day = b;
      int Cal = 0 ;
      String[] days = { "FRI" , "SAT", "SUN" , "MON" , "TUE" , "WED" , "THU"}; 
      int[] mons = { 0 ,31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
      //À±³â ( y % 4 == 0 ) && ( y % 100 != 0 ) || ( y % 400 == 0 )
      for(int i = 0 ; i < Month ; i++)
      {
          Cal = Cal + mons[i];
      }
      Cal += b - 1;
      Cal = Cal % 7;
      answer = days[Cal];
      
      
      return answer;
  }
}