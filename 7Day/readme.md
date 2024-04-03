
## [1.문자열 내림차순으로 배치하기](https://school.programmers.co.kr/learn/courses/30/lessons/12917)

 - 문제만 보면 내림차순으로 바꿔주면 될거 같다는 생각에 정렬 함수를 찾아봤다.
 - Arrays.sort() 함수를 이용해서 오름차순으로 변경해준 적이 있었는데, 내림차순으로 변경해준 적은 없었던 거 같다.
 - 이번에 내림차순 정렬을 찾아보면서 오름차순은 int타입 배열은 가능한데 반해 내림차순이 안된다는 사실을 알았다.

오름차순 정렬시 정상작동 

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/0a295b3b-0624-4ff1-beeb-35f554009a44)

  - [원본 사이트](https://doitdoik.tistory.com/87)

내림차순 정렬시 int[] 배열은 에러

  ![image](https://github.com/jongjin55/daily_99/assets/44630719/033cf9bc-4eae-4b9f-bba7-e3a4719854e3)

짤막하게 이유를 찾아보면 Generic Class 입장에서는 int형은 객체가 아닌 원시타입이어서 호환하지 않는다고 한다.

내림차순 방법에 대해 찾아보니 Comparator 와 Collections을 이용해 정렬하는 걸 볼 수 있었다.

Comparator 인터페이스는 객체들의 순서를 비교하는데 사용되는 인터페이스고, Collections 클래스는 컬렉션 프레임워크의 유틸리티 메서드를 제공한다고 한다.

그래서 주로 컬렉션 프레임워크의 클래스들을 조작하기 위한 정적 메서드를 제공하며, 주로 List, Set, Map등 조작되는 데 사용된다고 한다.

요약하면 Comparator는 객체의 비교를 위한 인터페이스  Collections은 컬렉션을 다루는 유틸리티 클래스임

그래서 권장되는 사용은  Arrays.sort에서는 Comparator 사용을 

![image](https://github.com/jongjin55/daily_99/assets/44630719/15b37e50-78a2-4ed6-9f06-c3b2c85b73e3)

List에서 Collections 사용을 한다고 한다.

![image](https://github.com/jongjin55/daily_99/assets/44630719/620fc4aa-bea3-44b0-96eb-64c82bcae46b)


## [2.자연수 뒤집어 배열로 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12932)

- 이 문제를 봤을때 동일하게 내림차순 정렬문제로 착각했었다.(또.. 고민의 세월 ;;)
- 문제를 다시 읽고 나서야 뒤집는 배열을 만들어야 된다는 걸 알았다.
- long타입의 매개변수를 받고 int[]형의 리턴타입을 가져야 된다는 부분에서 풀기가 좀 어려웠다
- stream 함수를 이용해 한번에 다 처리를 해볼까 싶었는데..공부부족으로 처리를 잘하지 못했다.(꾸역꾸역 사용함)

  아래는 다른 사람이 사용한 풀이 방식 (나도 저렇게 사용하고 싶었음 ㅜ)

      return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();


하지만 확실히 for문 사용에 비해 시간은 느림

![image](https://github.com/jongjin55/daily_99/assets/44630719/381e33a7-71e0-456b-9d46-e8313cfdca34)


위는 for문을 이용한 풀이방식

## [3. 햄버거 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/133502)

상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.

 - 문제를 읽으면서 스택 구조를 사용해 풀어야 겠다고 판단함.
 - 그렇다고 단순하게 Stack 클래스를 사용해서 풀 수 있는 문제는 아니고 int형 배열로 만들어서 인덱스로 처리하면서 해야할 거 같음

   고민 또 고민...

   '1231' (빵 - 야채 - 고기 -빵) 만 찾아내면 되지 않을까? 생각에 String에서 찾으면 되겠다 싶어 도전@@


       class Solution {
           public int solution(int[] ingredient) {
               int answer = 0;
               StringBuilder sb = new StringBuilder();
               for (int i = 0; i < ingredient.length; i++) {
                   sb.append(ingredient[i]);
                   if(sb.indexOf("1231") > -1) {
                       sb.setLength(sb.length()-4);
                       answer++;
                   }
               }
             return answer;
         }
     }

   첫 번째 도전에서 테스트 케이스는 통과했지만 시간 초과로 인해 실패 ㅜ

   아무래도 백만개의 길이 때문에 첨부터 계속 탐색한다는 부분에서 시간이 걸린다는 생각에

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/16d86796-f53a-41fa-95de-4d3c69e68b7b)

   비교하는 부분을 줄여서 탐색해나갔더니 통과!!

   시간은 몇개의 테스트 케이스들에서는 느리게 나온 거 같긴 하지만;;

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/6b78ef74-9cdd-46fa-858d-0baec1223e93)


   일반적인 정석?적인 방법으로 푼 사람들 풀이를 보면

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/a4622ed1-70f9-4a31-998e-8747221a3471)

   스택의 인덱스를 조절해가면 푼 모습을 볼 수 있다.

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/d4ffc8a6-70e3-4776-b5b8-7695ff784da3)

   시간과 메모리 용량도 더 짧고 효율적. 이래서 스택스택하나보다 ㅎ

