package AtividadeScrum;
 
public class Task {
    private String description;
    private boolean completed;
 
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }    
 
    public void markAsCompleted(){
        this.completed = true;
    }
 
    public String getDescription() {
        return this.description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public boolean isCompleted() {
        return this.completed;
    }
 
    public boolean getCompleted() {
        return this.completed;
    }
 
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}