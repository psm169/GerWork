import java.util.*;
class Solution {
  public long solution(long n) {
      long answer = 0;
      ArrayList<Long> list = new ArrayList<>();
      
      while(n > 0)
      {
          list.add(n % 10);
          n = n / 10;
      }
      
      Collections.sort(list , new Comparator<Long>(){
         @Override
          public int compare(Long a , Long b)
          {
              if( a > b )
                  return -1;
              else if (a < b)
                  return +1;
              else
                  return 0;
          }
      });
      
      for(int i = 0 ; i < list.size(); i++ )
      {
          answer = answer * 10 + list.get(i);
      }
      
      return answer;
  }
}