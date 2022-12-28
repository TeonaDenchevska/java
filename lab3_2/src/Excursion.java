public class Excursion extends Traveling implements NumbersOfNights{
    private int hotel_numbers;

    public Excursion(String destination, int days, double price,int hotel_days) {
        super(destination, days, price);
        this.hotel_numbers=hotel_days;
    }

    public int getHotel_days() {
        return hotel_numbers;
    }

    public void setHotel_days(int hotel_days) {
        this.hotel_numbers = hotel_days;
    }

    public double fixPrice(double price) {
        return price+(price*0.1);
    }

    @Override
    public String toString() {
        return "Destination: " +getDestination()+" Days: "+getDays()+" Price:"+getPrice()+ " Number of hotels:" + hotel_numbers ;
    }

    @Override
    public int nights(int days) {
        return days-2;
    }
}
