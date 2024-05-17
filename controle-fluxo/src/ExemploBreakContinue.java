public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
            //Ao usar "break", o sistema irá parar de imprimir quando o a variável número for igual a 2.

            //Ao usar "continue", o sistema não irá imprimir apenas o número 3.
               continue;


                System.out.println(numero);
        }
    }
}
