public class TodoState implements TaskState{
    @Override
    public void processTask(TaskContext context) {
        context.setTaskState(this);
        System.out.println("Processed Todo status successfully.");
    }
}
