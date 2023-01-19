package CollectionsSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Соловьев В.И.", Driver.Category.B, Driver.TypeTransp.CAR);
        Driver driver2 = new Driver("Скворцов В.И.", Driver.Category.B, Driver.TypeTransp.CAR);
        Driver driver3 = new Driver("Львов В.И.", Driver.Category.C, Driver.TypeTransp.TRUCK);
        Driver driver4 = new Driver("Тигров В.И.", Driver.Category.C, Driver.TypeTransp.TRUCK);
        Driver driver5 = new Driver("Бегемотов В.И.", Driver.Category.D, Driver.TypeTransp.BUS);
        Driver driver6 = new Driver("Слонов В.И.", Driver.Category.D, Driver.TypeTransp.BUS);

        HashSet<Driver> driver = new HashSet<Driver>();
        driver.add(driver1);
        driver.add(driver2);
        driver.add(driver3);
        driver.add(driver3);
        driver.add(driver4);
        driver.add(driver5);
        driver.add(driver5);
        driver.add(driver6);

        Iterator iterator = driver.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}