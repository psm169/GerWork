class Solution {
  public String solution(String s) {
      String answer = "";
      int chk = (int)s.length();
      int len = (int)s.length()/2;
      if(chk % 2 == 1)
      {
        answer = s.substring(len,len+1);    
      }
      else
          answer = s.substring(len-1,len+1);
      
      
      return answer;
  }
}