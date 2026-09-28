//Main del patrón Abstract Factory.
public class MainAbstractFactory {
    public static void main(String[] args) {
        System.out.println("--- Sala Moderna ---");
        ClienteMuebleria clienteModerno = new ClienteMuebleria(new FabricaModerna());
        clienteModerno.amueblarSala();

        System.out.println();

        System.out.println("--- Sala Victoriana ---");
        ClienteMuebleria clienteVictoriano = new ClienteMuebleria(new FabricaVictoriana());
        clienteVictoriano.amueblarSala();
    }
}
