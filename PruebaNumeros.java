public class PruebaNumeros {
  public static void main (String[] args) {
    int primerNumero = 70;
    long segundoNumero = 12345;
    
    String rojo="\033[31m";
    String textoDelCodigoRojo="\\033[31m";
    
    //primerNumero = 70;
    //segundoNumero = 4000000000;
    
    //System.out.printf("Valores de primerNumero: %f ---  segundoNumero: %f\n",primerNumero,segundoNumero );
    System.out.println("Valores de primerNumero: "+primerNumero+" ---  segundoNumero: "+ segundoNumero );
    System.out.println("El codigo de color rojo es: " + rojo + textoDelCodigoRojo);
  }
}
