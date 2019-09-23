class Solution {
  public String solution(int n) {
      String answer = "";
      int num = n;
      while(num > 0)
      {
          
          int a = num % 3;
          num = num / 3;
          if(a == 0)
          {
              a = 4 ;
              num = num - 1;
          }
          answer = a + answer;
      }
      return answer;
  }
}