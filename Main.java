import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter marka,moshnost,ob`em dvigatelya,tarif,distance,waittime");
        Scanner in = new Scanner(System.in);
        String marka = in.nextLine();
        int capacity = in.nextInt();
        in.nextLine();
        String tariff = in.nextLine();
        int distance = in.nextInt();
        int waitingtime = in.nextInt();

        Avto avto = new Avto(marka,capacity,2);
        Taxi taxi = new Taxi(avto.getMarka(), avto.getCapacity(),avto.getVolume(),tariff,distance,waitingtime);
        taxi.print();
        if((marka.equals("lada") || marka.equals("kia") || marka.equals("hyundai")) && (capacity <= 120))
            taxi.setTariff("Econom");
        else if((marka.equals("renault") || marka.equals("nissan")) && ((capacity > 120) && (capacity < 150)))
            taxi.setTariff("Comfort");
        else if (capacity > 150)
            taxi.setTariff("Business");
        taxi.print();
        System.out.println(taxi.CallPrice());
    }
}
