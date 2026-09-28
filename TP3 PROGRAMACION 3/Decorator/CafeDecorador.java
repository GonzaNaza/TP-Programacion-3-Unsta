//Decorador abstracto: envuelve otro Cafe.
public abstract class CafeDecorador implements Cafe {
    protected final Cafe cafeEnvuelto;

    public CafeDecorador(Cafe cafeEnvuelto) {
        this.cafeEnvuelto = cafeEnvuelto;
    }

    @Override
    public double costo() {
        return cafeEnvuelto.costo();
    }

    @Override
    public String descripcion() {
        return cafeEnvuelto.descripcion();
    }
}
