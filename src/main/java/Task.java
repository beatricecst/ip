public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public boolean getStatus(Task task) {
        return task.isDone;
    }

    public String getDescription() {
        return "[" + getStatusIcon() + "] " +  this.description;
    }

    public void markDone() {
        this.isDone = true;
    }

    public void markUndone() {
        this.isDone = false;
    }
}
