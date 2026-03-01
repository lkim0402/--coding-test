package jihyeon.week3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem16 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;

        // 각 작업의 배포 가능일 계산하기
        int[] daysLeft = new int[n];
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // 배포될 작업의 수
        int count = 0;

        // 현재 배포될 작업 중 가장 늦게 배포될 작업의 가능일
        int maxDay = daysLeft[0];

        for (int i = 0; i < n; i++) {
            // 배포 가능일이 가장 늦은 배포일보다 빠르면
            if (daysLeft[i] <= maxDay) {
                count++;
            }
            // 배포 예정일이 기준 배포일보다 느리면
            else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }

        // 마지막으로 카운트된 작업 함께 배포
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
