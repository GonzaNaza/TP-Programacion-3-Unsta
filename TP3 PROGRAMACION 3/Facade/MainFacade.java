//Main del patrón Facade.
public class MainFacade {
    public static void main(String[] args) {
        // Uso simplificado con la fachada.
        FachadaCine cine = new FachadaCine();

        System.out.println("--- Reserva 1 ---");
        cine.reservar("Avatar 2", 3);

        System.out.println();

        System.out.println("--- Reserva 2 ---");
        cine.reservar("Titanic", 60);
    }
}
