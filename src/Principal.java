
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] novoItem = new Item[5];
        novoItem[0] = new Acessorio("Relogio",5,5,2) ;
        novoItem[1] = new RoupaPMG("Camisa",2,2,2,2,5);
        novoItem[2] = new RoupaTamanhoUnico("Meia", 1,5,1);
        novoItem[3] = new Acessorio("Pulseira",0,5,1) ;
        novoItem[4] = new RoupaTamanhoUnico("Cachecol", 0,5,1);

        boolean sistemaContinua = true;

        do {
                 System.out.println("\nESCOLHA UMA OPCAO DE COMPRA ");
                 System.out.println( "0-Relogio\n" + "1-Camisa\n" + "2-Meia\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();

            if (opc == 5) {
                for(int i = 0; i<novoItem.length; i++) {
                    System.out.println("Obrigado por comprar com  a gente!!!");
                    novoItem[i].estoqueFinal();
                    sistemaContinua = false;
                }
            }


            if(opc == 9) {
                for(int i = 0; i<novoItem.length; i++) {
                    novoItem[i].reposicaoEstoque();
                }

                for(int i = 0; i< 5; i++) {
                    novoItem[i].estoqueFinal();
                }
            }

            if(opc != 5 && opc != 9) {
               try {
                   System.out.println("Quantos " + novoItem[opc].descricao() + " deseja comprar?");
                   int quantidadeDeVenda = sc.nextInt();
                   novoItem[opc].venda(quantidadeDeVenda);
               } catch (Exception e) {
                   System.out.println("Digite o numero correspondente ao tamanho 1-P 2-M 3-G");
                   int quantidadeDevenda=sc.nextInt();
                   System.out.println("ENTENDIDO 1-SIM OU 2-NAO");

               }
            }

        }while (sistemaContinua);

    }
}
