import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        System.out.println("|---------> MENU DE OPÇÕES: <--------");
        System.out.println("|      Selecione às opções abaixo:      |");
        System.out.println("|      1.  Opção: 1   |");
        System.out.println("|      2.  Opção: 2   |");
        System.out.println("|      3.  Opção: 3   |");
        System.out.println("|      4.  Sair       |");

        Scanner menu = new Scanner(System.in);

        System.out.println(" Selecione uma opção: ");
       
        
        try{
             int opcao = menu.nextInt();
            if(opcao == menu.nextInt()){
                switch (opcao) {
                case 1:
                System.out.println("Opção 1 selecionada");
                    break;
                case 2:
                System.out.println("Opção 2 selecionada"); 
                    break;   
                case 3:
                System.out.println("Opção 3 selecionada");
                    break;
                case 4:
                System.out.println("Sair");
                    break;
                default:
                System.out.println("Opção inválida selecionada");
                    break;
             
                } 
            }
        }
                                    
         catch(Exception e){
            System.err.println("Opção digitada não confere com às opções do MENU");
        
        } 

    }
}
