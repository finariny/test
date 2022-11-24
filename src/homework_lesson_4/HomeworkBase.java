package homework_lesson_4;

import java.sql.SQLOutput;

public class HomeworkBase {
    public static void main(String[] args) {
        //Базовый
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        String trimHello = hi.trim();
        String worldLower = world.toLowerCase();
        String helloWorld = trimHello + worldLower + newLine;
        String repeatedHelloWorld = helloWorld.repeat(3);
        System.out.println(repeatedHelloWorld);

        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "а" + " ");
        }

        System.out.println('\n'); //чтобы разделить выводимые значения в консоли для заданий 2 и 3

        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака

        Cat barsik = new Cat(2, "brown");
        System.out.println(barsik.age);

        barsik.setAge(3);
        System.out.println(barsik.age);

        barsik.setColor("black");
        System.out.println(barsik.color);

        System.out.println(barsik.getColor());

        System.out.println('\n'); //чтобы разделить выводимые значения в консоли для классов Cat и Dog

        Dog jack = new Dog ("dalmatian", 68);
        System.out.println(jack.dogBreed);

        jack.setDogBreed("dachshund");
        System.out.println(jack.dogBreed);

        jack.setSpotsCount(2);
        System.out.println(jack.spotsCount);

        System.out.println(jack.getDogBreed());
        System.out.println(jack.getSpotsCount());

    }
}
