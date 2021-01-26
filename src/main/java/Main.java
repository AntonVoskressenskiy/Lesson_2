import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* 1. Создаем массив, заполняем значениями (0 и 1) и меняем на противоположные */
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 0;
                mass[i] = 1;
            }
        }
//        System.out.println(Arrays.toString(mass));

//        2. Создание массива длиной 8

        int[] mass_up_to_3 = new int[8];
        int num = 0;
        for (int i = 0; i < mass_up_to_3.length; i++) {
            mass_up_to_3[i] = num;
            num += 3;
        }
//          System.out.println(Arrays.toString(mass_up_to_3));

//        3. Задать массив, заполнить данными и если число меньше 6 умножить на 2

        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(w));
        int num_1 = 6;
        for (int i = 0; i < w.length; i++) {
            if (w[i] < num_1) {
                w[i] *= 2;
            }
//            System.out.println(Arrays.toString(w));

//             4. Заменить хначения в квадратном массиве диагональ
        }
        int[][] arr = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;

//            System.out.print (arr[i] [j]); // не получается выести построчно(весь массив выводится одной срокой)

            }
        }

//           5. Задать одномернвй массив и найти в нем максимальное и минимальное значения

            int[] min_max = {-1, 5, 3, 2, 11, 4, 5, 2, -445, 8, 25, 1};
            int min = min_max[0];
            int max = min_max[0];
            for (int i = 0; i < min_max.length; i++) {
                if (min_max[i] < min) {
                    min = min_max[i];
                } else if (min_max[i] > max) {
                    max = min_max[i];
               }
            }
//        System.out.println("Минимальное значение " + min);
//        System.out.println("Максимльное значение " + max);
    }
}
















