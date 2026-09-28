//Decorador concreto: agrega crema al café.
public class ConCrema extends CafeDecorador {
    public ConCrema(Cafe cafeEnvuelto) {
        super(cafeEnvuelto);
    }

    @Override
    public double costo() {
        return super.costo() + 40.0;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " con crema";
    }
}
