//Componento concreto: café simple sin aditivos.
public class CafeSimple implements Cafe {
    @Override
    public double costo() {
        return 100.0;
    }

    @Override
    public String descripcion() {
        return "Café simple";
    }
}
