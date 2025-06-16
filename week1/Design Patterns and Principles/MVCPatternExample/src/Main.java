public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ben", "CD005", "A");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();
        
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Display updated data
        controller.updateView();
    }
}
