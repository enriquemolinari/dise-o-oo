class Usuario {

 private String nombreUsuario;
 private List<String> claves = new ArrayList<>();

 public Usuario(String nombreUsuario, String clave) {
  this.nombreUsuario = nombreUsuario;
  this.claves.add(clave);
 }

 public void cambiarClave(String claveActual,
			  String nuevaClave,
			  String nuevaClaveRepetida) {

  Objects.requireNonNull(claveActual);
  Objects.requireNonNull(nuevaClave);
  Objects.requireNonNull(nuevaClaveRepetida);

  if (!this.claves.get(0).equals(claveActual)) {
   throw new RuntimeException("No coincide con la actual...");
  }

  if (!nuevaClave.equals(nuevaClaveRepetida)) {
   throw new RuntimeException("No coinciden...");
  }

  this.claves.add(0, nuevaClave);
 }
}
