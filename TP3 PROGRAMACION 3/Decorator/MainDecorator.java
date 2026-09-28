//Main del patrón Decorator.
public class MainDecorator {
    public static void main(String[] args) {
        // Combinación 1: Café simple con leche y chocolate.
        Cafe pedido1 = new ConChocolate(new ConLeche(new CafeSimple()));
        System.out.println("Pedido 1: " + pedido1.descripcion());
        System.out.println("Costo: $" + pedido1.costo());
        System.out.println();

        // Combinación 2: Café descafeinado con crema.
        Cafe pedido2 = new ConCrema(new CafeDescafeinado());
        System.out.println("Pedido 2: " + pedido2.descripcion());
        System.out.println("Costo: $" + pedido2.costo());
        System.out.println();

        // Combinación 3: Café simple con leche, chocolate y crema.
        Cafe pedido3 = new ConCrema(new ConChocolate(new ConLeche(new CafeSimple())));
        System.out.println("Pedido 3: " + pedido3.descripcion());
        System.out.println("Costo: $" + pedido3.costo());
    }
}
