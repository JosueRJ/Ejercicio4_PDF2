package ejercicio4;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Asignar los valores a 4 fraciones
        Fraccion f1 = new Fraccion(1, 2); // 1/2
        Fraccion f2 = new Fraccion(3, 2); // 3/2
        Fraccion f3 = new Fraccion(2); // 2/1
        Fraccion f4 = new Fraccion(7); // 7/1
        
        //Llamar a los metodos con las operaciones
        Fraccion suma = f1.SumarFraccion(f2);
        Fraccion resta = f1.RestarFraccion(f3);
        Fraccion producto = f1.MultiplicarFraccion(f4);
        Fraccion cociente = f1.DividirFraccion(f2);
        
        //mostrar resultados de las operaciones
        System.out.println(   "OPERACIONES CON LA FRACCION F1");
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);
    }
    
}
