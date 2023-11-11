import java.util.*;

public class House {
        public static void main(String[] args) {
            HashMap<String, Integer> neighbors = new HashMap<>();
            neighbors.put("Иванов Иван Иванович ", 15);
            neighbors.put("Владимир Владимирович Путин ", 81);
            neighbors.put("Владимир Владимирович Левандовский ", 19);
            neighbors.put("Владимир Владимирович Горецкий ", 26);
            neighbors.put("Владимир Владимирович Кокорин ", 57);
            neighbors.put("Владимир Владимирович Стэтхемович ", 5);
            neighbors.put("Владимир Владимирович Вездеславович ", 36);
            neighbors.put("Владимир Владимирович Захват ", 7);

            ArrayList<String> arrayList = new ArrayList<>();
            Map.Entry<String, Integer> adultsPeople = null;
            for (Map.Entry<String, Integer> entry : neighbors.entrySet()) {
                if (entry.getValue() > 18) {
                    adultsPeople = entry;
                    arrayList.add(entry.getKey());
                    System.out.println(adultsPeople);
                }
            }

            System.out.println(" ");
            System.out.println("Список до: ");

            for (String counter : arrayList){
                System.out.print(counter + " , ");
            }

            System.out.println(" ");
            Collections.sort(arrayList);

            System.out.println("Список после: ");
            for (String counter : arrayList){
                System.out.print(counter + " , ");
            }

//            System.out.println(" ");
//            System.out.print("Список до сортировки: " + arrayList);
        }
}
