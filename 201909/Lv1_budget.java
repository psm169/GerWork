import java.util.*;
class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;
      int cmp = 0;
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0 ; i < d.length ; i++)
      {
          list.add(d[i]);
      }
      Collections.sort(list);
      for(int i = 0 ; i < d.length ; i++)
      {
          cmp = cmp + list.get(i);
          if(cmp <= budget)
              answer++;
          else
              break;
          
      }
      return answer;
  }
}