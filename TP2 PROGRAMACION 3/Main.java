 public class Main {
    public static void main(String[] args) {
        // Venta en una sucursal física
        TiendaGameStop sucursal = new SucursalFisica();
        sucursal.procesarVenta("The Legend of Zelda: Tears of the Kingdom");

        // Venta en la tienda online
        TiendaGameStop tiendaOnline = new TiendaDigital();
        tiendaOnline.procesarVenta("Hollow Knight");
    }
}
