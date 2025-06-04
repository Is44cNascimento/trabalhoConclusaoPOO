public class Acessorio extends Peca implements Item {

    public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
    }


    @Override
    public void estoqueFinal() {
        System.out.println("Estoque de "+getDescricao() +": " + getQuantidade());
    }

    @Override
    public void venda(int quantidade) {
        if(getQuantidade() >= quantidade) {
            setQuantidade(getQuantidade() - quantidade);
            System.out.println("VENDA REALIZADA COM SUCESSO!!! \n"+"ESTOQUE DE "+getDescricao() +": " + getQuantidade());
        }
        else {
        System.out.println("QUANTIDADE INSUFICIENTE");
            System.out.println("ESTOQUE DE "+getDescricao() +": " + getQuantidade());
        }

        if(quantidade == 0){
            System.out.println("QUANTIDADE INVALIDA, DIGITE UM VALOR MAIOR QUE ZERO");
        }
    }



    @Override
    public void reposicaoEstoque() {
        if (getQuantidade() < getEstoqueMinimo()){
            setQuantidade(getEstoqueMaximo());


        }
        else {
            System.out.println("ESTOQUE ACIMA DA QUANTIDADE MINIMA");
            System.out.println("ESTOQUE DE "+getDescricao() +": " + getQuantidade() + "\n");
        }

    }
}
