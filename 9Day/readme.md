## [1.행렬의 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/12950)
 - 이차원배열을 이용한 간단한 덧셈 문제라고 보여진다

풀면서 어려운 부분은 없었고, 행과 열을 지정하는 부분에서 알아보기 어려워 착각한 경우가 있었다.
        
        행 : arr1.length
        열 : arr2[0].length
        
다른 사람들의 풀이를 보면 대부분 동일하게 풀었지만, 좀 더 명시적으로 써주고 풀어도 될 거 같다는 생각이 든다.

예시. 행과 열이 동일한 문제이기 때문에 max를 써줘도 영향이 없고, 설령 다르다고 하더라도 최종 합을 구하기 때문에 문제는 없다고 생각한다. 


        int rowLength = Math.max(A.length, B.length);
        int colLength = Math.max(A[0].length, B[0].length);

## [2. 기사단원의 무기](https://school.programmers.co.kr/learn/courses/30/lessons/136798#)
 - 문제가 게임처럼 나와서 흥미롭게 보다가도 내용으 보면 이해하기 쉽지 않아서 힘들었다.
 - 결국 이 문제의 핵심은 약수를 구하는 법으로 생각했다.

   기본적으로 생각했을 때 해당 기사단원의 수만큼 약수를 구하려면 한명 한명에게 약수를 구해야 한다고 판단했다.

   그래서 모든 경우의 수를 대입한 풀이법으로 도전했는데 시간초과로 인한 실패..

          for (int i = 1; i <= number; i++) {
                cnt = 0;
                for (int j = 1; j <= number; j++) {
                    if(i%j == 0) {
                        ++cnt;
                    }
                }
                answer += cnt <= limit ? cnt : power;
            }

기사단원의 수가 100,000명인 문제도 있지만 풀이자체에도 시간이 많이 소요되고 있다.

첫번째 for문은 기사단원의 수만큼 체크를 해야하니 수정이 안될 거 같고.. 두번째 for문을 수정해줘야 하는데 어떻게 수정해야할지 감이 안 잡혔다.

결국 검색 찬스!!

한개의 정수의 약수를 구하기 위해서 정수의 제곱근을 활용하거나 정수의 중간값을 활용해 푼다는 걸 볼 수 있었다.

절반의 정수만 구하면 나머지 절반은 대칭적으로 따라오니 시간을 절반을 줄일 수 있었고 약수의 모든 수를 구할 수 있었다.

약수가 홀수개일 경우만 체크를 신경써서 해주면 무난하게 풀릴 수 있는 문제였다.

     for (int i = 1; i <= number; i++) {
            cnt = 0;
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if(i%j == 0) {
                    cnt = i/j==j ? ++cnt : cnt+2;
                }
            }
            answer += cnt <= limit ? cnt : power;
        }

나는 위와 같이 보기 어렵게? 푼거 같은데 다른 사람의 풀이를 보면

    for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
     }

무릎을 탁! 치는 아주 이행하기 쉬운 코드로 풀이를 한 걸 볼 수 있다.

시간도 내가 풀이한 방식에 비해 매우 빠르다

![image](https://github.com/jongjin55/daily_99/assets/44630719/731905e4-c8ea-493d-9b5d-f60ab42d55c9)


