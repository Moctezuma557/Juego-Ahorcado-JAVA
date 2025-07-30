import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner leer = new Scanner(System.in);

        String PalabraAdivinar = "lalo";
        boolean EsAdivinada = false;
        int IntentosMax = 10;
        int Intentos = 0;

        char [] letrasAdivinadas = new char [PalabraAdivinar.length()];
        

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i]='_';
        }

        

        while (!EsAdivinada && Intentos < 10) {

             System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas)+ " ("+ PalabraAdivinar.length() + " letras)");
            
            char letra = leer.next().charAt(0);
            boolean BuenIntento = false;

            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if(PalabraAdivinar.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    BuenIntento = true;
                }
            }

            if(!BuenIntento){
                Intentos++;
                System.out.println("Has fallado, te quedan "+ (IntentosMax - Intentos)+ " Intentos");
            }

            if(PalabraAdivinar.equals(String.valueOf(letrasAdivinadas))){
                EsAdivinada = true; 
                System.out.println("Felicidades, la palabra a sido adivinada: "+ String.valueOf(letrasAdivinadas));
            }

        }

        if(!EsAdivinada){
            System.out.println("Perdon pero has perdido la partida");
        }
        

        leer.close();
    }
}
