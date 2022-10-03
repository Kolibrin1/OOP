public class Taxi extends Avto{
    private String tariff;
    private int distance; // В километрах
    private int waitingtime; //в минутах

    Taxi(){
        super();
        tariff = "Econom";
        distance = 5;
        waitingtime = 5;
    }

    Taxi(String marka, int capacity, double volume, String tariff, int distance, int waitingtime){
        super(marka, capacity, volume);
        this.tariff = tariff;
        this.distance = distance;
        this.waitingtime = waitingtime;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWaitingtime() {
        return waitingtime;
    }

    public void setWaitingtime(int waitingtime) {
        this.waitingtime = waitingtime;
    }

    void retariff(String tarif){
        setTariff(tarif);
    }
    void print(){
        super.print();
        System.out.println("Tariff = " + getTariff() + " " + "Distance = " + getDistance() + " " + "Waiting Time = " + getWaitingtime());
    }

    int CallPrice(Taxi taxi){
        int price = 0;
        if(taxi.getTariff().equals("Econom")) {
            price += taxi.getDistance() * 30;
            if (taxi.getWaitingtime() > 5)
                price += (taxi.getWaitingtime() - 5) * 10;
        }
        else if(taxi.getTariff().equals("Comfort")){
            price += taxi.getDistance() * 40;
            if (taxi.getWaitingtime() > 5)
                price += (taxi.getWaitingtime() - 5) * 10;
        }
        else{
            price += taxi.getDistance() * 50;
            if (taxi.getWaitingtime() > 5)
                price += (taxi.getWaitingtime() - 5) * 10;
        }
        return price;
    }
}
