package ingress.organizationtaskmanagement.Entity;

public enum Status {
    ACTIVE("Task is active,but not running"),
    ToDo("Task is running"),
    Done("Task is done");

    private final String message;
    Status(String message){
        this.message=message;
    }

    @Override
    public String toString(){
        return message;
    }
}
