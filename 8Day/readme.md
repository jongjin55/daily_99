
## [1.음양더하기](https://school.programmers.co.kr/learn/courses/30/lessons/76501)
- 음수와 양수와 크기가 동일한 상태서 부호에 따라서 계산하면 되는 간단한 문제라 생각했다.

배열 인덱스를 가져가야하기 때문에 for문으로 어렵지 않게 구현할 수 있었다.

        for (int i = 0; i < signs.length; i++) {                
            if(signs[i]) {
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            } 
        }

다른 사람들 풀이를 보면서 탁! 무릎을 친게 삼항연산자!를 이용해 깔끔하게 푼 걸 확인할 수 있었다.

      answer = signs[i] ?  absolutes[i] : -absolutes[i];

깔끔... 이렇게 풀어봐야하는데 ㅎㅎ


## [2. 피보나치수](https://school.programmers.co.kr/learn/courses/30/lessons/12945)
 - 피보나치 수열 문제를 접할 때면 재귀함수 사용을 이용한 풀이법이 떠오른다
 - 하지만 단순 재귀함수로는 항상 시간 초과를 동반하는 일이 잦아서 한번 더 생각을 해주어야 한다는 문제가 있다.

피보나치수열을 만나면 자연스럽게 재귀함수 -> 동적계획법을 얘기하는 편인 거 같다.

일반 for문을 이용해 int형 배열에 값을 저장하면서 최종적인 값을 찾아나갈 수 있었다.

        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) / 1234567;
        }

또 하나는 동적계획법을 활용한 재귀함수를 이용해 풀어봤다.

    public static int fibonacci(int arg) {
        if(arr2[arg] != 0) {
            return arr2[arg];
        }
        if(arg < 3) {
            return 1; 
        }
        arr2[arg] = fibonacci(arg-1) + fibonacci(arg-2);
        return arr2[arg];
    }

이렇게 푸는 게 맞는 진 잘 모르겠지만..;  둘 다 시간의 차이는 별로 나지 않았다

![배열사용](https://github.com/jongjin55/daily_99/assets/44630719/1101085e-5223-458c-b8cb-9319c5312651)
![스크린샷 2024-04-03 145136](https://github.com/jongjin55/daily_99/assets/44630719/d3882449-c86b-4d69-b08e-ea1aa2878261)

다른 사람들의 풀이도 대부분 비슷한 거 같다.
