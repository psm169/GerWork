class Solution {
  public String solution(String[] seoul) {
      String answer = "";
      int i = 0;
      for(i = 0 ; i < seoul.length ; i++)
      {
          if(seoul[i].equals("Kim"))
              break;
      }
      answer = "�輭���� " + i + "�� �ִ�";
      return answer;
  }
}