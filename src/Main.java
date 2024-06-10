import item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // 1Создайте список чисел.С помощью метода forEach выведите каждое число в консоль по модулю.
        List<Integer> num = List.of(0, -3, 10, 9, -5);
        num.forEach(n -> System.out.println(Math.abs(n)));
        //2 Создайте класс Item с полями названия товара и стоимости товара. Создайте мапу,
        // хранящую товар и соответствующее ему число единиц товара.С помощью метода forEach получите все товары,
        // у которых осталось меньше 3 штук.
        Item item1 = new Item("Banana", 2.3);
        Item item2 = new Item("Potatoes", 2.4);
        Item item3 = new Item("Milk", 2.6);
        Map<Item, Integer> itemToCount = Map.of(
                item1, 20,
                item2, 30,
                item3, 2
        );
        List<Item> ending = new ArrayList<>();
        itemToCount.forEach((k, v) -> {
            if (v < 3) ending.add(k);
        });
        System.out.println(ending);
//        // 3 Создайте функциональный интерфейс для генерации случайных чисел в заданном диапазоне.Используйте лямбда-
//        // выражение для генерации числа.
//        NumberGenerator numberGenerator = (a,b)->{
//            Random random = new Random();
//            random.nextInt(a,b);
//        }


        // 4Создайте предикат для удаления из списка тех строк,что начинаются с определённой буквы.
        // Создайте список строк и удалите элементы с помощью метода removeIf,передав в него предикат.
        List<String> vegetables = new ArrayList<>();
        vegetables.add("onion");
        vegetables.add("tomato");
        vegetables.add("celery");
        vegetables.add("broccoli");
        System.out.println(vegetables);
        Predicate <String> letter = s -> s!=null && s.startsWith("b");
        System.out.println(vegetables.removeIf(letter));
    }
    @FunctionalInterface
    public interface NumberGenerator{
        int generateNumbers(int a,int b);
    }


}