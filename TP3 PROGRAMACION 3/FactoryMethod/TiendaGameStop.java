//Creador abstracto: declara el método que fábrica y contiene la lógica común del proceso de venta.

public abstract class TiendaGameStop {

    // Método fábrica: las subclases deciden qué producto crear.
    public abstract Videojuego crearVideojuego(String nombre);

    // Método concreto: no sabe qué tipo de juego se crea,
    // solo trabaja con la interfaz Videojuego.
    public void procesarVenta(String nombre) {
        Videojuego videojuego = crearVideojuego(nombre);
        videojuego.entregar();
    }
}
