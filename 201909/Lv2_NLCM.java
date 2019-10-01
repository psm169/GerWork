import java.util.*;
class Solution {
  public int solution(int[] arr) {
      int answer = 0;
      int a , b , r;
      Arrays.sort(arr);
      for(int i = 1 ; i < arr.length ; i++)
      {
          r = 1;
          a = arr[i];
          b = arr[i-1];
          while(r>0){
             //유클리드 호제법을 이용한 GCD(최대공약수)구하기
             r = a % b;
             a = b;
             b = r;
          }
          arr[i] = arr[i] * arr[i-1] / a;


      }
      answer = arr[arr.length - 1];
      return answer;
  }
}