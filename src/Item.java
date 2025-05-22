import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] estoqueLoja = new Object[5];

        estoqueLoja[0] = new Acessorio("Relogio",5,5,1) ;
        estoqueLoja[1] = new RoupaPMG("Camisa",5,5,5,1,5);
        estoqueLoja[2] = new RoupaTamanhoUnico("Chapeu", 5,5,1);
        estoqueLoja[3] = new Acessorio("Pulseira",5,5,1) ;
        estoqueLoja[4] = new RoupaTamanhoUnico("Cachecol", 5,5,1);



        boolean sistemaContinua = true;

        //Ficou faltando criar a parte de interface, já foi criado o "estoque"
        //AMANHÃ: Criar a interface e revisar o código



        do {
            System.out.println("ESCOLHA UMA OPCAO DE COMPRA \n" +
                    "\n 0-Relogio\n" + "1-Camisa\n" + "2-Chapeu\n" + "3-Pulseira \n" + "4-Cachecol \n" + "5-Sair Do Sistema\n" + "9-Repor o Estoque");
                    int opc = sc.nextInt();

                    if (opc == 0) {
                        Acessorio relogio = (Acessorio) estoqueLoja[0];

                        System.out.println("Quantos relgios deseja comprar?");
                        int q = sc.nextInt();
                        relogio.venda(q);
                        
                    } if (opc == 1) {
                        RoupaPMG camisa = (RoupaPMG) estoqueLoja[1];
                        System.out.println("Qual tamnho de camisa deseja comprar?");
                        int t = sc.nextInt();
                        System.out.println("Quantas camisas deseja comprar?");
                        int q = sc.nextInt();
                        camisa.venda(q, t);

                        }if (opc == 2) {

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
