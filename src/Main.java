import java.util.*;

public class Main {
    static Set<Laptop> laptops = new HashSet<>();
    public static void main(String[] args) {

        laptops.add(new Laptop("Asus", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Asus", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Asus", 320, 32, "Linux", "Black"));
        laptops.add(new Laptop("Asus", 500, 64, "Windows 11", "Blue"));

        laptops.add(new Laptop("Lenovo", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Lenovo", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Lenovo", 320, 32, "Linux", "Black"));
        laptops.add(new Laptop("Lenovo", 500, 64, "Windows 11", "Blue"));

        laptops.add(new Laptop("Dell", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Dell", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Dell", 320, 32, "Linux", "Black"));
        laptops.add(new Laptop("Dell", 500, 64, "Windows 11", "Blue"));

        laptops.add(new Laptop("Huawei", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Huawei", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Huawei", 320, 32, "Linux", "Black"));
        laptops.add(new Laptop("Huawei", 500, 64, "Windows 11", "Blue"));

        laptops.add(new Laptop("Dell", 120, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Dell", 250, 16, "MacOS", "White"));
        laptops.add(new Laptop("Dell", 320, 32, "Linux", "Black"));
        laptops.add(new Laptop("Dell", 500, 64, "Windows 11", "Blue"));

        Methods.showParametersSelection();
        Methods.selectionNumberParameter();
        Methods.showSelections();
        Methods.showLaptops();

    }
}
