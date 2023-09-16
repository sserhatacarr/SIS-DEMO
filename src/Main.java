public class Main {
    public static void main(String[] args) {
        // Create courses
        Course math = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHM101", "CHM");

        // Create teachers
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Graham Bell", "90550000001", "PHY");
        Teacher t3 = new Teacher("Külyutmaz", "90550000002", "CHM");

        // Assign teachers to courses
        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        // Create students and add exam notes
        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();

        Student s3 = new Student("Tulumba Hayri", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
    }
}
