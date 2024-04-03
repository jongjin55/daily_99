## [1.행렬의 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/12950)
 - 이차원배열을 이용한 간단한 덧셈 문제라고 보여진다

풀면서 어려운 부분은 없었고, 행과 열을 지정하는 부분에서 알아보기 어려워 착각한 경우가 있었다.
        
        행 : arr1.length
        열 : arr2[0].length
        
다른 사람들의 풀이를 보면 대부분 동일하게 풀었지만, 좀 더 명시적으로 써주고 풀어도 될 거 같다는 생각이 든다.

예시. 행과 열이 동일한 문제이기 때문에 max를 써줘도 영향이 없고, 설령 다르다고 하더라도 최종 합을 구하기 때문에 문제는 없다고 생각한다. 


        int rowLength = Math.max(A.length, B.length);
        int colLength = Math.max(A[0].length, B[0].length);


