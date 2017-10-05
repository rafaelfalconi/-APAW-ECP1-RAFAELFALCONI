package apaw.rafael.patrones.strategy;

public class Espalda implements ITipoNado {

    @Override
    public int obtenerMetros(int edad) {
        // TODO Auto-generated method stub
        return 2 * edad;
    }

}
