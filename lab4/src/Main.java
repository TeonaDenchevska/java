public class Main {
    public static void main(String[] args) {
        try {
            Book b1 = new Book(50.5, 5, "Maya H", "Freedom");
            Television t1 = new Television(350.0, 3, "Quart", "Q152", 100);
            System.out.println(b1.toString());
            b1.setPrice(b1.checkPromo(15.));
            System.out.println(b1.toString());
            System.out.println(t1.toString());
            t1.setPrice(t1.checkPromo(9.));
            System.out.println(t1.toString());
        } catch (PriceException good) {
            System.out.println(good.getMessage());
        } catch (PowerException tv) {
            System.out.println(tv.getMessage());
        }
    }
}