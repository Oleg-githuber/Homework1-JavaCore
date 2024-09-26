package ru.gb.jcore.printer;

import ru.gb.jcore.regular.OtherClass;
import ru.gb.jcore.regular.Decorator;

/**
 * Класс View
 */
public class Printer {

    /**
     * Вывод результатов выполнения
     * всех африфметический операций
     *
     * @param a Первое число
     * @param b Второе число
     */
    public static void printOther(int a, int b) {
        int result = OtherClass.add(a, b);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(a, b);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(a, b);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(a, b);
        System.out.println(Decorator.decorate(result));
    }
}
