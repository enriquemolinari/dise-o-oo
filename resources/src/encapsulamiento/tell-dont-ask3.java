class Tren {
 private List<Vagon> vagones;
 private int limiteOcupacion = 70;
 ...

 public void reservarAsiento(PedidoReserva pedido) {
  for (Vagon vagon : vagones) {
   if (vagon.getAsientos().getPorcentajeRes() <  limiteOcupacion) {
    pedido.reservarAsientoEn(vagon);
    return;
   }
  }
  pedido.noSeEncuentranAsientos();
 }
}
