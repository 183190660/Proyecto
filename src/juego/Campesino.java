package juego;
public class Campesino extends Personaje {
    int bonificacion;

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public Campesino() {
        super();
        this.bonificacion=1;
    }
    
    
}
