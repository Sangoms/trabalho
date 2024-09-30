public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.setCodigoProduto("01");
        fatura.setDescriçãoProduto("Whey Protein");
        fatura.setPrecoPorItem(150);
        fatura.setQuantidadeComprada(5);

        System.out.println(fatura.getCodigoProduto());
        System.out.println(fatura.getDescriçãoProduto());
        System.out.println(fatura.getPrecoPorItem());
        System.out.println(fatura.getFaturaTotal());


    }
}