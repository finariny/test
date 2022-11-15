package homework_lesson_2;

public class homework_base_task_2 {
    public static void main(String[] args) {
        // Базовая домашка
        // Задача № 2
        int ageChildren = 15;
        if (ageChildren < 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в среднюю школу");
        } else {
            System.out.println("Пошел в университет");
        }
    }
}
