import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        String[] Alphabets = {};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTYVWXYZ";
        ArrayList<Character> arr = new ArrayList<>();
        int moveRight = 0;
        int moveLeft = 0;
        int cnt = 1;
        int alphaCnt = 0;
        int mid = 0;
        //calculate Move
        for(int i = 0 ; i < alphabet.length() ; i++)
        {
            arr.add(alphabet.charAt(i));
        }
        
        int minMove = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1;
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }
        
        
        
        //alphabet
        // for(int i = 0 ; i < name.length() ; i++)
        // {
        //     int idx = arr.indexOf(name.charAt(i));
        //     if( idx >= 13)
        //     {
        //         idx = 26 - idx;
        //         System.out.println(idx);
        //         alphaCnt += idx;
        //     }
        //     else
        //     {
        //         System.out.println(idx);
        //         alphaCnt += idx;
        //     }
        // }
        int ans = 0;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i)!= 'A') {
                int up = name.charAt(i) - 'A';
                int down = 1 + 'Z' - name.charAt(i);
                ans += (up < down)? up : down;
            }
        }

        answer = ans+ minMove;
        
        return answer;
    }
}