import java.util.*;

public class Calendar {

    private ArrayList<Course>[] list;

    public Calendar() {
        for (int i = 0; i < 5; i++) {
            list[i] = new ArrayList<Course>();
        }
    }

    public void inputCalendar(Person person) {

        for (int i = 0; i < person.getList().size(); i++) {
            for (int j = 0; j < 5; j++) {

                if (person.getList().get(i).getDays()[j]) {
                    list[j].add(person.getList().get(i));
                }

            }
        }

    }
}