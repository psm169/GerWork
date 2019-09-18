import java.util.*;
class Solution {
  public String solution(String s) {
      String answer = "";
      char chk ;
      ArrayList<String> list = new ArrayList<>();
      for(int i = 0 ; i < s.length(); i++)
      {
    	  chk = s.charAt(i);
          if( chk == 32 )
          {
              list.add(answer);
              answer = "";
          }
          else
              answer = answer + s.charAt(i);
          if(i == s.length() - 1)
              list.add(answer);
      }
      answer = "";
      for(int i = 0 ; i < list.size(); i++)
      {
          String a = list.get(i);
          for(int j = 0 ; j < a.length(); j++)
          {
              if( (j+1) % 2 == 1 )
                  answer = answer + Character.toUpperCase(a.charAt(j));
              else
                  answer = answer + Character.toLowerCase(a.charAt(j));
          }
          if(i != list.size()-1)
            answer = answer + " ";
      }
      
      
      return answer;
  }
}