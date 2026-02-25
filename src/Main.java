import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int currentYear = LocalDate.now().getYear();

        if (printLeapYear(currentYear)) {
            System.out.println("Високосный год: " + currentYear);
        } else {
            System.out.println("Не високосный год: " + currentYear);
        }


        recommendAppVersion(1, 2015);

        calculateDeliveryDays(95);
    }

    public static boolean printLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void recommendAppVersion(int os, int clientDeviceYear) {
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0) {
            System.out.println("Можете скачивать новую версию на iOS");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1) {
            System.out.println("Можете скачивать новую версию на Android");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }




        public static int calculateDeliveryDays ( int distance){

            if (distance < 20) {
                System.out.println("Дистанция: " + distance + " км. 1 день.");
                return 1;
            } else if (distance <= 60) {
                System.out.println("Дистанция: " + distance + " км. 2 дня.");
                return 2;
            } else if (distance <= 100) {
                System.out.println("Дистанция: " + distance + " км. 3 дня.");
                return 3;
            } else {
                System.out.println("Дистанция: " + distance + " км. Доставки нет.");
                return -1;
            }
        }
    }





