
## 1. 정수 제곱근 판별
 - 제곱근 값을 얻기 위해 Math 함수 사용이 필요하다고 생각함
 - double 형을 반환하기에 long 타입으로 바꿔줄 필요가 있다고 생각했음.

        if(result % 1 == 0.0) {
            answer = Double.valueOf(result).longValue() + 1;
            answer = Double.valueOf(Math.pow(answer, 2)).longValue();
        }else {
            answer  = -1;
        }
        return answer;
   그 결과 위와 같이 작성됨.

   다른 사람들의 풀이 방식을 보니..(인상적인 것들만 가져옴)
   
        if(Math.pow((int) Math.sqrt(ex2), 2) == ex2)

   묵시적 형변환으로 비교를 하는 부분에서 놀람

         Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1

   위와 같이 삼항연산자로 처리하는 것도 생각지 못함 ;;

   단순한 문제도 다양하게 접근한 부분에서 많이 배우는 거 같다. 
   

## 2. 최댓값과 최솟값
- 최댓값과 최솟값을 구해야하는 부분에서 탐색을 어떻게 해야하는 지 생각했음;
- 최댓값과 최솟값을 얻기 위해 Math.min, Math.max 를 써야하는지 생각했지만, Arrays.sort() 함수를 사용하면 쉽게 정렬을 할 수 있을 거 같았음
- List 배열로 만든 후 Stream 으로 int형 배열을 만듬 (List로 안하고 String[]으로 만들어도 될거 같음)
- 결과는 통과했지만.. 다른 사람들은 시간과의 싸움을 하고 있었음;
![속도](https://github.com/jongjin55/daily_99/assets/44630719/54517e70-8e1b-4976-95c1-cf8ee35d08de)

내 시간을 봤는데, 다른 사람들에 비해 느리다고 봄

주요 원인은 2가지로 판단됨

- ### StringBuilder 사용
- ### for문 사용

출력을 위해 String 에서 StringBuilder 만 변경했는데 시간이 10배정도 단축이 됨
![속도2](https://github.com/jongjin55/daily_99/assets/44630719/2871a1f1-6f07-4261-8d87-7e6d2b6969b6)

원인에 대해선 분명한 이유가 있는 거 같지만, 이해를 잘 못하는 편이라 StringBuilder > StringBuffer > String 순으로 사용하면 좋다는 거!!

간단하게 사용하면 String 사용해도 괜찮은 거 같다.

Stream에서 for문으로 변경해서 아래와 같이 더 단축되는 걸 볼 수 있다.

최소값과 최댓값 찾는 부분에서 Stream을 사용해서 1.~ ms 가 나오고

다른 사람들을 보니 for문으로 돌리니 0.~ ms 가 나오는 걸 확인했다

![속도4](https://github.com/jongjin55/daily_99/assets/44630719/6abaa00a-b170-409d-86bf-f413fcd96a63)

Stream 이 for문보다 느린이유를 찾아보니 2가지 정도의 큰 이유가 있다는 걸 알았다.

인덱스 기반
 - for문은 단순 인덱스 기반으로 도는 반복문으로 메모리 접근이기 때문에 Stream에 비해 빠르고 오버헤드도 없다.
 - stream의 경우는 JVM이 이것저것 처리해줘야하는 것들이 많아 실행 시 느릴 수 밖에 없다.

컴파일러 적용
 - Stream은 java 8부터 지원한 것이고 for문은 그보다 훨씬 오래전부터 계속 사용해왔다.
 - Stream의 경우 신생(?)인 만큼 정보가 없어 for문과 같은 정교한 최적화를 수행할 수 없다.

자바하나 하기에도 모르는 게 많다 ;
