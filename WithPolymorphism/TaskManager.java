package WithPolymorphism;

public class TaskManager {
    public static void main(String[] args) {
        Task work = new WorkTask();
        Task personal = new PersonalTask();
        Task urgent = new UrgentTask();
        
        work.executeTask();
        personal.executeTask();
        urgent.executeTask();
    }
}
