import java.util.*;

public class Methods {
    static Map<Integer, String> criterion = new HashMap<>();
    static Map<Integer, String> information = new TreeMap<>();
    static int numberSelection = 0;

    public static void showParametersSelection() {
        criterion.put(1, "Hard");
        criterion.put(2, "Ram");
        criterion.put(3, "Operation System");
        criterion.put(4, "Color");
        criterion.put(5, "Start");
        System.out.println("Вы можете выбрать ноутбук по этим параметрам:");
        for (Map.Entry<Integer, String> parameters : criterion.entrySet()) {
            System.out.println(parameters);
        }

    }

    public static Map selectionNumberParameter() {
        String error = "Неправильно введен номер";
        System.out.println("Для выбора введите цифру нужного параметра");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            while (numberSelection != 5) {
                numberSelection = scanner.nextInt();
                if (numberSelection > 0 && numberSelection <= 5) {
                    if(numberSelection == 1)information.put(numberSelection,"Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if(numberSelection == 2)information.put(numberSelection,"Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if(numberSelection == 3)information.put(numberSelection,"Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if(numberSelection == 4)information.put(numberSelection,"Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");

                } else {
                    System.out.println(error);
                }
            }
        } else {
            System.out.println(error);
        }
        scanner.close();
        return information;
    }
   public static void showSelections(){

       for (Map.Entry<Integer,String> item : information.entrySet()) {
           System.out.println(item.getValue());
       }
   }

    public static void showLaptops() {
        Set<String> list = new TreeSet<>();
        switch (numberSelection) {
            case 1:
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add(laptopsSelection.getRam() + " GB" + " : " + laptopsSelection.getName());
                }
                for (String showRam : list) {
                    System.out.println(showRam);
                }
                break;
            case 2:
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add(laptopsSelection.getHard() + " GB" + " : " + laptopsSelection.getName());
                }
                for (String showHard : list) {
                    System.out.println(showHard);
                }
                break;
            case 3:
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add("OS " + laptopsSelection.getOs() + " : " + laptopsSelection.getName());
                }
                for (String showOs : list) {
                    System.out.println(showOs);
                }
                break;
            case 4:
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add("Цвет " + laptopsSelection.getColor() + " : " + laptopsSelection.getName());
                }
                for (String showColor : list) {
                    System.out.println(showColor);
                }
                break;
        }
    }
}
