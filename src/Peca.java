public abstract class Peca  {

    private String descricao;
    private int quantidade;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public Peca(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }


    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }




}

