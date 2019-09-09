import java.util.*;
class Solution {
  public String solution(String s) {
      String answer = "";

      ArrayList<Character> list = new ArrayList<>();
      for(int i = 0 ; i < s.length() ; i++)
      {
          list.add(s.charAt(i));
      }
      Collections.sort(list , new Comparator<Character>(){
         @Override
          public int compare(Character a, Character b)
          {
              if( a >= b)
                  return -1;
              else
                  return 1;
          }
      });

      for(char a : list)
          answer = answer + a;

      return answer;
  }
}