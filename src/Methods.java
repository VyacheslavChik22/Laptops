import java.util.*;

public class Methods {
    static Map<Integer, String> criterion = new HashMap<>();
    static Set<Integer> ollVolumesHards = new HashSet<>();
    static Set<Integer> ollVolumesRam = new HashSet<>();
    static Set<String> ollOs = new HashSet<>();
    static Set<String> ollColors = new HashSet<>();
    static Map<Integer, Integer> parametersVolumesHard = new HashMap<>();
    static Map<Integer, Integer> parametersVolumesRam = new HashMap<>();
    static Map<Integer, String> parametersOs = new HashMap<>();
    static Map<Integer, String> parametersColor = new HashMap<>();
    static Map<Integer, String> information = new TreeMap<>();
    static Set<Laptop> stringList = new TreeSet<>();
    static int numberSelection = 0;
    static int numberSelectionHard = 0;
    static int numberSelectionRam = 0;
    static int numberSelectionOs = 0;
    static int numberSelectionColors = 0;

    public static void ollVolumesHard() {
        int i = 0;
        for (Laptop laptopsSelection : Main.laptops) {

            ollVolumesHards.add(laptopsSelection.getHard());
        }
        for (Integer volumesHards : ollVolumesHards) {
            i++;
            parametersVolumesHard.put(i, volumesHards);
        }
        for (Map.Entry<Integer, Integer> itemsVolumesHard : parametersVolumesHard.entrySet()) {
            System.out.println(itemsVolumesHard + " Gb");
        }
    }

    public static void ollVolumesRam() {
        int i = 0;
        for (Laptop laptopsSelection : Main.laptops) {

            ollVolumesRam.add(laptopsSelection.getRam());
        }
        for (Integer volumesRam : ollVolumesRam) {
            i++;
            parametersVolumesRam.put(i, volumesRam);
        }
        for (Map.Entry<Integer, Integer> itemsVolumesRam : parametersVolumesRam.entrySet()) {
            System.out.println(itemsVolumesRam + " Gb");
        }
    }

    public static void ollOs() {
        int i = 0;
        for (Laptop laptopsSelection : Main.laptops) {
            ollOs.add(laptopsSelection.getOs());
        }
        for (String volumesOs : ollOs) {
            i++;
            parametersOs.put(i, volumesOs);
        }
        for (Map.Entry<Integer, String> itemsVolumesOs : parametersOs.entrySet()) {
            System.out.println(itemsVolumesOs);
        }
    }

    public static void ollColors() {
        int i = 0;
        for (Laptop laptopsSelection : Main.laptops) {
            ollColors.add(laptopsSelection.getColor());
        }
        for (String amountColors : ollColors) {
            i++;
            parametersColor.put(i, amountColors);
        }
        for (Map.Entry<Integer, String> itemsColors : parametersColor.entrySet()) {
            System.out.println(itemsColors);
        }
    }

    public static void showParametersSelection() {
        criterion.put(1, "Hard");
        criterion.put(2, "Ram");
        criterion.put(3, "Operation System");
        criterion.put(4, "Color");
        criterion.put(5, "showOll");
        System.out.println("Вы можете выбрать ноутбук по этим параметрам:");
        for (Map.Entry<Integer, String> parameters : criterion.entrySet()) {
            System.out.println(parameters);
        }

    }

    public static void selectionNumberParameter() {
        String error = "Неправильно введен номер";
        System.out.println("Для выбора введите цифру нужного параметра");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            while (numberSelection != 6) {
                numberSelection = scanner.nextInt();
                if (numberSelection > 0 && numberSelection <= 6) {
                    if (numberSelection == 1) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection));
                        ollVolumesHard();
                        System.out.println("Введите цифру с интересующим вас объёмом жесткого диска.");
                        numberSelectionHard = scanner.nextInt();
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");

                    }
                    if (numberSelection == 2) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection));
                        ollVolumesRam();
                        System.out.println("Введите цифру с интересующим вас объёмом ОЗУ.");
                        numberSelectionRam = scanner.nextInt();
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                    }
                    if (numberSelection == 3) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection));
                        ollOs();
                        System.out.println("Введите цифру с интересующей вас операционной системой.");
                        numberSelectionOs = scanner.nextInt();
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
                    }
                    if (numberSelection == 4) {
                        information.put(numberSelection, "Вы выбрали параметр: " + numberSelection + " -" + criterion.get(numberSelection));
                        ollColors();
                        System.out.println("Введите номер цветового решения.");
                        numberSelectionColors = scanner.nextInt();
                        System.out.println("Для поиска введите цифру 6, или выберите дополнительные параметры поиска.");
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
                System.out.println("\tНоутбуки по запрошенному объёму жесткого диска: " + parametersVolumesHard.get(numberSelectionHard) + " Gb");
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getHard() == parametersVolumesHard.get(numberSelectionHard)) {
                        listHard.add("Hard " + laptopsSelection.getHard() + " Gb" + " : Модель- " + laptopsSelection.getName() + ", Операционная система- " + laptopsSelection.getOs() + ", Цвет- " + laptopsSelection.getColor());
                    }
                }
                for (String showHard : listHard) {
                    System.out.println(showHard);
                }
            }

            if (item.getKey() == 2) {
                System.out.println("\tНоутбуки по запрошенному объёму оперативной памяти: " + parametersVolumesRam.get(numberSelectionRam) + " Gb");
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getRam() == parametersVolumesRam.get(numberSelectionRam)) {
                        listRam.add("Ram " + laptopsSelection.getRam() + " GB" + " : Модель- " + laptopsSelection.getName() + ", Операционная система- " + laptopsSelection.getOs() + ", Цвет- " + laptopsSelection.getColor());
                    }
                }
                for (String showRam : listRam) {
                    System.out.println(showRam);
                }
            }

            if (item.getKey() == 3) {
                System.out.println("\tНоутбуки по запрошенной Оперативной системе: " + parametersOs.get(numberSelectionOs));
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getOs() == parametersOs.get(numberSelectionOs)) {
                        listOs.add("OS " + laptopsSelection.getOs() + " : Модель- " + laptopsSelection.getName() + ", Объем ЖД- " + laptopsSelection.getHard() + " Gb, Цвет- " + laptopsSelection.getColor());
                    }
                }
                for (String showOs : listOs) {
                    System.out.println(showOs);
                }
            }

            if (item.getKey() == 4) {
                System.out.println("\tНоутбуки по запрошенному цвету: " + parametersColor.get(numberSelectionColors));
                for (Laptop laptopsSelection : Main.laptops) {
                    if (laptopsSelection.getColor() == parametersColor.get(numberSelectionColors)) {
                        listColor.add("Color " + laptopsSelection.getColor() + " : Модель- " + laptopsSelection.getName() + ", Объем ЖД- " + laptopsSelection.getHard() + " Gb, Объем ОЗУ- " + laptopsSelection.getRam() + " Gb");
                    }
                }
                for (String showColor : listColor) {
                    System.out.println(showColor);
                }
            }

            if (item.getKey() == 5) {
                System.out.println();
                stringList.addAll(Main.laptops);
                for (Laptop ollLaptopsList : stringList) {
                    System.out.println(ollLaptopsList.toString());
                }

            }

        }

    }
}