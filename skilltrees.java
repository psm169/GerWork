import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0 ; i < skill_trees.length ; i++)
        {
            boolean flag = true;
            String[] skillChar = skill_trees[i].split("");
            int index = 0 ;
            
            for( int j = 0 ; j < skillChar.length ; j++){
                 System.out.print(skill.indexOf(skillChar[j]));
                if( index == skill.indexOf(skillChar[j]))
                {
                   
                    index++;
                }
                else if( index < skill.indexOf(skillChar[j]))
                {
                    flag = false;
                    break;
                }
                
            }
            
            if(flag)
                answer++;
        }
         
        return answer;
    }
    
   
}