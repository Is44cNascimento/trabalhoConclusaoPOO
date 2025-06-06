public class RoupaTamanhoUnico extends Peca implements Item {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
    }


    @Override
    public String descricao() {
        return super.getDescricao();
    }

    @Override
    public void venda(int quantidade) {
        if( quantidade == 1) {
            setQuantidade(getQuantidade() - quantidade);
            System.out.println("VENDA REALIZADA COM SUCESSO!!! \n"+"ESTOQUE DE ROUPA TAMANHO UNICO: " + getQuantidade());
        } if( quantidade  > 1) {
            System.out.println("QUANTIDADE ACIMA DO PERMITIDO, SOMENTE UMA VENDA POR PESSOA");
        } if (quantidade > getQuantidade()) {
            System.out.println("ESTOQUE INSUFICIENTE");
        }if(quantidade == 0){
            System.out.println("QUANTIDADE INVALIDA, DIGITE UM VALOR MAIOR QUE ZERO");
        }
    }

    @Override
    public void estoqueFinal() {
        System.out.println("Estoque de "+ getDescricao() +": " + getQuantidade());
    }


    @Override
    public void reposicaoEstoque() {
        if (getQuantidade() < getEstoqueMinimo()){
            setQuantidade(getEstoqueMaximo());
            System.out.println("ESTOQUE DE ROUPA TAMANHO UNICO: " + getQuantidade());
        }
        else {
            System.out.println("ESTOQUE ACIMA DA QUANTIDADE MINIMA");
            System.out.println("ESTOQUE DE ROUPA TAMANHO UNICO: " + getQuantidade() + "\n");
        }

    }
}
