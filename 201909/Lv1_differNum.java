import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int[] answer = {};
        //0,1,2,3,4,5,6,7,8,9
        
        int idx = arr.length ;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < idx -1 ; i++)
        {
            if(arr[i] != arr[i+1])
            {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        
        answer = new int[list.size()];
        for(int num = 0 ; num < list.size() ; num++)
        {
            answer[num] = list.get(num);
        }
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");

        return answer;
	}
}