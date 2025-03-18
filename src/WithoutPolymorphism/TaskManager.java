package WithoutPolymorphism;

public class TaskManager {
    public static void main(String[] args) {
        WorkTask work = new WorkTask();
        PersonalTask personal = new PersonalTask();
        UrgentTask urgent = new UrgentTask();
        
        work.executeWorkTask();
        personal.executePersonalTask();
        urgent.executeUrgentTask();
    }
}
