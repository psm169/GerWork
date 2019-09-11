class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      
      int idx = s.length();
      
      if( idx !=4  && idx !=6 )
          return false;
      
      for(int i = 0 ; i < idx ; i++)
      {
          if((s.charAt(i) >= 64 && s.charAt(i) <= 90 ) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
              return false;
      }
      
      return answer;
  }
}