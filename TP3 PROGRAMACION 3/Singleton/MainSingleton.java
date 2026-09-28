//Main del patrón Singleton.
public class MainSingleton {
    public static void main(String[] args) {
        // Primera inicialización con datos reales.
        ConfiguracionGlobal config = ConfiguracionGlobal.obtenerInstancia("GestiónVentas", "2.1", true);

        // Segunda llamada: devuelve la MISMA instancia.
        ConfiguracionGlobal config2 = ConfiguracionGlobal.obtenerInstancia();

        System.out.println("¿Misma instancia? " + (config == config2));
        System.out.println("Nombre app: " + config.getNombreApp());
        System.out.println("Versión: " + config.getVersion());
        System.out.println("Modo debug: " + config.isModoDebug());
        System.out.println();

        ModuloInterfaz interfaz = new ModuloInterfaz();
        interfaz.mostrarDatosApp();

        ModuloNegocio negocio = new ModuloNegocio();
        negocio.ejecutarOperacion();
    }
}
