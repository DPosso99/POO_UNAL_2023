
public class Clase5 {

    public static void main(String[] args) {
    int UNAL [] = new int [5];

    int i;  //indice de filas
    int j; //indice de columnas
    int dato = 10;

    //Ciclo de llenado
    for(i=0; i<=4; i++){ //++ incrementa en 1 el valor de i
        for(j=0; j<=4; j++){
            UNAL[i] = dato;
System.out.println("La vector tiene" + UNAL[i] + " en la posicion " + i);        
        }
    }
 }
}

