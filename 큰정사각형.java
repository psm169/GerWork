class Solution
{
    public int solution(int [][]board)
    {
        int answer = board[0][0];
        int lenX = board[0].length;
        int lenY = board.length;

        for(int row = 1 ; row < lenY ; row++)
        {
            for(int col = 1 ; col < lenX ; col++ )
            {
                if( board[row][col]==1){
                    int up = board[row-1][col];
                    int left = board[row][col-1];
                    int upleft = board[row-1][col-1];
                    int temp = Math.min( Math.min(up, left) , upleft);
                    board[row][col] = temp + 1; 
                }
            }
        }
        int max = board[0][0];
        for(int i = 0 ; i < lenY ; i++)
        {
            for(int j = 0 ; j < lenX ; j++)
            // {
            //     if(max < board[i][j])
            //         max = board[i][j];
            // }
            {
                if( board[i][j] > 0)
                {
                    answer = Math.max(answer , board[i][j]);
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer * answer;
    }
}