package Ejercicio6_RegistroEmpresa;

public class Usuario extends Persona{
    private String usuario;
    private String password;

    public Usuario(int DNI, String nombre, String apellido, int edad, String usuario, String password) {
        super(DNI, nombre, apellido, edad);
        this.usuario = usuario;
        this.password = password;
        this.setRol(Cargo.USUARIO);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
}
