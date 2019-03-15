package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main(String[] args) {

        /*
         * Точка входа определена
         */

        Person ivanov = new Person(new Passport(2344, 213324, "Иван", "Иванович", "Иванов", "13 января 1980 г.", "15 апреля 1994 г.", "37 ОМ"), new Address("Россия", "Москва", "Строителей", 5, 15));
        Person smith = new Person(new Passport("John", "Edvard", "Smith", 3424, 345553, "25 FEB 1970", "1 JUN 1985", "WhiteChapel PD"), new Address("GB", "London", "Baker str.", 21, 3));

        /*
         * переменные проинициализированы
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * созданы строковые переменные ivanovFullName, smithFullName, ivanovAddress, smithAddress
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();

        /*
         * Значения созданных строковых переменных выведены в консоль
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(ivanovFullName);
        System.out.println(smithFullName);
        System.out.println(ivanovAddress);
        System.out.println(smithAddress);
    }
}
