public class Avto {
    private String marka;
    private int capacity;
    private double volume;

    Avto() {
        marka = "hyundai";
        capacity = 120;
        volume = 1.5;
    }

    Avto(String marka, int capacity, double volume) {
        this.marka = marka;
        this.capacity = capacity;
        this.volume = volume;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    void print() {
        System.out.println("Mark = " + marka + " " + "Capacity = " + capacity + " " + "volume = " + volume);
    }
}


