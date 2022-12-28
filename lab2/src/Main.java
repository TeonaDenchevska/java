public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Teona","1005098003","123221025");
        System.out.println("Name: "+s1.getName()+" Egn: "+s1.getName()+" F_num: "+s1.getfNum());

        Course c1=new Course("Math");
        Course c2=new Course("Biology");
        Course c3=new Course("Physics");

        Teacher t1=new Teacher("Maya","100369875",c1);
        System.out.println("My name is "+t1.getName()+" and i will be your teacher for discipline named "+t1.getCourse().getCourse());

    }
}