class Solution {
  public String solution(int n) {
      String answer = "";
      int a = (int)n/2;
      for(int i = 0 ; i < a ; i++)
      {
          answer = answer + "����";
      }
      if(n % 2 == 1)
          answer = answer + "��";
      return answer;
  }
}