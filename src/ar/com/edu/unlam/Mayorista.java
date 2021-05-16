package ar.com.edu.unlam;

import java.util.List;

public class Mayorista {

    private String name;
    private List<Factura> facturas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
