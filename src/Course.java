public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    // Method to add a teacher to the course
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Operation successful.");
        } else {
            System.out.println(t.name + " cannot teach this course.");
        }
    }

    // Method to print the assigned teacher
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Teacher for " + this.name + " course: " + courseTeacher.name);
        } else {
            System.out.println("No teacher assigned for the " + this.name + " course.");
        }
    }
}
