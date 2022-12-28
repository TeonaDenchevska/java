public class Main {
    public static void main(String[] args) {

        Car c1=new Car(200.,"BMW",15000,150.);
        Hovercraft h1=new Hovercraft(300,"Mercedes",20000,10);
        Ship s1=new Ship(150,"bW",10000,150.);
        System.out.println(c1.toString());
        c1.setPrice(c1.checkPromo(20.));
        System.out.println("New price:"+c1.toString());
        System.out.println(h1.toString());
        h1.setPrice(h1.checkPromo(3.));
        System.out.println("New price:"+h1.toString());
        System.out.println(s1.toString());
        s1.setPrice(s1.checkPromo(0.3));
        System.out.println("New price:"+s1.toString());

    }
}