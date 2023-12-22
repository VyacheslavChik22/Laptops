import java.util.*;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
 */
public class Main {
    static Set<Laptop> laptops = new HashSet<>();
    public static void main(String[] args) {

        laptops.add(new Laptop("Asus", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Asus", 120, 8, "MacOS", "White"));
        laptops.add(new Laptop("Asus", 320, 32, "Linux", "Silver"));
        laptops.add(new Laptop("Asus", 320, 64, "Windows 11", "Black"));

        laptops.add(new Laptop("Lenovo", 120, 64, "Windows 11", "Blue"));
        laptops.add(new Laptop("Lenovo", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Lenovo", 320, 32, "MacOS", "Black"));
        laptops.add(new Laptop("Lenovo", 500, 32, "Windows 11", "Blue"));

        laptops.add(new Laptop("Dell", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Dell", 320, 16, "MacOS", "Black"));
        laptops.add(new Laptop("Dell", 320, 8, "Linux", "Black"));
        laptops.add(new Laptop("Dell", 500, 64, "Linux", "Blue"));

        laptops.add(new Laptop("Huawei", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Huawei", 250, 16, "Linux", "White"));
        laptops.add(new Laptop("Huawei", 120, 32, "Windows 11", "Silver"));
        laptops.add(new Laptop("Huawei", 320, 8, "Windows 10", "Blue"));

        laptops.add(new Laptop("Dell", 120, 8, "Windows 10", "Black"));
        laptops.add(new Laptop("Dell", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Dell", 320, 16, "Linux", "White"));
        laptops.add(new Laptop("Dell", 120, 64, "Windows 11", "Silver"));

        Methods.showParametersSelection();
        Methods.selectionNumberParameter();
        Methods.showSelections();
        Methods.showLaptops();
    }
}
