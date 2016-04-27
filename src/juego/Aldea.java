package juego;
public class Aldea {
    int nivel,exp,aldeanos,soldados,oro,madera,alimento,piedra;
    String nombre;
    public Aldea(String nombre){
    this.nivel=0;
    this.exp=0;
    this.aldeanos=0;
    this.soldados=0;
    this.nombre=nombre;
    this.madera=0;
    this.oro=0;
    this.alimento=0;
    this.piedra=0;
}

    public int getNivel() {
        return nivel;
    }

    private void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    private void setExp(int exp) {
        this.exp = exp;
    }

    public int getAldeanos() {
        return aldeanos;
    }

    private void setAldeanos(int aldeanos) {
        this.aldeanos = aldeanos;
    }

    public int getSoldados() {
        return soldados;
    }

    private void setSoldados(int soldados) {
        this.soldados = soldados;
    }

    public int getOro() {
        return oro;
    }

    private void setOro(int oro) {
        this.oro = oro;
    }

    public int getMadera() {
        return madera;
    }

    private void setMadera(int madera) {
        this.madera = madera;
    }

    public int getAlimento() {
        return alimento;
    }

    private void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public int getPiedra() {
        return piedra;
    }

    private void setPiedra(int piedra) {
        this.piedra = piedra;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
