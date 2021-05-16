package ar.com.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ArticuloTest {

    @Test
    public void probarExistenciaDeArticulo() {
        Articulo articulo = new Perfume( );

        Assert.assertNotNull(articulo);
    }

    @Test
    public void probarAtributosDeArticulo() {
        Articulo articulo = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);

        Assert.assertEquals(articulo.getName(),"Kevin");
        Assert.assertEquals(articulo.getQuantity(), Integer.valueOf(2));
        Assert.assertEquals(10.00, articulo.getPrice(), 0.0);
    }

    @Test
    public void probarQueElArticuloPongaElImpuestoCorrespondiente() {
        Articulo articulo = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);

        articulo.addTax();

        Assert.assertEquals(3.6, articulo.getTax(), 0.0);
        Assert.assertEquals(13.6, articulo.getPrice(), 0.0);

    }

    @Test
    public void probarQueElArticuloPongaElImpuestoCorrespondienteSumandoElAdicionalParaPerfume() {
        Perfume perfume = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);

        perfume.addTax();

        Assert.assertEquals(3.6, perfume.getTax(), 0.0);
        Assert.assertEquals(13.6, perfume.getPrice(), 0.0);
    }

    @Test
    public void probarQueElArticuloPongaElImpuestoCorrespondienteSumandoElAdicionalParaBebidas() {
        Perfume perfume = new Perfume(
                "Kevin",
                2,
                10.00,
                ArticleType.ARTICULO_PERFUME);

        perfume.addTax();

        Assert.assertEquals(3.6, perfume.getTax(), 0.0);
        Assert.assertEquals(13.6, perfume.getPrice(), 0.0);
    }


}
