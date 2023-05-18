package homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ведите строки");
            arrayList.add(scanner.nextLine());
        }

        int maxStrIndex = 0;
        int minStrIndex = 0;
        String withCap = "";
        // Найти наименьшую и наибольшую по длине строку в списке
        for (int i = 0; i < arrayList.size(); i++) {
           String arrayElement = arrayList.get(i);

            if (arrayList.get(maxStrIndex).length() < arrayElement.length()) {
                maxStrIndex = i;
            }
            if (arrayList.get(minStrIndex).length() > arrayElement.length()) {
                minStrIndex = i;
            }
//Вывести в консоль строку, содержащую заглавную букву
            for(int j = 0; j < arrayElement.length(); j++){
                if(Character.isUpperCase(arrayElement.charAt(j))){
                    withCap = arrayElement;
                }
            }

        }
  //      Удалить из списка наименьшую и наибольшую строки
        arrayList.remove(maxStrIndex);
        arrayList.remove(minStrIndex);
  //Вывести содержимое списка в консоль
        System.out.println("Большая буква:");
        System.out.println(withCap);
        System.out.println(arrayList.get(maxStrIndex));
        System.out.println(arrayList.get(minStrIndex));
        System.out.println(arrayList);
    }
}
