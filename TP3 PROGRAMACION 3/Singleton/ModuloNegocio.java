//Cliente: módulo que lee la configuración global.
public class ModuloNegocio {
    public void ejecutarOperacion() {
        ConfiguracionGlobal config = ConfiguracionGlobal.obtenerInstancia();
        System.out.println("[Negocio] Ejecutando operación en modo debug = " + config.isModoDebug());
    }
}
