package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String name;
    private Passport passport;
    private Address addr;
    
    
    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.addr = address;
        this.name = passport.getName();
    }

    /*
     * Класс Address создан
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    
    public String getName() {
        return name;
    }

    public String getFullName() {
        /*
        * метод 'getFullName()' класса 'Person' определен
        */
        String fullName = "John Dow";
        if (this.passport.getOtchestvo().equals("empty")&&this.passport.getMiddleName().equals("empty")) {
            fullName = this.passport.getName().concat(" ").concat(this.passport.getSurname());
        }
        if (this.passport.getOtchestvo().equals("empty")) {
            fullName = this.passport.getName().concat(" ").concat(this.passport.getMiddleName().substring(0, 1)).concat(". ").concat(this.passport.getSurname());
        }
        if (this.passport.getMiddleName().equals("empty")) {
            fullName = this.passport.getName().concat(" ").concat(this.passport.getOtchestvo()).concat(" ").concat(this.passport.getSurname());
        }
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * Метода 'getAddress()' класса 'Person' определен
         */
        String regAddress = "homeless";
        int personFlatNumber = this.addr.getFlatNumber();
        if (personFlatNumber==0) {
            regAddress = this.addr.getCountry().concat(" ").concat(this.addr.getCity()).concat(" ").concat(this.addr.getStreet()).concat(" ").concat(Integer.toString(this.addr.getHouseNumber()));
        } else
            regAddress = this.addr.getCountry().concat(" ").concat(this.addr.getCity()).concat(" ").concat(this.addr.getStreet()).concat(" ").concat(Integer.toString(this.addr.getHouseNumber())).concat(" ").concat(Integer.toString(this.addr.getFlatNumber()));
        return regAddress;
    }
}