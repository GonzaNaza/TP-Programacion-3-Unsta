//Main del patrón Adapter.
public class MainAdapter {
    public static void main(String[] args) {
        SistemaViejoPago sistemaViejo = new SistemaViejoPago();
        PasarelaPago adaptador = new AdaptadorPago(sistemaViejo);
        ClientePago cliente = new ClientePago(adaptador);

        cliente.comprar(150.50);
        System.out.println();
        cliente.comprar(89.99);
    }
}
