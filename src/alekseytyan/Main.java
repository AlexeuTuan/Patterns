package alekseytyan;

import alekseytyan.iterator.CafeMenu;
import alekseytyan.iterator.DinerMenu;
import alekseytyan.iterator.PancakeHouseMenu;
import alekseytyan.iterator.Waitress;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(new ArrayList<>(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu)));
        waitress.printMenu();
    }
}