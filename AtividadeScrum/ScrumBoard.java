package AtividadeScrum;
 
import java.util.ArrayList;
 
public class ScrumBoard {
    private ArrayList<Task> taskList;

    public ScrumBoard() {
        this.taskList =  new ArrayList<Task>();
    }
   
    public void addTask(Task task){
        if (taskList.contains(task)) {
            System.out.println("Tarefa já existe!");
        }else {
            taskList.add(task);
        }
    }

    public void removeTask(int taskIndex) {
        if (taskIndex < 0 || taskIndex >= taskList.size()) {
            System.out.println("Índice inválido!");
        }else {
            taskList.remove(taskIndex);
            System.out.println("Tarefa " + taskIndex + " removida com sucesso!");
        }
    }
   
    public void viewTaks(){
        if (taskList.isEmpty()) {
            System.out.println("Não há tarefas no quadro Scrum.");
        } else {
            System.out.println("Tarefas:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.printf(i + ": " + "[%s] - %s\n", (taskList.get(i).getCompleted() ? "COMPLETADA": "INCOMPELTA"), taskList.get(i).getDescription());
            }
        }
    }
    
    public void editTask(int taskIndex, String newDescription){
        if (taskIndex < 0 || taskIndex >= taskList.size()) {
            System.out.println("Índice inválido!");
        }else {
            taskList.get(taskIndex).setDescription(newDescription);
            System.out.println("Tarefa " + taskIndex + " removida com sucesso!");
        }
    }

    public void markTaskCompleted(int taskIndex){
        if (taskIndex < 0 || taskIndex >= taskList.size()) {
            System.out.println("Índice inválido!");
        }else {
            taskList.get(taskIndex).markAsCompleted();
            System.out.println("Tarefa " + taskIndex + " marcada como concluída!");
        }
    }
}