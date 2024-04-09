## [1.나누어 떨어지는 숫자 배열](https://school.programmers.co.kr/learn/courses/30/lessons/12910)
 - 문제만 보면 쉽게 풀 수 있을 거 같은 느낌이 드는 부분인데.. 풀리는 게 쉽지 않다.
 - Stream을 이용해 배열을 처리하려고 했지만.. 처리하기가 익숙치 않았다.
 - 결국 단순하게 for문을 이용해 값을 구분해주고 마지막에 Stream을 이용해 int 배열을 만들어 반환해주었다.

다른 사람의 풀이를 보니.. 

          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);

깔끔하다. 저렇게 코드를 짜고 싶다는 마음이.. ㅜ


## [2. 행렬의 곱셈](https://school.programmers.co.kr/learn/courses/30/lessons/12949)
 - 행렬.. 예전 수학적 지식이 떠오르지 않아 무지 고민했다.
 - 생각나지 않더라도 계속 노가다를 해서 풀어보려고 했지만 끝내 포기했음;;
 - 행렬 공식에 대해 찾아보니

![image](https://github.com/jongjin55/daily_99/assets/44630719/f5c0f60c-6e25-467d-8df9-0626ee7bd2b5)

출처: https://mathbang.net/562#gsc.tab=0

앞 행렬의 열과 뒷 행렬의 행이 같은 값이라는 게 규칙이었다. 그래서 .. 풀수가 없었다;

삼중 for문을 이용해 쉽게 풀 수 있었는데 좀더 축약할 수 있은 방법이 있지 않을까 하는 아쉬움이 있다.
