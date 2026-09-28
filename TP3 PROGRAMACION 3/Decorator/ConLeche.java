//Decorador concreto: agrega leche al café.
public class ConLeche extends CafeDecorador {
    public ConLeche(Cafe cafeEnvuelto) {
        super(cafeEnvuelto);
    }

    @Override
    public double costo() {
        return super.costo() + 30.0;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " con leche";
    }
}
