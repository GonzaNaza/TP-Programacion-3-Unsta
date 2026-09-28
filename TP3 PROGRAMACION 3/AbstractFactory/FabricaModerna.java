//Fábrica concreta: crea productos de la familia moderna.
public class FabricaModerna implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
