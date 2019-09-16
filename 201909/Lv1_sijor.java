class Solution {
  public String solution(String s, int n) {
      String answer = "";
      int tmp ;
      for(int i = 0 ; i < s.length() ; i++)
      {
          tmp = (int)s.charAt(i);
          if(tmp == 32 )
          {
              answer = answer + (char)tmp;
              continue;
          }
          else if ( tmp >= 65 && tmp <= 90)
          {
              if(tmp + n > 90)
                  tmp = tmp + n - 26;
              else
                  tmp = tmp + n;
              answer = answer + (char)tmp;
          }
          
          else if( tmp >= 97 && tmp <= 122 )
          {
              if(tmp + n > 122)
                  tmp = tmp + n - 26;
              else
                  tmp = tmp + n;
              answer = answer + (char)tmp;
          }
      }
      
      return answer;
  }
}