class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cntP = 0;
        int cntY = 0;

        for(int a = 0 ; a < s.length() ; a++)
        {
            char chk = s.charAt(a);
//            if (chk.equals('P') || chk.equals('p'))
            if(chk == 'P' || chk == 'p')
                cntP++;
//            else if(chk.equals('Y') || chk.equals('y'))
            else if(chk == 'Y' || chk == 'y')
                cntY++;
        }
        if(cntP == cntY)
            answer = true;
        else
            answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}