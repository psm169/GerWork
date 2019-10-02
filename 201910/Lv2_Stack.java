import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = new char[s.length()];
        char c;

        Stack<Character> stk = new Stack<>();
        if( s.length() % 2 == 1)
            return false;
        for(int i = 0 ; i < s.length() ; i++)
        {
            arr[i] = s.charAt(i);
        }
        
        if(arr[0] == ')')
        {
            return false;
        }
        for( int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == '(')
            {
                stk.push('(');
            }
            else
            {
                if( !stk.isEmpty() )
                    stk.pop();
                else
                    return false;
            }
                
        }
        if( !stk. isEmpty() )
            return false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}