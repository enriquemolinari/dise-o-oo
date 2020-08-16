class Usuario {
 private String nombreUsuario;
 private String clave;

 public Usuario(String nombreUsuario, String clave) {
  this.nombreUsuario = nombreUsuario;
  this.clave = clave;
 }

 public void cambiarClave(String claveActual,
  	                  String nuevaClave,
		          String nuevaClaveRepetida) {

  Objects.requireNonNull(claveActual);
  Objects.requireNonNull(nuevaClave);
  Objects.requireNonNull(nuevaClaveRepetida);

  if (!this.clave.equals(claveActual)) {
   throw new RuntimeException("No coincide con la actual...");
  }

  if (!nuevaClave.equals(nuevaClaveRepetida)) {
   throw new RuntimeException("No coinciden...");
  }

  this.clave = nuevaClave;
 }
}

class Cliente {
 public void cambiarClave(Usuario u,
			  String claveActual,
			  String nuevaClave,
		          String nuevaClaveRepetida) {
  u.cambiarClave(claveActual, nuevaClave, nuevaClaveRepetida);
 }
}
