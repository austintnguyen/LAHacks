import java.util.*;

public class Person {

    private String name;
    private ArrayList<Course> list;

    public Person() {
        this.name = "John Doe";
        list = new ArrayList<>();
    }

    public Person(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void addCourse(Course course) {
        list.add(course);
    }

    public void removeCourse(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name == name) {
                list.remove(i);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getList() {
        return list;
    }

    public void printPerson() {
        System.out.println("Name: "+name);
        System.out.println("Courses:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

}