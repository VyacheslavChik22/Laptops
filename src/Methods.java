import java.util.*;

public class Methods {
    static Map<Integer, String> criterion = new HashMap<>();
    static Map<Integer, String> information = new TreeMap<>();
    static Set<Laptop> stringList = new TreeSet<>();
    static int numberSelection = 0;
    static int minHard = 0;
    static int minRam = 0;

    public static void showParametersSelection() {
        criterion.put(1, "Hard");
        criterion.put(2, "Ram");
        criterion.put(3, "Operation System");
        criterion.put(4, "Color");
        criterion.put(5, "showOllLaptops");
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
            while (numberSelection != 6) {
                numberSelection = scanner.nextInt();
                if (numberSelection > 0 && numberSelection <= 6) {
                    if (numberSelection == 1) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                        System.out.println("Будут показаны модели с минимальным объёмом жесткого диска.");
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");

                    }
                    if (numberSelection == 2) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                        System.out.println("Будут показаны  модели с минимальным объемом ОЗУ.");
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                    }
                    if (numberSelection == 3) {
                        System.out.println("Будут показаны  модели с установленной операционной системой.");
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    }
                    if (numberSelection == 4) {
                        System.out.println("Будут показаны модели с в цветом решении.");
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection) + ". Мы покажем вам какие модели по этому параметру у нас сейчас в наличии: ");
                    }
                    if (numberSelection == 5) {
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection) + ". Мы покажем вам все модели какие у нас сейчас в наличии: ");
                    }
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
        Set<String> listRam = new TreeSet<>();
        Set<String> listHard = new TreeSet<>();
        Set<String> listOs = new TreeSet<>();
        Set<String> listColor = new TreeSet<>();
        for (Map.Entry<Integer, String> item : information.entrySet()) {
            if (item.getKey() == 1) {
                List<Integer> tempListHard = new ArrayList<>();
                for (Laptop laptopsSelection : Main.laptops) {
                    tempListHard.add(laptopsSelection.getHard());
                }
                minHard = Collections.min(tempListHard);
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getHard() == minHard) {
                        listHard.add(laptopsSelection.getHard() + " Gb" + " : Модель- " + laptopsSelection.getName() + ", Операционная система- " + laptopsSelection.getOs() + ", Объем ЖД- " + laptopsSelection.getHard() + "Gb, Цвет- " + laptopsSelection.getColor());
                    }

                }
                System.out.println("\tНоутбуки по минимальному объёму жесткого диска:");
                for (String showHard : listHard) {
                    System.out.println(showHard);
                }
            }

            if (item.getKey() == 2) {
                List<Integer> tempListRam = new ArrayList<>();
                for (Laptop laptopsSelection : Main.laptops) {
                    tempListRam.add(laptopsSelection.getRam());
                }
                minRam = Collections.min(tempListRam);
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getRam() == minRam) {
                        listRam.add(laptopsSelection.getRam() + " GB" + " : Модель- " + laptopsSelection.getName() + ", Операционная система- " + laptopsSelection.getOs() + ", Объем ОЗУ- " + laptopsSelection.getRam() + "Gb, Цвет- " + laptopsSelection.getColor());
                    }
                }
                System.out.println("\tНоутбуки по объёму оперативной памяти:");
                for (String showRam : listRam) {
                    System.out.println(showRam);
                }
            }

            if (item.getKey() == 3) {
                for (Laptop laptopsSelection : Main.laptops) {
                    listOs.add("OS " + laptopsSelection.getOs() + " : Модель- " + laptopsSelection.getName() + ", Объем ЖД- " + laptopsSelection.getHard() + "Gb, Цвет- " + laptopsSelection.getColor());
                }
                System.out.println("\tНоутбуки по Оперативной системе:");

                for (String showOs : listOs) {
                    System.out.println(showOs);
                }
            }

            if (item.getKey() == 4) {
                for (Laptop laptopsSelection : Main.laptops) {
                    listColor.add("Цвет " + laptopsSelection.getColor() + " : Модель- " + laptopsSelection.getName() + ", Объем ЖД- " + laptopsSelection.getHard() + ", Объем ОЗУ- " + laptopsSelection.getRam());
                }
                System.out.println("\tНоутбуки по цвету:");
                for (String showColor : listColor) {
                    System.out.println(showColor);
                }
            }

            if (item.getKey() == 5) {

                System.out.println();
                for (Laptop ollLaptops : Main.laptops) {
                    stringList.add(ollLaptops);
                }
                for (Laptop ollLaptopsList : stringList) {
                    System.out.println(ollLaptopsList.toString());
                }

            }

        }

    }
}
