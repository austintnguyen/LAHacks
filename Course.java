public class Course {

    String name;
    String id;
    double startTime;
    double endTime;
    boolean[] days; //Monday to Friday, Monday starts at 0


    public Course(String name, String id, double startTime, double endTime){
        this.name = name;
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        days = new boolean[5];
        for (int i = 0; i < days.length; i++) {
            days[i] = false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setStartTime(){

        this.startTime = startTime;

    }
    public double getStartTime(){
        return startTime;
    
    }
    public void setEndTime(){

        this.endTime = endTime;

    }
    public double getEndTime(){
        return endTime;
    
    }
    public boolean[] getDays(){
        return days;
    }

    private void addDay(int day) {
        days[day] = true;
    }

    private void removeDay(int day) {
        days[day] = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
}