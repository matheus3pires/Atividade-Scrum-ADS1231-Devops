package AtividadeScrum;
 
import java.util.Scanner;
 
public class Main {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ScrumBoard scrumBoard = new ScrumBoard();
        String opcao = "";
 
        menu();
        opcao = leitor.next();
 
        while(!opcao.equals("sair")){
           
            if(opcao.equals("1")){
                String description;
                System.out.println("Digite a descrição da sua tarefa: ");
                leitor.nextLine();
                description = leitor.nextLine();
                scrumBoard.addTask(new Task(description));
            } else if(opcao.equals("2")){
                int taskIndex;
                System.out.println("Digite o índice da tarefa a ser apagada: ");
                taskIndex = leitor.nextInt();
                scrumBoard.removeTask(taskIndex);
            } else if(opcao.equals("3")){
                scrumBoard.viewTaks();
            } else if(opcao.equals("4")){
                int taskIndex;
                String newDescription;
                System.out.println("Digite o índice da tarefa a ser editada: ");
                taskIndex = leitor.nextInt();
                System.out.println("Digite a nova descrição da tarefa: ");
                leitor.nextLine();
                newDescription = leitor.nextLine();
                scrumBoard.editTask(taskIndex, newDescription);
            } else if(opcao.equals("5")){
                int taskIndex;
                System.out.println("Digite o índice da tarefa a ser marcada como concluída: ");
                taskIndex = leitor.nextInt();
                scrumBoard.markTaskCompleted(taskIndex);
            }else {
                System.out.println("Opção inválida!");
            }
 
            menu();
            opcao = leitor.next();
        }
       leitor.close();
    }
   
    public static void menu(){
        System.out.println("x------------------------------------x");
        System.out.println("| Menu:                              |");
        System.out.println("| 1 - Adicionar Tarefa.              |");
        System.out.println("| 2 - Apagar Tarefa.                 |");
        System.out.println("| 3 - Visualizar Tarefas.            |");
        System.out.println("| 4 - Editar Tarefa.                 |");
        System.out.println("| 5 - Marcar Tarefa como concluídas. |");
        System.out.println("| sair - Sair do programa.           |");
        System.out.println("x------------------------------------x");
    }
}