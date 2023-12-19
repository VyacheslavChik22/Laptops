import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP",256,8,"Windows 10","Silver"));
        laptops.add(new Laptop("Lenovo",512,64,"MacOS","Black"));
        laptops.add(new Laptop("Asus",512,32,"Windows 11","White"));
        laptops.add(new Laptop("Dell",256,16,"Linux","Silver"));
        laptops.add(new Laptop("Huawei",128,4,"Windows 10","Blue"));
        Map<Integer, String> criterion = new HashMap<>();
        criterion.put(1,"Hard");
        criterion.put(1,"Ram");
        criterion.put(1,"Operation System");
        criterion.put(1,"Color");
    }
}
