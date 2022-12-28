public class Vacation extends Traveling{
    private String hotelName;

    public Vacation(String destination, int days, double price,String hotelName) {
        super(destination, days, price);
        this.hotelName=hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double fixPrice(double price) {
        return price+(price*0.4);
    }
    public String toString() {
        return "Destination " +getDestination()+" Days:"+getDays()+" Price:"+getPrice()+ " Name of the hotel:" + hotelName;
    }
}
