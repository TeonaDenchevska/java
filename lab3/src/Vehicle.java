public abstract class Vehicle {
    private double maxspeed;
    private String model;
    private double price;
    public Vehicle(double maxspeed,String model,double price)
    {
        this.maxspeed=maxspeed;
        this.model=model;
        this.price=price;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "maxspeed=" + maxspeed + ", model='" + model + '\'' + ", price=" + price + '}';
    }
    public   abstract   double   checkPromo(double percent);
}
