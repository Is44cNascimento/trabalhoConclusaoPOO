import java.util.ArrayList;
import java.util.Objects;

public class Item {
    public static void main(String[] args) {


        Object[] estoqueLoja = new Object[4];

        estoqueLoja[0] = new Acessorio("Relogio",5,5,1) ;
        estoqueLoja[1] = new RoupaPMG("Camisa",5,5,5,1,5);
        estoqueLoja[2] = new RoupaTamanhoUnico("Chapeu", 5,5,1);
        estoqueLoja[3] = new Acessorio("Pulseira",5,5,1) ;
        estoqueLoja[4] = new RoupaTamanhoUnico("Cachecol", 5,5,1);


        boolean sistemaContinua = true;

        //Ficou faltando criar a parte de interface, já foi criado o "estoque"
        //AMANHÃ: Criar a interface e revisar o código

    }
}
