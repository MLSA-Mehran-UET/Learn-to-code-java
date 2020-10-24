/**
 * State machine used for maintaining the state of the business logics.
 * This project has 4 state for a Task.
 * TODO -> InProgress -> Review -> Done
 */
public class StateMachineDemo {

    public static void main(String[] args) {
        TaskState taskState = null;

        TaskContext taskContext =  new TaskContext();

        //start task status as TODO initially.
        taskState = new TodoState();
        taskState.processTask(taskContext);

        //change task status to in progress after finish todo
        taskState = new InProgressState();
        taskState.processTask(taskContext);

        //change task status to review after finish in progress
        taskState = new ReviewState();
        taskState.processTask(taskContext);

        //change task status to done after finish review
        taskState = new DoneState();
        taskState.processTask(taskContext);
    }

}
