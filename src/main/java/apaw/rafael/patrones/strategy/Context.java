package apaw.rafael.patrones.strategy;

public class Context {
    private ITipoNado tipoNado;

    public Context(ITipoNado tipoNado) {
        super();
        this.tipoNado = tipoNado;
    }
    
   public int executeTipoNado(int edad) {
       return tipoNado.obtenerMetros(edad);
   }

   
    
}
