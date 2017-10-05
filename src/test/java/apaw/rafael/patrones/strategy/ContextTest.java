package apaw.rafael.patrones.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContextTest {

    @Test
    public void test() {
       Context context =new Context(new Libre());
       assertEquals(10,context.executeTipoNado(2));
       context =new Context(new Espalda());
       assertEquals(4,context.executeTipoNado(2));
    }

}
