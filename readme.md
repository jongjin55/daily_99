## [1.택배상자](https://school.programmers.co.kr/learn/courses/30/lessons/131704)

처음으로 도전하는 챌린저 문제 ;;

문제 이해부터 잘 안되는 거 같다. (하나씩 정리)

### 문제 정리
 1. 영재가 실어야 하는 택배상자는 크기가 모두 같으며 1번 상자부터 n번 상자까지 번호가 증가하는 순서대로 컨테이너 벨트에 일렬로 놓여 영재에게 전달됩니다.

 2. 택배 기사님이 미리 알려준 순서에 맞게 영재가 택배상자를 실어야 합니다.

 3. 만약 컨테이너 벨트의 맨 앞에 놓인 상자가 현재 트럭에 실어야 하는 순서가 아니라면 그 상자를 트럭에 실을 순서가 될 때까지 잠시 다른 곳에 보관해야 합니다.(보조 컨테이너)

   (즉, 가장 마지막에 보조 컨테이너 벨트에 보관한 상자부터 꺼내게 됩니다 )

예시)

   ![image](https://github.com/jongjin55/daily_99/assets/44630719/bb674bdd-d355-4d0f-b36b-c329c04e50c9)

 영재가 5개의 상자를 실어야 하며, 택배 기사님이 알려준 순서가 기존의 컨테이너 벨트에 [4, 3, 1, 2, 5] 택배상자 순서인 경우

 영재는 우선 [1, 2, 3] 상자를 보조 컨테이너 벨트에 보관합니다. 그 후 [4] 상자를 트럭에 싣고 보조 컨테이너 벨트에서 [3] 상자 빼서 트럭에싣습니다. 
 
 다음으로 [1] 상자를 실어야 하지만 보조 컨테이너 벨트에서는 [2] 상자를, 기존의 컨테이너 벨트에는 다섯 번째 상자를 꺼낼 수 있기 때문에
 
 더이상의 상자는 실을 수 없습니다. 따라서 트럭에는 2개의 상자만 실리게 됩니다.

### 접근

- 기본 컨테이너는 for문으로 단순 증가하고, 보조 컨테이너는 스택으로 구현하면 될 거 같다는 생각을 했다.

택배상자를 실을 순서는 정해져있기 때문에  

- 순방향 (기본 컨테이너에서 나오는 순서와 택배상자를 실을 순서가 동일)
- 역방향 (택배상자를 실을 순서와 보조컨테이너 순서)

순방향과 역방향을 고려하는 부분에서 고민이 많았다.

기본 컨테이너 순서로 진행하다 택배 순서가 일치하면 보조컨테이너를 한번 탐색하고 다음 기본 컨테이너 진행하면서 비교 순으로 순환을 하면 되겠다는 정리를 했다.

그렇게 해서

        import java.util.*;

        class Solution {
            public int solution(int[] order) {
                int answer = 0;
                int cnt = 0;
                Stack<Integer> stack = new Stack<>();
                
                for (int i = 0; i < order.length; i++) {
                    
                    if(order[cnt] != (i+1)) {
                        stack.push(i+1);
                    }else {                
                        answer++;
                        cnt++;
                        while (stack.size() != 0) {
                            if(stack.peek() == order[cnt]){
                                stack.pop();
                                answer++;
                                cnt++;
                            }else {
                                break;
                            }
                        }
                    }
                }
                
                return answer;
            }
        }

  엉성한 듯 하지만 생각했던대로 구현하고 테스트하니 통과되었다.

  다른 사람들 풀이를 보는데, 이해하기 어려운 부분이 있었다.

        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < order.length; i++){
            stack.push(i+1); <<-- 바로 스택쌓기
            while(!stack.isEmpty()){
                if (stack.peek() == order[idx]){ <<-- 동일
                    stack.pop();
                    idx++;
                } else break;
            }
        }

        return idx;

처음엔 기본 컨테이너에서 나오는 대로 바로 보조 컨테이너로 쌓는 걸 보고??? 바로 쌓는 지 이해하기 어려웠다.

로직을 계속 돌려보니 마침내 이해할 수 있었다. 스택에 바로 쌓고 while문을 바로 실행되니 택배상자 실을 순서와 바로 비교를 하고

스택에서 계속 꺼내면서 처리를 반복하는 부분에서 내가 했던 풀이에서 더 나아간 정리되고 깔끔한 형태였다.

풀이방식의 상위버전을 보니 좀 더 정리가 잘된 거 같다.ㅎ
