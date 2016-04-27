package juego;
public class Personaje {
        int fuerza,inteligencia,resistencia,agilidad,ataque,vida;
        String nombre;
    public Personaje(){
        this.fuerza=0;
        this.inteligencia=0;
        this.resistencia=0;
        this.agilidad=0;
        this.nombre="";
        this.ataque=0;
        this.vida=0;
    }
    
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFuerza(int fuerza){
        this.fuerza=fuerza;
    }
    public int getFuerza(){
        return fuerza;
    }
        public void setInteligencia(int inteligencia){
        this.inteligencia=inteligencia;
    }
    public int getInteligencia(){
        return inteligencia;
    }
        public void setResistencia(int resistencia){
        this.resistencia=resistencia;
    }
    public int getResistencia(){
        return resistencia;
    }
        public void setAgilidad(int agilidad){
        this.agilidad=agilidad;
    }
    public int getAgilidad(){
        return agilidad;
    }
////////////////////////////////////////////////////////////////////
    private void ataque(){
    }
    
}
