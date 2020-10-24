public class ReviewState implements TaskState{
    @Override
    public void processTask(TaskContext context) {
        context.setTaskState(this);
        System.out.println("Processed Review status successfully.");
    }
}
