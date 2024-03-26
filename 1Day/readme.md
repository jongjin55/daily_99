
### 1. 수박수박~~
 - '수' 와 '박'을 분리하여 반복횟수에 따라 조정

### 2. 서울에서 김서방찾기
 - 문제에서 'Kim' 한 번만 등장하는 부분에서 equals로 체크
 - (개선) for문 사용없이 .indexOf 함수 사용으로 조금 더 가볍게 적용할 수 있을 거 같음
   - 다른 사람들의 의견은 .indexOf를 사용하기 위해 ArrayList를 생성해 메모리 할당할 필요 없이 배열 자체를 for문을 돌려 푸는 게 더 낫다는 반응이 많았다

### 3. 성격유형 검사
 - 성격유형지에 따른 8개의 유형에 각각의 점수 부여가 필요하다고 판단함 -> Map을 이용하여 구현
 - 7가지 선택지 점수에 대해서 고정된 상수값이라고 생각되서 인덱스 4번부터는 -부호를 붙여줌. -> 3,2,1,0,-1,-1,2,-3
 - 성격유형지표의 순서 또한 고정으로 RT, CF, JM, AN으로 선언
 - 각 8개의 유형에 대해 0으로 초기화가 필요하다고 생각됨

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
        }
   **점수 부여에 대해서 어떻게 처리해야할지 고민에.. 고민한 결과 지금의 결과가 생성됨;;
   
   
