public class Television extends Goods implements ElectricalAppliance{
    private String manufacturer;
    private String model;
    private int power;

    public Television(double price, int number,String manufacturer,String model,int power)throws PriceException,PowerException {
        super(price, number);
        this.manufacturer=manufacturer;
        this.model=model;
        setPower(power);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws PowerException
    {
        if(power<=0){
            throw new PowerException();
        }
        else {
            this.power = power;
        }
    }

    public double checkPromo(double percent) {
        return getPrice()-(getPrice()*(percent/100));
    }

    @Override
    public double electricalEnergy(int time) {
        return getPower()*time;
    }

    @Override
    public String toString() {
        return "Television{" +
                "price:"+getPrice()+
                "number:"+getNumber()+
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
