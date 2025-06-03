
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] estoqueLoja = new Item[5];
        estoqueLoja[0] = new Acessorio("Relogio",0,5,1) ;
        estoqueLoja[1] = new RoupaPMG("Camisa",0,0,0,1,5);
        estoqueLoja[2] = new RoupaTamanhoUnico("Meia", 0,5,1);
        estoqueLoja[3] = new Acessorio("Pulseira",0,5,1) ;
        estoqueLoja[4] = new RoupaTamanhoUnico("Cachecol", 0,5,1);

        boolean sistemaContinua = true;

        do {

                 System.out.println("\nESCOLHA UMA OPCAO DE COMPRA ");
                 System.out.println( "\n0-Relogio\n" + "1-Camisa\n" + "2-Meia\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();


            if (opc == 0) {


                        System.out.println("Quantos relgios deseja comprar?");
                        int qR = sc.nextInt();
                        estoqueLoja[0].venda(qR);

                    } if (opc == 1) {
                        System.out.println("Quantas camisas deseja comprar?");
                            try{
                                int qR = sc.nextInt();
                                estoqueLoja[1].venda(qR);
                            }catch(InputMismatchException e){
                                System.out.println("Digite o numero correspondente  \n 1-P \n 2-M \n 3-G");
                                int qR = sc.nextInt();
                                estoqueLoja[1].venda(qR);

                            }

                        }if (opc == 2) {

                            System.out.println("Venda limitada a uma por pessoa \n Digite a quantidade de meia:");
                            int qM = sc.nextInt();
                            estoqueLoja[2].venda(qM);

                            }if (opc == 3) {
                                System.out.println("Quantas pulseiras deseja comprar?");
                                int qP = sc.nextInt();
                                estoqueLoja[3].venda(qP);

                                } if (opc == 4) {
                                    System.out.println("Quantos cachecos deseja comprar?");
                                    int qCa = sc.nextInt();
                                    estoqueLoja[4].venda(qCa);

                                    }if (opc == 5) {
                                        sistemaContinua = false;
                                        System.out.println("Obrigado por comprar com  a gente!!!");

                                        estoqueLoja[0].estoqueFinal();
                                        estoqueLoja[1].estoqueFinal();
                                        estoqueLoja[2].estoqueFinal();
                                        estoqueLoja[3].estoqueFinal();
                                        estoqueLoja[4].estoqueFinal();

                                        }if (opc == 9) {
                                            estoqueLoja[0].reposicaoEstoque();
                                            estoqueLoja[1].reposicaoEstoque();
                                            estoqueLoja[2].reposicaoEstoque();
                                            estoqueLoja[3].reposicaoEstoque();
                                            estoqueLoja[4].reposicaoEstoque();
                                        }
                                            if(opc!=0 && opc!=1 && opc!=2 && opc!=3 && opc!=4 && opc!=5){
                                            System.out.println("OPCAO INVALIDA!!!!!");
                                        }




        }while (sistemaContinua);


    }
}
