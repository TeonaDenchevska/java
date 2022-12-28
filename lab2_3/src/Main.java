public class Main {
    public static void main(String[] args) {

        Electronic e1=new Electronic(70.0,"i7");
        e1.TurnOff();
        e1.TurnOn();
        e1.TurnOn();
        e1.TurnOff();
        Laptop l1=new Laptop(50.0,"i5",8,256);
        Laptop l2=new Laptop(50.0,"i7",16,512);
        System.out.println("Laptop1:"+l1.toString());
        System.out.println("Laptop2:"+l2.toString());
        System.out.println("Laptop1 is better than laptop2:"+l1.isBetter(l2));
        System.out.println("Laptop2 is better than laptop1:"+l2.isBetter(l1));


    }
}