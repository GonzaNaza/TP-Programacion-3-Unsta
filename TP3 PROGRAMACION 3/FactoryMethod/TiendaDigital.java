//Creador concreto: fabrica juegos en formato digital.

public class TiendaDigital extends TiendaGameStop {

    @Override
    public Videojuego crearVideojuego(String nombre) {
        return new VideojuegoDigital(nombre);
    }
}
