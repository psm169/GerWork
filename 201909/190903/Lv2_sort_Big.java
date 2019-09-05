import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] Snums = new String[numbers.length];
        
        for(int i = 0 ; i < numbers.length ; i++)
        {
            Snums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(Snums, new Comparator<String>() {
           @Override
            public int compare(String o1 , String o2)
            {
                if(o1.length() == o2.length()) //3 , 30 -> 303x / 330 o 로 변경
                {
                    return o2.compareTo(o1);
                }
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(Snums.length > 0 && Snums[0].equals("0")) // desc의 경우 0이 왔을때 무조건 0
            answer = "0";
        else
        {
            StringBuilder sb = new StringBuilder();
            for(String n : Snums)
            {
                sb.append(n);
            }
            answer = sb.toString();
        }
        
        return answer;
    }
}