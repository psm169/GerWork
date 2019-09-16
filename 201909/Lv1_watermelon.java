class Solution {
  public String solution(int n) {
      String answer = "";
      int a = (int)n/2;
      for(int i = 0 ; i < a ; i++)
      {
          answer = answer + "¼ö¹Ú";
      }
      if(n % 2 == 1)
          answer = answer + "¼ö";
      return answer;
  }
}