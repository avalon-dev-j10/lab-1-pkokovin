package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    String country;
    String city;
    String street;
    int houseNumber;
    int flatNumber;
    
    public Address(String country, String city, String street, int houseNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = 0;
    }
    
    public Address(String country, String city, String street, int houseNumber, int flatNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
    
    public String getCountry(){
        return country;
}    
    public String getCity(){
        return city;
}
    public String getStreet(){
        return street;
    }
    public Integer getHouseNumber(){
        return houseNumber;
    }
    public Integer getFlatNumber(){
        return flatNumber;
    }
    
}

/*
 * класс Address создан
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