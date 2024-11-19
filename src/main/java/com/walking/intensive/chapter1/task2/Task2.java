package com.walking.intensive.chapter1.task2;

/**
 * Реализуйте метод getFlatLocation(), который будет принимать параметрами следующие данные:
 * <ul>
 * <li> Количество этажей в доме;
 * <li> Количество подъездов;
 * <li> Номер нужной квартиры.
 * </ul>
 *
 * <p>Необходимо определить подъезд, этаж и расположение нужной квартиры относительно лифта,
 * руководствуясь следующими правилами:
 * <ul>
 * <li> На этаже 4 квартиры;
 * <li> Нумерация квартир возрастает по часовой стрелке.
 * </ul>
 *
 * <p>Примеры строки, возвращаемой из метода:
 * <ul>
 * <li> 1 кв – 1 подъезд, 1 этаж, слева от лифта, влево
 * <li> 2 кв – 1 подъезд, 1 этаж, слева от лифта, вправо
 * <li> 3 кв – 1 подъезд, 1 этаж, справа от лифта, влево
 * <li> 4 кв – 1 подъезд, 1 этаж, справа от лифта, вправо
 * </ul>
 *
 * <p>Если для дома с указанной этажностью и количеством подъездов квартиры с заданным номером не существует,
 * метод должен вернуть строку "Такой квартиры не существует".
 *
 * <p>Если хотя бы один из указанных параметров некорректный - например, отрицательное число или 0,
 * метод должен вернуть строку "Некорректные входные данные".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task2 {
    public static void main(String[] args) {

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatAmount = floorAmount * 4 * entranceAmount;

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            return "Некорректные входные данные";
        }

        if (flatNumber > flatAmount) {
            return "Такой квартиры не существует";
        }

        int flatsInEntrance = floorAmount * 4;
        int entranceNumber = (flatNumber - 1) / flatsInEntrance + 1;

        int flatInEntrance = (flatNumber - 1) % flatsInEntrance + 1;

        int floorNumber = (flatInEntrance - 1) / 4 + 1;

        int positionOnFloor = (flatInEntrance - 1) % 4;

        String side;
        if (positionOnFloor < 2) {
            side = "слева от лифта";
        } else {
            side = "справа от лифта";
        }

        String direction;
        if (positionOnFloor % 2 == 0) {
            direction = "влево";
        } else {
            direction = "вправо";
        }

        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + side + ", " + direction;


    }
}
