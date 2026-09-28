//Componento concreto: café descafeinado sin aditivos.
public class CafeDescafeinado implements Cafe {
    @Override
    public double costo() {
        return 120.0;
    }

    @Override
    public String descripcion() {
        return "Café descafeinado";
    }
}
