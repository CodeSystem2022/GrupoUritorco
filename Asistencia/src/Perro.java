public class Perro {
    String nombre;
    String raza;
    int edad;
    boolean mueveLaCola;

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", mueveLaCola=" + mueveLaCola +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMueveLaCola() {
        return mueveLaCola;
    }

    public void setMueveLaCola(boolean mueveLaCola) {
        this.mueveLaCola = mueveLaCola;
    }

    public Perro(String nombre, String raza, int edad, boolean mueveLaCola) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.mueveLaCola = mueveLaCola;
    }
}
