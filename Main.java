public class Main{
    public static void main(String args[]){
        Person p = new Person();
        Course cse12 = new Course("CSE 12", "A01", 900, 950, "10101");
        p.addCourse(cse12);
        p.printPerson();
    }
}