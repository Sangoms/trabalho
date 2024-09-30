public class Fatura {

    public String codigoProduto;
    public String descriçãoProduto;
    public int quantidadeComprada;
    public double precoPorItem;
    public double faturaTotal;
    
    public String getCodigoProduto(){
        return codigoProduto;
     }

    public void setCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    
    }

    public String getDescriçãoProduto(){
        return descriçãoProduto;
    
    }

    public void setDescriçãoProduto(String descriçãoProduto){
        this.descriçãoProduto = descriçãoProduto;
        
    }

    public int getQuantidadeComprada(){
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada){
        this.quantidadeComprada = quantidadeComprada;
    }
    
    public double getPrecoPorItem(){
        return precoPorItem;

    }

    public void setPrecoPorItem(double precoPorItem){
        this.precoPorItem = precoPorItem;

    }
    public double getFaturaTotal(){
        if(precoPorItem > 0 && quantidadeComprada > 0){
            faturaTotal = (precoPorItem * quantidadeComprada);
        }else{
            precoPorItem = 0;
            quantidadeComprada = 0;
        }
        return faturaTotal;
    
    }

}