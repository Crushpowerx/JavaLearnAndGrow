package Enum;

import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        loop with boolean
        for (Country country : Country.values()) {
            if (country.hasCurrency()) {
                System.out.println(country + " has currency, it's " + country.currency);
            } else {
                System.out.println(country + " has no currency");
            }
        }
//        loop with void
        for (Country country : Country.values()) {
            System.out.print(country + " ");
            country.sayHello();
        }
//        Special collection for Enum
        Set<Country> countries = EnumSet.allOf(Country.class);
        System.out.println(countries);
    }
}
