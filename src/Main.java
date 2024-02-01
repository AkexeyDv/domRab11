import java.time.LocalDate;

public class Main {
    public static void visoGod(int god) {
        if (((god % 4 == 0) && ((god % 100 != 0)) || (god % 400 == 0)) && god >= 1584) {
            System.out.println(god + " год - високосный");
        } else {
            System.out.println(god + " год - не високосный");
        }
    }

    public static void serviceMobile(int osName, int godMade) {
        int currentYear = LocalDate.now().getYear();
        String txtVer;
        String txtOsName;
        switch (osName) {
            case 0:
                txtOsName = "iOS";
                break;
            case 1:
                txtOsName = "Android";
                break;
            default:
                txtOsName = "2";
        }

        if (txtOsName.equals("2")) {
            System.out.println("Такого приложения нет в списке обновляемых систем");
        } else {
            if (godMade < currentYear) {
                txtVer = "Установите облегченную версию приложения для ";
            } else {
                txtVer = "Установите версию приложения для ";
            }
            System.out.println(txtVer + txtOsName + " по ссылке");
        }
    }

    public static int dostavkaCard(int dist){
        int srok=-1;
        if (dist<=20){
            srok=1;
        }
        if(dist>20&&dist<=60){
            srok=2;
        }
        if(dist>60&&dist<=100){
            srok=3;
        }
        if (dist>100){
            System.out.println("Доставки нет");
        }
        return srok;

    }
    public static void main(String[] args) {
        visoGod(1600);
        serviceMobile(0, 2024);
        System.out.println(dostavkaCard(5));

    }
}