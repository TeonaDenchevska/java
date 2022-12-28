public class Main {
    public static void main(String[] args) {

        Excursion e1=new Excursion("Spain",8,400.,10);
        System.out.println("Excursion: "+e1.toString());
        e1.setPrice(e1.fixPrice(e1.getPrice()));
        System.out.println("New price: "+e1.toString());
        System.out.println("The nights you will sleep in hotel: "+e1.nights(e1.getDays()));
        Vacation v1=new Vacation("Spain",8,400.,"Amor");
        System.out.println("Vacation "+v1.toString());
        v1.setPrice(v1.fixPrice(e1.getPrice()));
        System.out.println("New price"+v1.toString());

    }
}