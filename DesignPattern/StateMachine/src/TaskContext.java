public class TaskContext {

    private TaskState taskState;

    public TaskContext(){
        taskState = null;
    }

    public void setTaskState(TaskState taskState){
        this.taskState = taskState;
    }

    public TaskState getTaskState(){
        return taskState;
    }

}
