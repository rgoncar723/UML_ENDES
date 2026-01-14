package practica1;

public class Main {
	public void show() {
		Pedido pedido = new Pedido(1);
		Producto producto1 = new Producto("Teclado", 45.67);
		Producto producto2 = new Producto("Portatil", 567.89);
		
		pedido.agregarProducto(producto1);
		pedido.agregarProducto(producto2);
		
		System.out.println("Número de pedido: " + pedido.getNumero());
		System.out.println("Estado del pedido: "+ pedido.getEstado());
		System.out.println("Precio total del pedido: " + pedido.calcularTotal());
		
		pedido.setEstado(EstadoPedido.EN_PROCESO);
		
		System.out.println("Estado actual del pedido: "+pedido.getEstado());
		
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
