/**
 * Enum is used for define constant or final variables.
 */

public class EnumDemo {

    enum TASK_STATUS{
        TODO,
        IN_PROGRESS,
        REVIEW,
        DONE
    }

    public static void main(String[] args) {
        printStatusOfTheTask(TASK_STATUS.TODO);
        printStatusOfTheTask(TASK_STATUS.DONE);
        printStatusOfTheTask(TASK_STATUS.IN_PROGRESS);
        printStatusOfTheTask(TASK_STATUS.REVIEW);
    }

    private static void printStatusOfTheTask(TASK_STATUS status){
        switch (status) {
            case TODO:
                System.out.printf("Task is still TODO, and anyone can assign it.\n");
                break;
            case IN_PROGRESS:
                System.out.printf("Task is in progress, hopefully, development is finish soon.\n");
                break;
            case REVIEW:
                System.out.println("Development is finished and ready for QA testing.\n");
                break;
            case DONE:
                System.out.printf("Tasks is finished successfully.\n");
                break;
        }
    }
}
