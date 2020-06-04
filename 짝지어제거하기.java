import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        
        for( int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if( !stk.isEmpty() && stk.peek() == c ) stk.pop();
            else stk.push(c);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return stk.isEmpty() ? 1 : 0;
    }
    
}