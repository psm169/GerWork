class Solution {
        public String solution(String s) {
            String answer = "";
            s = s.toLowerCase();
            String[] a = s.split(" ");
            for (int i = 0; i < a.length; i++) {
                if(a[i].length() >= 1 ){

                    char[] array = a[i].toCharArray();
                    array[0] = Character.toUpperCase(array[0]);

                    a[i] = new String(array);
                }
            }
            
            answer = a[0];
            for (int i = 1; i < a.length; i++) {
                answer += " " + a[i];
            }
            // for(int i = 0 ; i < a.length ; i++)
            // {
            //     answer += a[i] + " ";
            // }
            System.out.print(answer);

            return answer;

	//case8. 오답
    }
}

/* Solution Ver 
//--공백이 두개 이상일 경우가 있었습니다--
class Solution {
  public String solution(String s) {
	      String answer = "";
	      s = s.toLowerCase(); // 일단 전체 소문자 처리
	      int flag = 0;
	      
	      for(int i = 0; i<s.length(); i++) {
	    	  if(s.substring(i, i+1).equals(" ")) {
	    		  flag = 0; // 띄어쓰기 나오면 flag = 0 처리
	    	  }
	    	  
	    	  if(flag == 0 && !s.substring(i, i+1).equals(" ")) { // flag가 0인 상태에서 잘라낸 값이 " "가 아니라면
	    		  answer = answer + s.substring(i, i+1).toUpperCase(); // 대문자로 변환해서 answer에 붙임
	    		  flag++; // 다음 값은 소문자로 나올 것
	    	  } else {
	    		  answer = answer + s.substring(i, i+1).toLowerCase();
	    	  }
	      }
	      
	      return answer;
  }
}


*/

