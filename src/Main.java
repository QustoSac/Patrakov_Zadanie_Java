import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //задание 1
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Нечетное");
//        }
        ////////////////////////////////////////////////

        //задание 2
//        System.out.print("Введите три числа: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println("Минимальное число: " + min);
        ////////////////////////////////////////////////

        //Задание 3
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }
        ////////////////////////////////////////////////

        //Задание 4
//        System.out.print("Введите число N: ");
//        int N = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++) {
//            sum += i;
//        }
//        System.out.println("Сумма от 1 до " + N + " = " + sum);
        ////////////////////////////////////////////////

        //Задание 5
//        System.out.print("Введите число N: ");
//        int N = scanner.nextInt();
//        int a = 0, b = 1;
//        System.out.print("Первые " + N + " чисел Фибоначчи: ");
//        for (int i = 1; i <= N; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
        ////////////////////////////////////////////////

        //Задание 6
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        boolean isPrime = true;
//
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println("Простое число");
//        } else {
//            System.out.println("Не простое число");
//        }
        ////////////////////////////////////////////////

        //Задание 7
//        System.out.print("Введите число N: ");
//        int N = scanner.nextInt();
//        System.out.println("Числа в обратном порядке:");
//        for (int i = N; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
        ////////////////////////////////////////////////

        //Задание 8
//        System.out.print("Введите два числа A и B: ");
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int sum = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма четных чисел от " + A + " до " + B + " = " + sum);
        ////////////////////////////////////////////////

        //Задание 9
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Обратная строка: " + reversed);
        ////////////////////////////////////////////////

        //Задание 10
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        int digits = String.valueOf(Math.abs(number)).length();
//        System.out.println("Количество цифр в числе: " + digits);
        ////////////////////////////////////////////////

        //Задание 11
//        System.out.print("Введите число N: ");
//        int N = scanner.nextInt();
//        long factorial = 1;
//        for (int i = 2; i <= N; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал числа " + N + " = " + factorial);
        ////////////////////////////////////////////////

        //Задание 12
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        int sum = 0;
//        while (number != 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        System.out.println("Сумма цифр числа = " + sum);
        ////////////////////////////////////////////////

        //Задание 13
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        if (input.equals(reversed)) {
//            System.out.println("Это палиндром");
//        } else {
//            System.out.println("Это не палиндром");
//        }
        ////////////////////////////////////////////////

        //Задание 14
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < size; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число: " + max);
        ////////////////////////////////////////////////

        //Задание 15
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < size; i++) {
//            sum += array[i];
//        }
//        System.out.println("Сумма всех элементов массива: " + sum);
        ////////////////////////////////////////////////

        //Задание 16
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int positiveCount = 0;
//        int negativeCount = 0;
//        for (int i = 0; i < size; i++) {
//            if (array[i] > 0) {
//                positiveCount++;
//            } else if (array[i] < 0) {
//                negativeCount++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + positiveCount);
//        System.out.println("Количество отрицательных чисел: " + negativeCount);
        ////////////////////////////////////////////////

        //Задание 17
//        System.out.print("Введите два числа A и B: ");
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
        ////////////////////////////////////////////////

        //Задание 18
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine().toLowerCase();
//        int vowelsCount = 0;
//        int consonantsCount = 0;
//        String vowels = "аеёиоуыэюяaeiou";
//
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if (vowels.indexOf(ch) != -1) {
//                    vowelsCount++;
//                } else {
//                    consonantsCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelsCount);
//        System.out.println("Количество согласных: " + consonantsCount);
        ////////////////////////////////////////////////

        //Задание 19
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String[] words = input.split(" ");
//        System.out.println("Слова в обратном порядке:");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }
        ////////////////////////////////////////////////

        //Задание 20
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " является числом Армстронга");
        } else {
            System.out.println(originalNumber + " не является числом Армстронга");
        }
    }
    ////////////////////////////////////////////////

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}