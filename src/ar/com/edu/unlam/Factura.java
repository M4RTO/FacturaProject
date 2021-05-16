package ar.com.edu.unlam;

import java.math.BigDecimal;
import java.util.List;

public class Factura {

    private Double total;
    private List<Articulo> articulos;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void calculateTotal() {
        Double total = 0.00;
        for (Articulo articulo : this.articulos ){
            total += articulo.getPrice();
        }
        this.setTotal(total);
    }
}
