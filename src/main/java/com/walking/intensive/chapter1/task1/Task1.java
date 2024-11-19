package com.walking.intensive.chapter1.task1;

/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int lastDigit = age % 10;
        int lastTwoDigits = age % 100;

        if (age < 0) {
            return "Некорректный ввод";
        } else if (lastDigit == 1 && lastTwoDigits != 11) {
            return "Вам " + age + " год";
        } else if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4) && !(lastTwoDigits >= 11 && lastTwoDigits <= 14)) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }

    }
}
