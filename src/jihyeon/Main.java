package jihyeon;

import jihyeon.util.Generator;
import jihyeon.week1.Question1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Generator.generateRandomArray();
        Question1 q1 = new Question1();
        int[] solution = q1.solution(array);
        System.out.println(Arrays.toString(solution));
    }
}