package apaw.rafael.patrones.strategy;

public class Libre implements ITipoNado {

    @Override
    public int obtenerMetros(int edad) {
        return edad * 5;
    }

}
