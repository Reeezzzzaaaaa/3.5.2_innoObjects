package objects.task_3;

public class Task3 {

    public static void main(String[] args) {

        Item item1 = new Item("Коробка", 48418684, 243, "Желтый");
        item1.price = String.valueOf(54);
        System.out.println("\"" + item1.art + " - " + item1.name + " - " + item1.price + " - " + item1.count + " - " + item1.color + "\"") ;

        Item item2 = new Item("Лед", 1616816, 8184, "Белый");
        item2.price = String.valueOf(6);
        System.out.println("\"" + item2.art + " - " + item2.name + " - " + item2.price + " - " + item2.count + " - " + item2.color + "\"") ;

        Item item3 = new Item("Сироп", 46524681, 4811, "Коричневый");
        item3.price = String.valueOf(583);
        System.out.println("\"" + item3.art + " - " + item3.name + " - " + item3.price + " - " + item3.count + " - " + item3.color + "\"") ;

        Item item4 = new Item("Краска", 7289711, 556, "Красный");
        item4.price = String.valueOf(1357);
        System.out.println("\"" + item4.art + " - " + item4.name + " - " + item4.price + " - " + item4.count + " - " + item4.color + "\"") ;

        Item item5 = new Item("Ночь", 1468486, 1, "Черный");
        System.out.println("\"" + item5.art + " - " + item5.name + " - " + item5.price + " - " + item5.count + " - " + item5.color + "\"") ;
    }
}
