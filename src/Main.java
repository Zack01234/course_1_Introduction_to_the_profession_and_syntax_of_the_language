import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
/*Задание 1
    Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
    На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
    Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    Не забудьте выполнить переход на новую строку между двумя циклами.
    В результате программы вывод должен получиться следующий:
    1 2 3 4 5 6 7 8 9 10
    10 9 8 7 6 5 4 3 2 1
- Критерии оценки
    – Результат программы выведен согласно условию задачи;
    – Выведены все числа согласно задаче;
    – Использованы оператор for и оператор while для решения задачи.
     */
        byte number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

/*Задание 2
    В вашей компании пятница является днем отчетным.
    Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
    Условия задачи:
    Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
    Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
    "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
    В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
- Критерии оценки
    – Сообщение в консоль выведено корректно и учитывает все значения переменной;
    – Условия цикла записаны корректно;
    – Переменная инициализирована корректно;
    – Условие задачи соблюдены и выполнены.
    */
        int firstFriday = 5;
        for (int dayNumber = firstFriday; dayNumber <= 31; dayNumber += 7) {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

/*Задание 3
    Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
    Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
    Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
    Условия задачи:
    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
    В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
- Критерии оценки
    – Соблюдены все условия задачи;
    – Операция цикла написана без ошибок;
    – Цикл выводит корректные значения;
    – Значения переменной присвоены корректно
    */
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}
