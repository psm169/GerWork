class Solution {
  public long solution(long n) {
      long answer = 0;
      double tmpN = Math.sqrt(n);
      int cmpN = (int)tmpN;
      long cmp = 0;

      if(cmpN != tmpN)
      {
          return -1;
      }

      else
      {
          answer = (long)Math.pow(tmpN + 1 ,2);
      }

      return answer;
  }
}