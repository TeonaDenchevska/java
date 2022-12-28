public class Ship extends Vehicle implements IsSeaVehicle {
    public double deadWeight;

    public Ship(double maxspeed, String model, double price,double deadWeight) {
        super(maxspeed, model, price);
        this.deadWeight=deadWeight;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    public double checkPromo(double percent) {

        return getPrice()-(getPrice()*(percent/100));
    }
    public String toString() {
        return "Ship {"  + "maxspeed=" + this.getMaxspeed() + ", model='" + this.getModel() + '\'' + ", price=" + this.getPrice() +  "dead weight:" +deadWeight + '}';
    }
}
