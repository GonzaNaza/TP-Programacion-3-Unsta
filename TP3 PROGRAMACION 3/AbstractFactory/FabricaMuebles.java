//Fábrica abstracta: define los métodos para crear cada producto de la familia.
public interface FabricaMuebles {
    Silla crearSilla();
    Mesa crearMesa();
}
