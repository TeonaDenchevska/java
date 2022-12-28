public class Car extends Vehicle implements IsLandVehicle{
    private double power;


    public Car(double maxspeed, String model, double price,double power) {
        super(maxspeed, model, price);
        this.power=power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double checkPromo(double percent) {

        return getPrice()-(getPrice()*(percent/100));
    }

    @Override
    public String toString() {
        return "Car{"  + "maxspeed=" + this.getMaxspeed() + ", model='" + this.getModel() + '\'' + ", price=" + this.getPrice() +  "power=" + power + '}';
    }
}
