package ar.com.edu.unlam;

public abstract class Articulo {

    private static final Double IVA = 21.00;
    protected static final Double DIVIDENDO = 100.00;
    private static final Double IMPUESTO_ADICIONAL = 15.00;


    private String name;
    private Integer quantity;
    private Double price;
    private Double tax;
    private ArticleType articleType;

    public Articulo(String name, Integer quantity, Double price, ArticleType articleType) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tax = 0.00;
        this.articleType = articleType;
    }

    public Articulo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }


    private Double calculateAdditionalTax() {
        return this.price * IMPUESTO_ADICIONAL / DIVIDENDO ;
    }

    public void addTax() {
        double tax =  this.price * IVA / DIVIDENDO;

        if(articleType == ArticleType.ARTICULO_BEBIDA || articleType == ArticleType.ARTICULO_PERFUME){
            Double additionalTax = this.calculateAdditionalTax();
            tax = tax + additionalTax;
        }
        this.setTax(tax);
        this.setPrice(this.price + tax);
    }

}
