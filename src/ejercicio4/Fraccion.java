
package ejercicio4;

public class Fraccion {
    //atributos
    private int numerador;
    private int denominador;
    
    //Constructores
    //por defecto
    public Fraccion(){
        numerador = 0;
        denominador = 1;
    }
    //con parametros
    public Fraccion(int x, int y){
        this.numerador = x;
        if (y == 0){
            y = 1;
        }
        this.denominador = y;
        Simplificar();
    }
    //copia
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    
    //Setter y Getters

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    //Metodos
    public Fraccion SumarFraccion(Fraccion f){
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        c.denominador = this.denominador * f.denominador;
        c.Simplificar();
        return c;
    }
       
    public Fraccion RestarFraccion(Fraccion f) {
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        c.denominador = this.denominador * f.denominador;
        c.Simplificar();
        return c;
    }
   
    public Fraccion MultiplicarFraccion(Fraccion f) {
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.numerador;
        c.denominador = this.denominador * f.denominador;
        c.Simplificar();
        return c;
    }

    public Fraccion DividirFraccion(Fraccion f) {
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.denominador;
        c.denominador = this.denominador * f.numerador;
        c.Simplificar();
        return c;
    }
    
    //mcd
    private int mcd() {
        int u = Math.abs(numerador); //valor absoluto del numerador
        int v = Math.abs(denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    private void Simplificar() {
        int n = mcd(); 
        numerador = numerador / n;
        denominador = denominador / n;
    }
    //Medoto ToString
    @Override
    public String toString() {
        Simplificar();
        return numerador + "/" + denominador;
    }
}
