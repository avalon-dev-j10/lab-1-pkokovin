package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private final int passSerial;
    private final int passNumber;
    private final String name;
    private final String surname;
    private final String otchestvo;
    private final String middleName;
    private final String birthday;
    private final String getPassportDate;
    private final String policeDepartment;
    
    public Passport(int passSerial, int passNumber, String name, String surname, String birthday, String getPassportDate, String policeDepartment) {
        this.passSerial = passSerial;
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.otchestvo = "empty";
        this.middleName = "empty";
        this.birthday = birthday;
        this.getPassportDate = getPassportDate;
        this.policeDepartment = policeDepartment;
    }
    public Passport(int passSerial, int passNumber, String name, String otchestvo, String surname, String birthday, String getPassportDate, String policeDepartment) {
        this.passSerial = passSerial;
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.middleName = "empty";
        this.birthday = birthday;
        this.getPassportDate = getPassportDate;
        this.policeDepartment = policeDepartment;
    }
    
    public Passport(String name, String middleName, String surname, int passSerial, int passNumber, String birthday, String getPassportDate, String policeDepartment) {
        this.passSerial = passSerial;
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.otchestvo = "empty";
        this.middleName = middleName;
        this.birthday = birthday;
        this.getPassportDate = getPassportDate;
        this.policeDepartment = policeDepartment;
    }
    
    public Integer getPassSerial(){
        return passSerial;
    }
    public Integer getPassNumber() {
        return passNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getOtchestvo() {
        return otchestvo;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getGetPassportDate() {
        return getPassportDate;
    }
    public String getPoliceDepartment() {
        return policeDepartment;
    }

    /*
     * Класс Passport определен
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
