import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printLeapYear(1900);
        printLeapYear(2024);
        recommendAppVersion(1, 2015);
        delivery(95);
    }

    public static void printLeapYear(int year) {
        for (year = 1900; year <= 2026; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Високосный год: " + year);
            } else {
                System.out.println("Не високосный год: " + year);
            }
        }
    }

    public static void phone() {
        int os = 1;
        int clientDeviceYear = 2015;
        recommendAppVersion(os, clientDeviceYear);
    }

    public static void recommendAppVersion(int os, int clientDeviceYear) {
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0) {
            System.out.println("Можете скачивать новую версию на iOS");
        } else if (os == 1) {
            System.out.println("Можете скачивать новую версию на Android");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            System.out.println("Неизвестная операционная система");
        }
    }


    public static void delivery(int deliveryDistance) {
        deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка будет в течении одних суток: " + deliveryDistance + " км.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет в течении двух дней: " + deliveryDistance + " км.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка будет в течении трех дней: " + deliveryDistance + " км.");
        } else {
            System.out.println("Свыше 100 километров доставки нету: " + deliveryDistance + " км.");
        }
    }
}




