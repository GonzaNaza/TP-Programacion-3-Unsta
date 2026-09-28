//Creador concreto: fabrica juegos en formato físico.

public class SucursalFisica extends TiendaGameStop {

    @Override
    public Videojuego crearVideojuego(String nombre) {
        return new VideojuegoFisico(nombre);
    }
}
