 //Producto concreto: juego en formato digital (código de descarga).

public class VideojuegoDigital implements Videojuego {

    private final String nombre;

    public VideojuegoDigital(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void entregar() {
        System.out.println("GameStop AR: Enviando código de descarga del juego "
                + nombre + " al correo electrónico del cliente.");
    }
}
