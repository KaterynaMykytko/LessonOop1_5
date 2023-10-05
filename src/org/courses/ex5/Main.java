package org.courses.ex5;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(1400,"Ukraine", "Chernigiv",
                "Pavlova", 15, 36);

        int index = address.getIndex();
        String country = address.getCountry();
        String city = address.getCity();
        String street = address.getStreet();
        int house = address.getHouse();
        int apartment = address.getApartment();

        System.out.println("Index " + index + "\tCountry " + country + "\tCity " + city + "\tStreet " +
                street + "\tHouse " + house + "\tApartment " + apartment);
    }
}
