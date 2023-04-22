import java.util.*;

public class Person {

private String name;
private ArrayList<Course> list;



public Person(String name, ArrayList<Course>list){

this.name = name;
this.list = list;

}

public void addCourse(Course course){

list.add(course);

}

public void removeCourse(String name){
    for(int i = 0; i<list.size();i++){
        if(list.get(i).name == name){
            list.remove(i);
        }
}

}

public String getName(){
return name;
}

public void setName(String name){
this.name = name;
}

public ArrayList<Course> getList(){
    return list;
}


}