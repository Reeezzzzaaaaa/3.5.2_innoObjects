package objects.task_2;

public class Task2 {
    public static void main(String[] args) {

        //    Flat flat1 = new Flat(15, 86, 2, 77, true, false, false, 15000000);;
        //    System.out.println("Адрес: " + flat1.address + ", "
        //    + "Этаж: " + flat1.flow + ", "
        //    + "Номер квартиры: " + flat1.number + ", "
        //    + "Количество комнат: " + flat1.rooms + ", "
        //    + "Площадь квартиры: " + flat1.square + ", "
        //    + "В продаже: " + flat1.isOnSale + ", "
        //    + "Ремонт: " + flat1.isRepair + ", "
        //    + "Вид на реку: " + flat1.isRiverView);
        //}
        Flat flat1 = new Flat();
        flat1.flow = 15;
        flat1.number = 86;
        flat1.rooms = 2;
        flat1.square = 77;
        flat1.isOnSale = true;
        flat1.isRepair = false;
        flat1.isRiverView = false;
    }
}
