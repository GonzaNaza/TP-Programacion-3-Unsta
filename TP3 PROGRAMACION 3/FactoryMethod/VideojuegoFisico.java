//Producto concreto: juego en formato físico (disco/cartucho).

public class VideojuegoFisico implements Videojuego {

    private final String nombre;

    public VideojuegoFisico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void entregar() {
        System.out.println("GameStop AR: Enviando copia física del juego "
                + nombre + " por correo a la sucursal más cercana.");
    }
}
