package ar.com.edu.unlam;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class FacturaTest {

    @Test
    public void probarExistenciaDeFactura() {
        Factura factura = new Factura();

        Assert.assertNotNull(factura);
    }

    @Test
    public void probarSiFacturaTieneUnTotalPrice() {
        Factura factura = new Factura();
        factura.setTotal(0.00);

        Assert.assertNotNull(factura.getTotal());
    }

    @Test
    public void probarSiFacturaTieneUnaListaDeArticulos() {
        Factura factura = new Factura();
        Articulo articulo = new Perfume();
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(articulo);

        factura.setArticulos(articulos);

        Assert.assertNotNull(factura.getArticulos());
    }

    @Test
    public void probarTipoDeArticuloEnFactura(){
        List<Articulo> articulos = new ArrayList<>();
        Factura factura = new Factura();
        Articulo articulo = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);
        articulos.add(articulo);
        factura.setArticulos(articulos);

        Assert.assertEquals(factura.getArticulos().get(0), articulo);


    }

    @Test
    public void informarElValorTotalDeLaFactura(){
        List<Articulo> articulos = new ArrayList<>();
        Factura factura = new Factura();
        Perfume perfume = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);
        perfume.addTax();

        Bebida bebida = new Bebida(
                "Pepsi",
                2,
                12.00
        ,ArticleType.ARTICULO_BEBIDA);
        articulos.add(perfume);
        bebida.addTax();
        articulos.add(bebida);


        factura.setArticulos(articulos);

        factura.calculateTotal();

        Assert.assertEquals(29.92, factura.getTotal(), 0.0);

    }



}
