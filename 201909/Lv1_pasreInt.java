import java.util.*;
class Solution {
  public int solution(String s) {
      int answer = 0;
      
      char buho = s.charAt(0);
      if(buho == '-')
      {
        answer = Integer.parseInt(s.substring(1,s.length()));
	//paserInt는 '-'도 읽음... 메모      
        answer *= -1;
      }
      else
          return Integer.parseInt(s);
      return answer;
  }
}