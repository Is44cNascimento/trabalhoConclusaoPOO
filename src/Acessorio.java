public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
    }

    @Override
    public void venda(int quantidade) {
        if(getQuantidade() > quantidade) {
            setQuantidade(getQuantidade() - quantidade);
        }
        else {
        System.out.println("QUANTIDADE INSUFICIENTE");
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (getQuantidade() < getEstoqueMinimo()){
            setQuantidade(getEstoqueMaximo());
        }
        else {
            System.out.println("ESTOQUE ACIMA DA QUANTIDADE MINIMA");
        }

    }
}
