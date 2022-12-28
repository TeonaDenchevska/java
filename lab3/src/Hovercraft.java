public class Hovercraft extends Vehicle implements IsLandVehicle,IsSeaVehicle
{
    private int passengers;
    public Hovercraft(double maxspeed, String model, double price,int passengers) {
        super(maxspeed, model, price);
        this.passengers=passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public double checkPromo(double percent) {

        return getPrice()-(getPrice()*(percent/100));
    }
    public String toString() {
        return "Hovercraft{"  + "maxspeed=" + this.getMaxspeed() + ", model='" + this.getModel() + '\'' + ", price=" + this.getPrice() +  "passengers=" +passengers + '}';
    }

}
