import java.util.HashMap;
import java.util.Map;

class Solution {
// 성격유형 검사하기
public String solution(String[] survey, int[] choices) {
	// 계산 쉽게 하기 위해 점수 변형
        int[] score = {3, 2, 1, 0, -1, -2, -3};
        String[] output = {"RT", "CF", "JM", "AN"};
	// 성격유형 점수부여를 위해 Map 사용
        Map<String, Integer> inputMap = new HashMap<>();
        
        inputMap.put("R", 0);
        inputMap.put("T", 0);
        inputMap.put("C", 0);
        inputMap.put("F", 0);
        inputMap.put("J", 0);
        inputMap.put("M", 0);
        inputMap.put("A", 0);
        inputMap.put("N", 0);
        

        int value = 0;
        String str1 = "";
        for(int i=0; i<survey.length; i++) {
            if(score[choices[i]-1] > 0) {
                str1 = String.valueOf(survey[i].charAt(0));
                value = inputMap.get(str1) + score[choices[i]-1];
                inputMap.put(str1, value);
            }else{
                str1 = String.valueOf(survey[i].charAt(1));
                value = inputMap.get(str1) + (score[choices[i]-1]*-1);
                inputMap.put(str1, value);
            }
            inputMap.get(str1);
        }
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;
        for(int i=0; i<4; i++) {
            a = inputMap.get(String.valueOf(output[i].charAt(0)));
            b = inputMap.get(String.valueOf(output[i].charAt(1)));

            if(a<b) {
                sb.append(output[i].charAt(1));
            }else {
                sb.append(output[i].charAt(0));
            }
    
        }
   
        String answer = sb.toString();
        return answer;
    }
}