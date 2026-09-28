//Singleton: única instancia global de configuración.
public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia;

    private final String nombreApp;
    private final String version;
    private boolean modoDebug;

    private ConfiguracionGlobal(String nombreApp, String version, boolean modoDebug) {
        this.nombreApp = nombreApp;
        this.version = version;
        this.modoDebug = modoDebug;
    }

    public static ConfiguracionGlobal obtenerInstancia(String nombreApp, String version, boolean modoDebug) {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal(nombreApp, version, modoDebug);
        }
        return instancia;
    }

    public static ConfiguracionGlobal obtenerInstancia() {
        if (instancia == null) {
            throw new IllegalStateException("La configuración debe inicializarse primero con 3 parámetros.");
        }
        return instancia;
    }

    public String getNombreApp() { return nombreApp; }
    public String getVersion() { return version; }
    public boolean isModoDebug() { return modoDebug; }

    public void setModoDebug(boolean modoDebug) { this.modoDebug = modoDebug; }
}
