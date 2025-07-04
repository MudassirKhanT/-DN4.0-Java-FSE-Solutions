package Exercise5_Tasks;

public class MainTasks {
    public static void main(String[] args) {
        Task head = new Task(1, "Design", "Pending");
        head.next = new Task(2, "Development", "Pending");
        head.next.next = new Task(3, "Testing", "Pending");

        System.out.println("Traverse tasks:");
        Task current = head;
        while (current != null) {
            System.out.println(current.taskId + " - " + current.taskName + ": " + current.status);
            current = current.next;
        }
    }
}
