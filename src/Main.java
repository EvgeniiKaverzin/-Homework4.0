public class Main {
    public static void main(String[] args) {
    // Домашняя работа 1
        System.out.println("Домашняя работа 1");

        // Задание 1;
        System.out.println("Задание 1");
        int yearsOld = 25;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (yearsOld < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, вам нужно немного подождать!");
        }

        // Задание 2;
        System.out.println("Задание 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет");
        }
        if (yearsOld >= 24) {
            System.out.println("Человек ходит на работу");
        }
        // Задание 3;
        System.out.println("Задание 3");
        int capasity = 102;
        int seatsCount = 60;
        int otherCount = capasity - seatsCount; // Стоячие места

        int seatsUsed = 25;
        int otherUsed = 12;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " Сидячих мест");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " Стоячих мест");
        }
        if (otherUsed == otherCount) {
            System.out.println("Стоячих мест нет");
        }

        }
    }