import java.util.ArrayList;
import java.util.Objects;
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
            System.out.println("\nESCOLHA UMA OPCAO DE COMPRA \n" +
                    "\n0-Relogio\n" + "1-Camisa\n" + "2-Meia\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();

                    if (opc == 0) {
                        Acessorio relogio = (Acessorio) estoqueLoja[0];

                        System.out.println("Quantos relgios deseja comprar?");
                        int qR = sc.nextInt();
                        relogio.venda(qR);
                        
                    } if (opc == 1) {
                        RoupaPMG camisa = (RoupaPMG) estoqueLoja[1];
                        System.out.println("Qual tamnho de camisa deseja comprar?");
                        int t = sc.nextInt();
                        System.out.println("Quantas camisas deseja comprar?");
                        int qT = sc.nextInt();
                        camisa.venda(qT, t);

                        }if (opc == 2) {
                            RoupaTamanhoUnico meia = (RoupaTamanhoUnico) estoqueLoja[2];
                            System.out.println("Venda limitada a uma por pessoa \n Digite a quantidade de meia:");
                            int qM = sc.nextInt();
                            meia.venda(qM);

                            }if (opc == 3) {

                                } if (opc == 4) {

                                    }if (opc == 5) {
                                        sistemaContinua = false;
                                        System.out.println("Obrigado por comprar com  a gente!!!");

                                        }if (opc == 9) {
                                            Acessorio relogio = (Acessorio) estoqueLoja[0];








                                        }



        }while (sistemaContinua == true);


    }
}
