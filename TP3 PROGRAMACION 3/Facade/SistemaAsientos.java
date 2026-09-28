//Subsistema 2: verifica si hay suficientes asientos disponibles.
public class SistemaAsientos {
    public boolean verificarDisponibilidad(int asientos) {
        System.out.println("[Asientos] Verificando disponibilidad de " + asientos + " asientos");
        return asientos <= 50;
    }
}
