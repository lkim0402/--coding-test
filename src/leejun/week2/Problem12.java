package leejun.week2;

import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 2, 3}));
    }

    public static int[] solution(int[] prices) {
        int[] res = new int[prices.length];
        Stack<int[]> stack = new Stack<>();
        int len = prices.length;

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && stack.peek()[1] > prices[i]) {
                int[] pop = stack.pop();
                int index = pop[0];
                int val = pop[1];
                res[index] = i - index;
            }
            stack.push(new int[] {i, prices[i]});
        }

        // filling 0
        for (int i = 0; i < len; i++) {
            if (res[i] == 0) {
                res[i] = len - i - 1;
            }
        }
        return res;
    }
}
