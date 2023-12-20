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
                    if (numberSelection == 1)
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if (numberSelection == 2)
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if (numberSelection == 3)
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    if (numberSelection == 4)
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");

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

    public static void showSelections() {
        for (Map.Entry<Integer, String> item : information.entrySet()) {
            System.out.println(item.getValue());
        }
    }

    public static void showLaptops() {
        Set<String> list = new TreeSet<>();
        for (Map.Entry<Integer, String> item : information.entrySet()) {
            if (item.getKey() == 1) {
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add(laptopsSelection.getRam() + " GB" + " : " + laptopsSelection.getName());
                }
                System.out.println("\tНоутбуки по объёму оперативной памяти:");
                for (String showRam : list) {
                    System.out.println(showRam);
                }
            }

            if (item.getKey() == 2) {
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add(laptopsSelection.getHard() + " GB" + " : " + laptopsSelection.getName());
                }
                System.out.println("\tНоутбуки по объёму жесткого диска:");
                for (String showHard : list) {
                    System.out.println(showHard);
                }
            }

            if (item.getKey() == 3) {
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add("OS " + laptopsSelection.getOs() + " : " + laptopsSelection.getName());
                }
                System.out.println("\tНоутбуки по Оперативной системе:");

                for (String showOs : list) {
                    System.out.println(showOs);
                }
            }

            if (item.getKey() == 4) {
                for (Laptop laptopsSelection : Main.laptops) {
                    list.add("Цвет " + laptopsSelection.getColor() + " : " + laptopsSelection.getName());
                }
                System.out.println("\tНоутбуки по цвету:");
                for (String showColor : list) {
                    System.out.println(showColor);
                }
            }

        }

    }
}
