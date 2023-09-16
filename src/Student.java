public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    // Method to add exam notes for courses
    public void addBulkExamNote(int mathNote, int physicsNote, int chemistryNote) {
        if (mathNote >= 0 && mathNote <= 100) {
            this.math.note = mathNote;
        }

        if (physicsNote >= 0 && physicsNote <= 100) {
            this.physics.note = physicsNote;
        }

        if (chemistryNote >= 0 && chemistryNote <= 100) {
            this.chemistry.note = chemistryNote;
        }
    }

    // Method to check if the student passed
    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Exam grades are not fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed.");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    // Method to calculate the average
    public void calcAverage() {
        this.average = (this.physics.note + this.chemistry.note + this.math.note) / 3.0;
    }

    // Method to check if the student passed based on the average
    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    // Method to print exam notes
    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Math Grade: " + this.math.note);
        System.out.println("Physics Grade: " + this.physics.note);
        System.out.println("Chemistry Grade: " + this.chemistry.note);
    }
}
