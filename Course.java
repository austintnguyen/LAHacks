public class Course {

    String name;
    String section;
    double startTime;
    double endTime;
    boolean[] days; //Monday to Friday, Monday starts at 0

    public Course() {
        this.name = "XXX 00";
        this.section = "X01";
        this.startTime = 0000;
        this.endTime = 1200;
        days = new boolean[5];
        for (int i = 0; i < days.length; i++) {
            days[i] = false;
        }
    }

    /**
     * 
     * @param name
     * @param section
     * @param startTime
     * @param endTime
     * 
     * Course must be constructed with its full data or it will fail
     * For schedule, 0 represents no class, 1 represents class
     */
    public Course(String name, String section, double startTime, double endTime, String dayWithClass){
        if (name == null || section == null) {
            return;
        }

        this.name = name;
        this.section = section;
        this.startTime = startTime;
        this.endTime = endTime;
        days = new boolean[5];
        for (int i = 0; i < days.length; i++) {
            if (dayWithClass.charAt(i) == '1') {
                days[i] = true;
            }
            else {
                days[i] = false;
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setStartTime(double startTime){
        this.startTime = startTime;
    }

    public double getStartTime(){
        return startTime;
    }

    public void setEndTime(double endTime){
        this.endTime = endTime;
    }

    public double getEndTime(){
        return endTime;
    }

    public double getDuration() {
        return endTime - startTime;
    }

    public boolean[] getDays() {
        return days;
    }

    public void addDay(int day) {
        days[day] = true;
    }

    public void removeDay(int day) {
        days[day] = false;
    }
}