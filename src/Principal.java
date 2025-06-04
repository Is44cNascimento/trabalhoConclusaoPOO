
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] novoItem = new Item[5];
        novoItem[0] = new Acessorio("Relogio",0,5,1) ;
        novoItem[1] = new RoupaPMG("Camisa",0,0,0,1,5);
        novoItem[2] = new RoupaTamanhoUnico("Meia", 0,5,1);
        novoItem[3] = new Acessorio("Pulseira",0,5,1) ;
        novoItem[4] = new RoupaTamanhoUnico("Cachecol", 0,5,1);

        boolean sistemaContinua = true;

        do {

                 System.out.println("\nESCOLHA UMA OPCAO DE COMPRA ");
                 System.out.println( "0-Relogio\n" + "1-Camisa\n" + "2-Meia\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();


            if (opc == 0) {


                        System.out.println("Quantos relgios deseja comprar?");
                        int quantidadeDeVenda = sc.nextInt();
                        novoItem[0].venda(quantidadeDeVenda);

                    } if (opc == 1) {
                        System.out.println("Quantas camisas deseja comprar?");
                            try{
                                int quantidadeDeVenda = sc.nextInt();
                                novoItem[1].venda(quantidadeDeVenda);
                            }catch(InputMismatchException A){
                                System.out.println("Digite o numero correspondente  \n 1-P \n 2-M \n 3-G");
                                int quantidadeDeVenda = sc.nextInt();
                                novoItem[1].venda(quantidadeDeVenda);

                            }

                        }if (opc == 2) {

                            System.out.println("Venda limitada a uma por pessoa \n Digite a quantidade de meia:");
                            int qM = sc.nextInt();
                            novoItem[2].venda(qM);

                            }if (opc == 3) {
                                System.out.println("Quantas pulseiras deseja comprar?");
                                int qP = sc.nextInt();
                                novoItem[3].venda(qP);

                                } if (opc == 4) {
                                    System.out.println("Quantos cachecos deseja comprar?");
                                    int quantidadeDeVenda = sc.nextInt();
                                    novoItem[4].venda(quantidadeDeVenda);

                                    }if (opc == 5) {
                                        sistemaContinua = false;
                                        System.out.println("Obrigado por comprar com  a gente!!!");

                                        novoItem[0].estoqueFinal();
                                        novoItem[1].estoqueFinal();
                                        novoItem[2].estoqueFinal();
                                        novoItem[3].estoqueFinal();
                                        novoItem[4].estoqueFinal();

                                        }if (opc == 9) {
                                            novoItem[0].reposicaoEstoque();
                                            novoItem[1].reposicaoEstoque();
                                            novoItem[2].reposicaoEstoque();
                                            novoItem[3].reposicaoEstoque();
                                            novoItem[4].reposicaoEstoque();
                                        }
                                            if(opc!=0 && opc!=1 && opc!=2 && opc!=3 && opc!=4 && opc!=5 && opc!=9){
                                            System.out.println("OPCAO INVALIDA!!!!!");
                                        }




        }while (sistemaContinua);


    }
}
