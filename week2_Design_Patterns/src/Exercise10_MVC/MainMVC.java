package Exercise10_MVC;

public class MainMVC {
    public static void main(String[] args) {
        Student student = new Student("Alice", "1001", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
    }
}
