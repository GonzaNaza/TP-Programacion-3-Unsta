//Adaptador: implementa PasarelaPago y delega en SistemaViejoPago.
public class AdaptadorPago implements PasarelaPago {
    private final SistemaViejoPago sistemaViejo;

    public AdaptadorPago(SistemaViejoPago sistemaViejo) {
        this.sistemaViejo = sistemaViejo;
    }

    @Override
    public void pagar(double monto) {
        int centavos = (int) Math.round(monto * 100);
        System.out.println("Adaptador: Convirtiendo " + monto + " a " + centavos + " centavos");
        sistemaViejo.realizarTransaccion(centavos, "ARS");
    }
}
