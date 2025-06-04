import java.util.InputMismatchException;
import java.util.Scanner;

public class RoupaPMG implements Item {

    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getDescricao() {
        return descricao;
    }


    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }


    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }



    @Override
    public void estoqueFinal() {
        System.out.println("Estoque de roupa P: " + getQuantidadeP());
        System.out.println("Estoque de roupa M: " + getQuantidadeM());
        System.out.println("Estoque de roupa G: " + getQuantidadeG());
    }

    @Override
    public void venda(int qR) {

        Scanner sc = new Scanner(System.in);


        int quantidade = qR;


            System.out.println("Qual tamnho de camisa deseja comprar? \n 1-P \n 2-M \n 3-G");
            int tamanho = sc.nextInt();




            if(tamanho == 1){
                if(getQuantidadeP() >= quantidade) {
                    setQuantidadeP(getQuantidadeP() - quantidade);
                    System.out.println("ESTOQUE DE "+getDescricao() +" P: " + getQuantidadeP());
                }
                else {
                    System.out.println("QUANTIDADE INSUFICIENTE");
                    System.out.println("ESTOQUE DE "+getDescricao() +" P: " + getQuantidadeP());
                }

                if(quantidade == 0){
                    System.out.println("QUANTIDADE INVALIDA, DIGITE UM VALOR MAIOR QUE ZERO");
                }
            }if(tamanho == 2){
                if(getQuantidadeM() >= quantidade) {
                    setQuantidadeM(getQuantidadeM() - quantidade);
                    System.out.println("ESTOQUE DE "+getDescricao() +" M: " + getQuantidadeM());
                }
                else {
                    System.out.println("QUANTIDADE INSUFICIENTE");
                    System.out.println("ESTOQUE DE "+getDescricao() +" M: " + getQuantidadeM());
                }

                if(quantidade == 0){
                    System.out.println("QUANTIDADE INVALIDA, DIGITE UM VALOR MAIOR QUE ZERO");
                }
            }if(tamanho == 3){
                if(getQuantidadeG() >= quantidade) {
                    setQuantidadeG(getQuantidadeG() - quantidade);
                    System.out.println("ESTOQUE DE "+getDescricao() +" G: " + getQuantidadeG());
                }
                else {
                    System.out.println("QUANTIDADE INSUFICIENTE");
                    System.out.println("ESTOQUE DE "+getDescricao() +" G: " + getQuantidadeG());
                }

                if(quantidade == 0){
                    System.out.println("QUANTIDADE INVALIDA, DIGITE UM VALOR MAIOR QUE ZERO");
                }
            }if(tamanho != 1 && tamanho != 2 && tamanho != 3){
                System.out.println("Opcao de tamanho indisponivel !!!!");
            }


        }



    @Override
    public void reposicaoEstoque() {
        if (getQuantidadeP() < getEstoqueMinimo()){
            setQuantidadeP(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE P: " + getQuantidadeP());
        }else{
            System.out.println("ESTOQUE DE ROUPA P ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO P: " + getQuantidadeP());
        }

        if (getQuantidadeM() < getEstoqueMinimo()){
            setQuantidadeM(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE M: " + getQuantidadeM());

        }else{
            System.out.println("ESTOQUE DE ROUPA M ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO M: " + getQuantidadeM());
        }

        if(getQuantidadeG() < getEstoqueMinimo()){
            setQuantidadeG(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE G: " + getQuantidadeG());
        }else{
            System.out.println("ESTOQUE DE ROUPA G ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO G: " + getQuantidadeG() +"\n");
        }


         }







}
