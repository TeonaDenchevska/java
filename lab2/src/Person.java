public class Person {
    private String name;
    private String EGN;
    public Person(){
        this.name = "";
        this.EGN = "";
    }
    public Person(String n, String e){
        this.name = n;
        this.EGN = e;
    }
    public void sayName(){
        System.out.println("My name is "+this.name);
    }
    public static void sayHi(){
        System.out.println("Hello world");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }
}