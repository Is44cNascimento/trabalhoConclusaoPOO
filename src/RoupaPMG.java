public class RoupaPMG {
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





    public void venda(int quantidade) {


    }

    public void reposicaoEstoque() {
        if (getQuantidadeP() <= getEstoqueMinimo()){
            setQuantidadeP(getEstoqueMaximo());
        }else{
            System.out.println("ESTOQUE DE ROUPA P ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO P: " + getQuantidadeP());
        }

        if (getQuantidadeM() <= getEstoqueMinimo()){
            setQuantidadeM(getEstoqueMaximo());
        }else{
            System.out.println("ESTOQUE DE ROUPA M ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO M: " + getQuantidadeM());
        }

        if(getQuantidadeG() <= getEstoqueMinimo()){
            setQuantidadeG(getEstoqueMaximo());
        }else{
            System.out.println("ESTOQUE DE ROUPA G ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO G: " + getQuantidadeG());
        }


        System.out.println("\n ROUPA P:" + getQuantidadeP() + "\n ROUPA M:" + getQuantidadeM() + "\n ROUPA G:" + getQuantidadeG());
    }







}
