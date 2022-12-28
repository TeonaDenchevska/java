public abstract class Traveling {
    private String destination;
    private int days;
    private double price;

    public Traveling(String destination,int days,double price)
    {
        this.destination=destination;
        this.days=days;
        this.price=price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public abstract double fixPrice(double price);
}
