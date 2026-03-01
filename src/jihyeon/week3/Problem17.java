package jihyeon.week3;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Problem17 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        // goalDeque에 문자열이 남아 있으면 계속 반복
        while (!goalDeque.isEmpty()) {
            // cardsDeque1의 front와 일치하는 경우
            if (!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }
            // cardsDeque2의 front와 일치하는 경우
            else if (!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }
            // 일치하는 원소 없음
            else {
                break;
            }
        }
        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
