//Cliente: módulo que lee la configuración global.
public class ModuloInterfaz {
    public void mostrarDatosApp() {
        ConfiguracionGlobal config = ConfiguracionGlobal.obtenerInstancia();
        System.out.println("[Interfaz] Mostrando app: " + config.getNombreApp()
                + " v" + config.getVersion());
    }
}
