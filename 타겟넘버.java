class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        return sol(numbers , 0 , 0 , target);
    }
    public int sol(int[] numArr , int idx, int sum , int target){
        //탐색끝?
        if( numArr.length == idx )
        {
            if ( target == sum )
                return 1;
            else
                return 0;
        }
            return sol(numArr, idx+1 ,sum + numArr[idx] , target) + sol(numArr, idx+1, sum-numArr[idx], target);
    }
}