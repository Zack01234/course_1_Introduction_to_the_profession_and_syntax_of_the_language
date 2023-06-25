import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*Представим, что вы работаете в небольшой компании, и к вам часто обращаются коллеги из других отделов, чтобы вы помогли им настроить их работу.
И вот к вам приходят коллеги из бухгалтерии и просят помощи с корпоративной бухгалтерской книгой.
Каждый день месяца, включая выходные, компания тратит средства — некую сумму, причем в бухгалтерской книге хранится сумма затрат по дням (а не каждая сумма отдельно).
То есть в книге 30 записей разных сумм. Эти суммы разнятся от 100 000 до 200 000.
Ваш коллега по отделу написал код, который генерирует массив из 30 случайных чисел, и предложил прежде, чем писать программу для настоящей бухгалтерской книги, проверить всё на случайных числах от 100 000 до 200 000.
Для получения массива случайных чисел достаточно объявить массив и вызвать указанный ранее метод.
Метод инициализирует ваш массив и заполнит его случайными значениями от 100_000 до 200_000.
см. метод generateRandomArray ниже.
 */
        int[] arr = generateRandomArray();

/*Задание 1
    Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Сумма трат за месяц составила … рублей».
- Критерии оценки
    – Вычисления выполнены корректно.
    – Результат вычислений выведен в консоль.
    – Код написан без ошибок.
    – Соблюдены все условия задания.
    */
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

/*Задание 2
    Следующая задача — найти минимальную и максимальную трату за день.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
- Критерии оценки
    – Минимальное значение найдено корректно.
    – Максимально значение найдено корректно.
    – При изменении данных массива код работает корректно и выводит верный результат.
    – Результат программы выведен в консоль согласно условию задания.
    */
        System.out.println("Минимальная сумма трат за день составила " + findMin(arr) + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + findMax(arr) + " рублей.");

/*Задание 3
    А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
    и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
- Критерии оценки
    – Средняя сумма трат найдена корректно.
    – При изменении данных массива программа работает корректно и выдает верный результат.
    – В коде учтено, что средняя сумма трат может быть как целым, так и дробным числом.
    */
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", findMedium(arr));
        System.out.println();

/*Задание 4
    Отойдем от подсчетов.
    В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
    Данные с именами сотрудников хранятся в виде массива символов (char[]).
    Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    В результате в консоль должно быть выведено "Ivanov Ivan".
    **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
- Критерии оценки
    – Для решения задачи не использовался дополнительный массив.
    – Для решения задачи использовался цикл.
    – Написанный код выводит в консоль корректные данные.
    */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findMedium(int[] arr) {
        double sum = 0;
        for (int med : arr) {
            sum += med;
        }
        return (sum / arr.length);
    }
}

