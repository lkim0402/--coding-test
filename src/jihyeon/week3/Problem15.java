package jihyeon.week3;

import java.util.ArrayDeque;

public class Problem15 {

    private int solution(int N, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // 초기 데이터 설정
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        // deque에 요소가 1개 남을 때까지 반복하기
        while (deque.size() > 1) {
            // K번째 요소를 찾기 위해 앞에서부터 제거 후 뒤에 추가
            for (int i = 0; i < K - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }
        // 마지막으로 남은 요소 반환
        return deque.pollFirst();
    }
}
