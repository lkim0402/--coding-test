package jihyeon.util;

import java.util.Random;

public class Generator {

    public static int[] generateRandomArray() {
        Random random = new Random();

        // 배열 크기: 2 ~ 100000
        int size = random.nextInt(100000 - 2 + 1) + 2;

        int[] arr = new int[size];

        // 값 범위: -100000 ~ 100000
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(200001) - 100000;
        }
        return arr;
    }
}
