//Cliente: trabaja únicamente con la interfaz PasarelaPago.
public class ClientePago {
    private final PasarelaPago pasarela;

    public ClientePago(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }

    public void comprar(double monto) {
        System.out.println("Cliente: Iniciando compra de $" + monto);
        pasarela.pagar(monto);
        System.out.println("Cliente: Compra finalizada");
    }
}
