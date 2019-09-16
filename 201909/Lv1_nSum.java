class Solution {
  public int solution(int n) {
      int answer = 0;

      if(n==0){
          return 0;
      } else {
      for(int i = 1; i<=n/2; i++){
          if(n%i==0){
              answer += i;
          }
      }   
      return answer;}
  }
}