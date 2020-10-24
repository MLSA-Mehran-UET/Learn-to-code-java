public class InProgressState implements TaskState{
    @Override
    public void processTask(TaskContext context) {
        context.setTaskState(this);
        System.out.println("Processed InProgress status successfully.");
    }
}
