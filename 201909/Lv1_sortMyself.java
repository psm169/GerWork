import java.util.*;
class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
      ArrayList<String> list = new ArrayList<>();
      for(int i = 0 ; i < strings.length ; i++)
      {
          list.add(strings[i]);
      }
      
      Arrays.sort(strings , new Comparator<String>() {
      
            @Override
            public int compare(String o1, String o2)
            {
                if( o1.charAt(n) > o2.charAt(n))
                    return 1;
                else if (o1.charAt(n) < o2.charAt(n))
                    return -1;
                else
                    return o1.compareTo(o2);
            }
      
      });
      
//       for(int i = 0 ; i = list.size() ; i++)
//       {
//         answer[i] = list.get(i);
//       }
      
      
      return strings;
  }
}