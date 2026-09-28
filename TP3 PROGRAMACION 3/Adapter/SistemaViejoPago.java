//Adaptado (Adaptee): librería legacy que NO se puede modificar.
public class SistemaViejoPago {
    public void realizarTransaccion(int centavos, String moneda) {
        System.out.println("Librería Legacy: Procesando transacción de "
                + centavos + " centavos en " + moneda);
    }
}
