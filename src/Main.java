import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", 256, 8, "Windows 10", "Silver"));
        laptops.add(new Laptop("Lenovo", 512, 64, "MacOS", "Black"));
        laptops.add(new Laptop("Asus", 512, 32, "Windows 11", "White"));
        laptops.add(new Laptop("Dell", 256, 16, "Linux", "Silver"));
        laptops.add(new Laptop("Huawei", 128, 4, "Windows 10", "Blue"));

        Methods.showParametersSelection();
        Methods.selectionNumberParameter();



    }

}
