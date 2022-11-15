package homework_lesson_2;

public class homework_base_task_3 {
    public static void main(String[] args) {
        // Базовая домашка
        // Задача № 3

        //Курица
        boolean chicken = true;
        //Овощи
        boolean vegetables = true;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = false;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;

        boolean caesar = chicken && vegetables && sour && toast;
        boolean olivier = vegetables && (sausage || chicken) && eggs;
        if (caesar) {
            System.out.println("Цезарь");
        } else if (olivier) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("Ничего нет");
        }
    }
}
