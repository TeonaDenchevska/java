public class Course {
    String Course;
    public Course(String course)
    {
        this.Course=course;
    }
    public Course()
    {
        this.Course="";
    }

    public String getCourse() {
        return this.Course;
    }

    public void setCourse(String course) {
        this.Course = course;
    }
}
