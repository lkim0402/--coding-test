package jihyeon;

import jihyeon.util.Generator;
import jihyeon.week1.Question2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Generator.generateRandomArray();
        Question2 q2 = new Question2();
        int[] solution = q2.solution(array);
        System.out.println(Arrays.toString(solution));
    }
}