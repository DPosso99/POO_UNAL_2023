
public class Main {

 /**
 * @param args
 */
public static void main(String[] args) {
    int UNAL [][] = new int [5][5];

    int i;  //indice de filas
    int j; //indice de columnas
    int dato = 8;
try { //con try y catch se controlan las excepciones 
            //Ciclo de llenado
            for(i=0; i<=4; i++){ //++ incrementa en 1 el valor de i
                for(j=0; j<=4; j++){
                    UNAL[i][j] = dato;       
                }
            }

            //Ciclo de impresion 
            for(i=0; i<=4; i++){ //++ incrementa en 1 el valor de i
                for(j=0; j<=4; j++){
                    System.out.println("La vector tiene" + UNAL[i][j] + " en la posicion " + i +","+ j);        
                }
            }
}
catch(ArrayIndexOutOfBoundsException e){ 
    System.out.println ("Array Index is Out Of Bounds"); 
}         
}
}

