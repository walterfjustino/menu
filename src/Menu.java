
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

        public static void menu() throws Exception{
            System.out.println("|---------> MENU DE OPÇÕES: <--------");
            System.out.println("|      Selecione às opções abaixo:      |");
            System.out.println("|      1.  Opção: 1   |");
            System.out.println("|      2.  Opção: 2   |");
            System.out.println("|      3.  Opção: 3   |");
            System.out.println("|      4.  Sair       |");
        }


        public static void opcao1(){
            System.out.println("selecionado Opção: 1 ");
        }
        public static void opcao2(){
            System.out.println("selecionado Opção: 2 ");
        }
        
        public static void opcao3(){
            System.out.println("selecionado Opção: 3 ");
        }

        public static void opcao4(){
            System.out.println(" Opção: 4 -- Sair!");
        }
    
    

    public static void main(String[] args) throws Exception{
        

        int opcao; 
        try{

        Scanner menu = new Scanner(System.in);
     
               do{ 
                   menu();
                    opcao = menu.nextInt();
                    switch (opcao) {       
                        case 1:
                        opcao1();
                        break;
                        case 2:
                        opcao2();
                            break;   
                        case 3:
                       opcao3();
                            break;
                        case 4:
                        opcao4();
                            break;  
                        
                        default:
                        if(opcao <= 0 || opcao >= 5) 
                          System.out.println("Opção inválida selecionada"); 
                            break;
                    }                     
           } while(opcao != 4);    
           menu.close();
            }catch(InputMismatchException e){
                throw new Exception ("Não é permitido digitar Caracteres!!!");
            }
        } 
    }


