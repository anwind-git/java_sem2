// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Random;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class dz1 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(dz1.class.getName());
        FileHandler fh = new FileHandler("log_dz1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //logger.log(Level.WARNING, "Тестовое логирование");

        Random random = new Random();
        int number = random.nextInt(5, 11);
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
            logger.info("Интерация: " + i + " добовление числа в массив: " + arr[i]);
        }  
        logger.info("Создан начальный массив: " + Arrays.toString(arr) + "\n");

        for (int k = 0; k < arr.length - 1; k++) {
            logger.info("Первый цыкл, элемент массива: " + arr[k]);
            for (int j = arr.length - 1; j > k; j--) {
                logger.info("Второй цыкл, элемент массива: " + arr[j]);
                if (arr[j - 1] > arr[j]) {
                    logger.info("Если: " + arr[j-1] + " > " + arr[j] + " меняем местами");
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        logger.info("Отсартированный массив: " + Arrays.toString(arr));
    }
    
}
