
## 1. 직사각형 별찍기
  - 단순한 별찍기 출력으로 for문으로 보여주면 될거 같다는 생각
  - 출력문을 하나 하나 보여주기보단 StringBuilder를 통해 빠르게 보여주는 게 좋다 생각함

![image](https://github.com/jongjin55/daily_99/assets/44630719/3751144f-b9c4-4494-8216-6b84ef2290b4)

↑↑ 위가 한번씩 출력문을 돌렸을 때 시간
↓↓ 아래가 StringBuilder를 통한 시간

![image](https://github.com/jongjin55/daily_99/assets/44630719/30953c57-4783-4238-9631-ec813830b488)

차이는 크게 나진 않는 거 같아보임

대부분 사람들이 for문을 이용해 풀었지만 Stream 을 이용한 풀이도 있어 참고함(신선..)

![image](https://github.com/jongjin55/daily_99/assets/44630719/7d876b4a-59d3-4da5-9ace-c12c4f53e85d)

![image](https://github.com/jongjin55/daily_99/assets/44630719/b75af167-2ecf-400e-8cd9-0eae3049ddc0)

특정 케이스에서는 좀 느려보이긴 하지만
Stream을 이용한 풀이는 간편해보여서 Stream을 이용한 풀이도 도전해보고 싶음.

## 바탕화면 정리
  - 문제부터 쉽지 않아보임
  - 좌표에 대해 최솟값과 최댓값을 구해 최소한의 이동거리를 구하라는 부분에서 멘붕..
  - 이차원 배열을 만들어서 input 값을 다 세팅하고 하나씩 비교해 나가야 하나.. 생각이 들었지만
    왼쪽 상단 위 <> 오른쪽 하단 아래.. 라는 변치않는 부분에서 indexOf 함수를 사용해 행 탐색시 인덱스값을 가져올 수 있겠다 싶음.
  - 열 탐색시 charAt()을 이용해 이중 for문을 돌릴 수 밖에 없단 생각이 듬.

![image](https://github.com/jongjin55/daily_99/assets/44630719/03a43b5d-2280-4258-846b-2dda1bb34ca7)

답은 맞췄지만.. 이중 for문밖에 답이 없을까하는 아쉬움이 드는 부분임..

다른 사람들의 답을 참고해보니 이중 for문에 행,열 인덱스를 한번에 세팅해주는 방식에 for문을 하나 지울 수 있겠다는 생각듬

![image](https://github.com/jongjin55/daily_99/assets/44630719/090a7e7f-a886-464d-a93e-77dcda137477)


그 결과^^

![image](https://github.com/jongjin55/daily_99/assets/44630719/257d9e18-b5b1-4471-b948-630e78188f4c)

열 인덱스를 바로 반환값으로 세팅해서 사용(내심 뿌듯ㅎ)

