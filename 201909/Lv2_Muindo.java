import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;
        int j ;
        Arrays.sort(people);
        for( j = people.length - 1 ; j > i ; j--)
        {
            if( people[j] + people[i] <= limit)
            {
                answer++;
                i++;
            }
            else
            {
                answer++;
            }
            
        }
        if(i == j)
                answer++;
        
        return answer;
    }
}