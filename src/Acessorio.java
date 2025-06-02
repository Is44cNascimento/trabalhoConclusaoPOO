public class Acessorio extends Peca implements Item {

    public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
    }


    @Override
    public void venda(int quantidade) {
        if(getQuantidade() >= quantidade) {
            setQuantidade(getQuantidade() - quantidade);
            System.out.println("ESTOQUE DE "+getDescricao() +": " + getQuantidade());
        }
        else {
        System.out.println("QUANTIDADE INSUFICIENTE");
            System.out.println("ESTOQUE DE "+getDescricao() +": " + getQuantidade());
        }
    }



    @Override
    public void reposicaoEstoque() {
        if (getQuantidade() <= getEstoqueMinimo()){
            setQuantidade(getEstoqueMaximo());
        }
        else {
            System.out.println("ESTOQUE ACIMA DA QUANTIDADE MINIMA");
            System.out.println("ESTOQUE DE "+getDescricao() +": " + getQuantidade() + "\n");
        }

    }
}
