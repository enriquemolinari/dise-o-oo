class CarritoCompras {
 private List<Producto> productos;
 public CarritoCompras() {
  this.productos = new ArrayList<>();
 }

 public void agregarProducto(Producto producto) {
  Objects.requireNonNull(producto);
  this.productos.add(producto);
 }

 public float montoTotal() {
  float total = 0;
  for (Producto producto : this.productos) {
   total += producto.precio();
  }
  return total;
 }
}

class Cliente {
 public float calcularCosto(CarritoCompras carrito) {
  return carrito.montoTotal();
 }
}
