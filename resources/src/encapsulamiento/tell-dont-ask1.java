class Producto {
 private String descripcion;
 private Float precio;

 public Producto(String descripcion,
			Float precio) {
  this.descripcion = descripcion;
  this.precio = precio;
 }

 public float precio() {
  return precio;
 }

 public String descripcion() {
  return descripcion;
 }
}

class CarritoCompras {
 private List<Producto> productos;

 public CarritoCompras() {
  this.productos = new ArrayList<>();
 }

 public void agregarProducto(Producto producto) {
  Objects.requireNonNull(producto);
  this.productos.add(producto);
 }

 public List<Producto> getProductos() {
  return this.productos;
 }
}

class Cliente {
 public float calcularCosto(CarritoCompras carrito) {
  float total = 0;
  for (Producto producto : carrito.getProductos()) {
   total += producto.precio();
  }
  return total;
 }
}
