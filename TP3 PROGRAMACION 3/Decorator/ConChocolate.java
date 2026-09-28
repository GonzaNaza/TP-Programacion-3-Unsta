//Decorador concreto: agrega chocolate al café.
public class ConChocolate extends CafeDecorador {
    public ConChocolate(Cafe cafeEnvuelto) {
        super(cafeEnvuelto);
    }

    @Override
    public double costo() {
        return super.costo() + 50.0;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " con chocolate";
    }
}
