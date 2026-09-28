//Fachada: coordina los tres subsistemas para completar una reserva.
public class FachadaCine {
    private final SistemaCartelera cartelera;
    private final SistemaAsientos asientos;
    private final SistemaPagos pagos;

    public FachadaCine() {
        this.cartelera = new SistemaCartelera();
        this.asientos = new SistemaAsientos();
        this.pagos = new SistemaPagos();
    }

    public boolean reservar(String pelicula, int asientos) {
        System.out.println("=== Iniciando reserva ===");

        if (!cartelera.verificarFuncion(pelicula)) {
            System.out.println("Reserva fallida: película no disponible");
            return false;
        }

        if (!this.asientos.verificarDisponibilidad(asientos)) {
            System.out.println("Reserva fallida: asientos insuficientes");
            return false;
        }

        double monto = asientos * 250.0;
        if (!pagos.cobrar(monto)) {
            System.out.println("Reserva fallida: pago rechazado");
            return false;
        }

        System.out.println("Reserva exitosa: " + asientos + " asientos para " + pelicula);
        return true;
    }
}
