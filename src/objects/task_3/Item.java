package objects.task_3;

public class Item {

    String name;
    int art;
    String price = "Отсутствует";
    int count;
    String color;

    public Item(String itemName, int itemArt, int itemCount, String itemColor) {
        name = itemName;
        art = itemArt;
        count = itemCount;
        color = itemColor;
    }
}
