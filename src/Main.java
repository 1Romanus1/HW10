import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        year();
        phone();
        delivery();
    }

    public static void year() {
        for (int i = 1900; i < 2026; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println("Високосный год: " + i);
            } else {
                System.out.println("Не високосный год: " + i);
            }
        }
    }

    public static void phone() {
        int os = 1;
        int yearPhone = 2019;
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearPhone;
        if (os == 0) {
            if (age < 10) {
                System.out.println("Можете скачивать новую версию на iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        } else if (os == 1) {
            if (age < 10) {
                System.out.println("Можете скачивать новую версию на Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void delivery() {
        int deliveryDistance = 95;
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




