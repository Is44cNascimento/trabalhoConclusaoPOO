
import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] estoqueLoja = new Object[5];

        estoqueLoja[0] = new Acessorio("Relogio",5,5,1) ;
        estoqueLoja[1] = new RoupaPMG("Camisa",5,5,5,1,5);
        estoqueLoja[2] = new RoupaTamanhoUnico("Meia", 5,5,1);
        estoqueLoja[3] = new Acessorio("Pulseira",5,5,1) ;
        estoqueLoja[4] = new RoupaTamanhoUnico("Cachecol", 5,5,1);



        boolean sistemaContinua = true;

        //Ficou faltando criar a parte de interface, já foi criado o "estoque"
        //AMANHÃ: Criar a interface e revisar o código



        do {
                 System.out.println("\nESCOLHA UMA OPCAO DE COMPRA ");
                 System.out.println( "\n0-Relogio\n" + "1-Camisa\n" + "2-Meia\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();
                    Acessorio relogio = (Acessorio) estoqueLoja[0];
                    RoupaPMG camisa = (RoupaPMG) estoqueLoja[1];
                    RoupaTamanhoUnico meia = (RoupaTamanhoUnico) estoqueLoja[2];
                    Acessorio pulseira = (Acessorio) estoqueLoja[3];
                    RoupaTamanhoUnico cachecol = (RoupaTamanhoUnico) estoqueLoja[4];


                    if (opc == 0) {


                        System.out.println("Quantos relgios deseja comprar?");
                        int qR = sc.nextInt();
                        relogio.venda(qR);
                        
                    } if (opc == 1) {

                        System.out.println("Qual tamnho de camisa deseja comprar? \n 1-P \n 2-M \n 3-G");
                        int t = sc.nextInt();
                        System.out.println("Quantas camisas deseja comprar?");
                        int qT = sc.nextInt();
                        camisa.venda(t, qT);

                        }if (opc == 2) {

                            System.out.println("Venda limitada a uma por pessoa \n Digite a quantidade de meia:");
                            int qM = sc.nextInt();
                            meia.venda(qM);

                            }if (opc == 3) {
                                System.out.println("Quantas pulseiras deseja comprar?");
                                int qP = sc.nextInt();
                                pulseira.venda(qP);

                                } if (opc == 4) {
                                    System.out.println("Quantos cachecos deseja comprar?");
                                    int qCa = sc.nextInt();
                                    cachecol.venda(qCa);

                                    }if (opc == 5) {
                                        sistemaContinua = false;
                                        System.out.println("Obrigado por comprar com  a gente!!!");

                                        }if (opc == 9) {
                                          relogio.reposicaoEstoque();
                                          camisa.reposicaoEstoque();
                                          meia.reposicaoEstoque();
                                          pulseira.reposicaoEstoque();
                                          cachecol.reposicaoEstoque();
                                        }



        }while (sistemaContinua);


    }
}
