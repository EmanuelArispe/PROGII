package Ejercicio_2;

public class Asistente {
    private String nombre;
    private int cel;
    private String email;

    public Asistente(String nombre, int cel, String email) {
        this.nombre = nombre;
        this.cel = cel;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
