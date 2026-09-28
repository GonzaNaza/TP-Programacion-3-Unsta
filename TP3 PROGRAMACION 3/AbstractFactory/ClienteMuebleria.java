//Cliente: recibe una fábrica y crea familias completas de muebles.
public class ClienteMuebleria {
    private final FabricaMuebles fabrica;

    public ClienteMuebleria(FabricaMuebles fabrica) {
        this.fabrica = fabrica;
    }

    public void amueblarSala() {
        Silla silla = fabrica.crearSilla();
        Mesa mesa = fabrica.crearMesa();
        silla.sentarse();
        mesa.apoyarCosas();
    }
}
