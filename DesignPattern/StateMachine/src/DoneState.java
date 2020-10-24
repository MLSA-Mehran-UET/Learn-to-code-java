public class DoneState implements TaskState{
    @Override
    public void processTask(TaskContext context) {
        context.setTaskState(this);
        System.out.println("Processed Done status successfully.");
    }
}
