import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if( board[j][moves[i]-1] != 0)
                {
                    if(stack.isEmpty())
                    {
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }

                    int temp = stack.pop();
                    if(board[j][moves[i]-1] == temp)
                    {
                        answer += 2;
                    }
                    else
                    {
                        stack.push(temp);
                        stack.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;    
                    break;
                }
            }
        }
        return answer;
    }
}