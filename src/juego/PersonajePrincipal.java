
package juego;

public class PersonajePrincipal extends Personaje{
    int contador;
    double bonificacion;
    
    public PersonajePrincipal() {
        super();
        this.contador=0;
        this.bonificacion=0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
}
