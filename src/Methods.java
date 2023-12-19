import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
   static Map<Integer, String> criterion = new HashMap<>();
    public static void showParametersSelection(){

        criterion.put(1, "Hard");
        criterion.put(2, "Ram");
        criterion.put(3, "Operation System");
        criterion.put(4, "Color");
        System.out.println("Вы можете выбрать ноутбук по этим параметрам:");
        for (Map.Entry<Integer,String> parameters : criterion.entrySet()) {
            System.out.println(parameters);
        }

    }

    public static int selectionNumberParameter() {
        String error = "Неправильно введен номер";
        System.out.print("Для выбора введите цифру нужного параметра => ");
        Scanner scanner = new Scanner(System.in);
        int numberSelection = 0;
        if (scanner.hasNextInt()) {
            numberSelection = scanner.nextInt();
            if (numberSelection > 0 && numberSelection <= 4) {
                System.out.println("Вы выбрали параметр: " + numberSelection + " " + criterion.get(numberSelection) + ". Мы покажем вам какие модели у нас сейчас в наличии: ");
            } else {
                System.out.println(error);
            }
        }else {
            System.out.println(error);
        }
        scanner.close();
        return numberSelection;
    }






}
