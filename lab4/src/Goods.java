public abstract class Goods {
    private double price;
    private int number;

    public Goods(double price,int number)throws PriceException{
        setPrice(price);
        this.number=number;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException
    {
        if(price<=0){
            throw new PriceException();
        }
        {
            this.price = price;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", number=" + number +
                '}';
    }
    public abstract double checkPromo(double percent);

}
