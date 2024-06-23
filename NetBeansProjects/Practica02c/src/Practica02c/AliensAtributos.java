package Practica02c;

public class AliensAtributos {
    private int HP;
    private int Velocidad;
    private int Resistencia;
    private int Ejercito;

    public AliensAtributos(int HP, int Velocidad, int Resistencia, int Ejercito) {
        this.HP = HP;
        this.Velocidad = Velocidad;
        this.Resistencia = Resistencia;
        this.Ejercito = Ejercito;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public int getEjercito() {
        return Ejercito;
    }

    public void setEjercito(int Ejercito) {
        this.Ejercito = Ejercito;
    }
}
