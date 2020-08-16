class Usuario {
 private String nombreUsuario;
 private String clave;

 public String getNombreUsuario() {
  return nombreUsuario;
 }

 public void setNombreUsuario(String nombreUsuario) {
  this.nombreUsuario = nombreUsuario;
 }

 public String getClave() {
  return clave;
 }

 public void setClave(String clave) {
  this.clave = clave;
 }
}

class Cliente {
 public void cambiarClave(Usuario u,
	                  String claveActual,
			  String nuevaClave,
		          String nuevaClaveRepetida) {

  Objects.requireNonNull(claveActual);
  Objects.requireNonNull(nuevaClave);
  Objects.requireNonNull(nuevaClaveRepetida);

  if (!u.getClave().equals(claveActual)) {
   throw new RuntimeException("No coincide con la actual...");
  }

  if (!nuevaClave.equals(nuevaClaveRepetida)) {
   throw new RuntimeException("No coinciden...");
  }

  u.setClave(nuevaClave);
 }
}
