package logica;

public class Pulga {
    String nombre;
    int cantidad_de_Sangre;

    public Pulga(String nombre, int cantidad_de_Sangre) {
        this.nombre = nombre;
        this.cantidad_de_Sangre = cantidad_de_Sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_de_Sangre() {
        return cantidad_de_Sangre;
    }

    public void setCantidad_de_Sangre(int cantidad_de_Sangre) {
        this.cantidad_de_Sangre = cantidad_de_Sangre;
    }
}
