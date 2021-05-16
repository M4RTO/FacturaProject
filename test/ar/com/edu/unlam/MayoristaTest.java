package ar.com.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MayoristaTest {

    @Test
    public void probarExistenciaDeMayorista() {
        Mayorista mayorista = new Mayorista();

        Assert.assertNotNull(mayorista);
    }

    @Test
    public void probarSiElMayoristaTieneNombre() {
        Mayorista mayorista = new Mayorista();
        mayorista.setName("Los Locos S.A.");

        Assert.assertEquals(mayorista.getName(),"Los Locos S.A.");
    }

    @Test
    public void probarSiElMayoristaTieneFacturas() {
        Factura factura = new Factura();
        List<Factura> facturas = new ArrayList<>();
        facturas.add(factura);

        Mayorista mayorista = new Mayorista();
        mayorista.setFacturas(facturas);


        Assert.assertNotNull(mayorista.getFacturas());
    }

}
