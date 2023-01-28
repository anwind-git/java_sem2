// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение)

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово: ");
        String word = iScanner.nextLine();
        iScanner.close();
        String reversed = new StringBuffer(word).reverse().toString(); 
        System.out.println(word.equals(reversed));
    }    
}
