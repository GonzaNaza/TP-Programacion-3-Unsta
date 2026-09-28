//Fábrica concreta: crea productos de la familia victoriana.
public class FabricaVictoriana implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaVictoriana();
    }
}
