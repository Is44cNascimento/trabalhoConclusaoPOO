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





    public void venda(int tamanho, int quantidade) {
        if(tamanho == 1){
            if(getQuantidadeP() >= quantidade) {
                setQuantidadeP(getQuantidadeP() - quantidade);
                System.out.println("ESTOQUE DE "+getDescricao() +" P: " + getQuantidadeP());
            }
            else {
                System.out.println("QUANTIDADE INSUFICIENTE");
                System.out.println("ESTOQUE DE "+getDescricao() +" P: " + getQuantidadeP());
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
                        }if(tamanho == 3){
                            if(getQuantidadeG() >= quantidade) {
                                setQuantidadeG(getQuantidadeG() - quantidade);
                                System.out.println("ESTOQUE DE "+getDescricao() +" G: " + getQuantidadeG());
                            }
                            else {
                                System.out.println("QUANTIDADE INSUFICIENTE");
                                System.out.println("ESTOQUE DE "+getDescricao() +" G: " + getQuantidadeG());
                            }
                                }if(tamanho != 1 && tamanho != 2 && tamanho != 3){
                                        System.out.println("Opcao de tamanho indisponivel !!!!");
                                }

    }

    public void reposicaoEstoque() {
        if (getQuantidadeP() <= getEstoqueMinimo()){
            setQuantidadeP(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE P: " + getQuantidadeP());
        }else{
            System.out.println("ESTOQUE DE ROUPA P ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO P: " + getQuantidadeP());
        }

        if (getQuantidadeM() <= getEstoqueMinimo()){
            setQuantidadeM(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE M: " + getQuantidadeM());

        }else{
            System.out.println("ESTOQUE DE ROUPA M ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO M: " + getQuantidadeM());
        }

        if(getQuantidadeG() <= getEstoqueMinimo()){
            setQuantidadeG(getEstoqueMaximo());
            System.out.println("NOVO ESTOQUE M: " + getQuantidadeM());
        }else{
            System.out.println("ESTOQUE DE ROUPA G ESTA ACIMA DO MINIMO");
            System.out.println("ESTOQUE DE ROUPA TAMANHO G: " + getQuantidadeG() +"\n");
        }


         }







}
