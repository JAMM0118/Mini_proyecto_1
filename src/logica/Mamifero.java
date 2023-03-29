package logica;

public class Mamifero {
    private boolean tieneHijos = true;
    public static final boolean TOMA_LECHE = true;
    
    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    public Mamifero(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }
    
}
