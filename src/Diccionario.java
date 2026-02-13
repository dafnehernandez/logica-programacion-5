import java.util.*;

public class Diccionario {
    public static void main(String[]args){
        HashMap<String, String> diccionario = new HashMap<>();

        // Adding elements
        // Modified: first spanish second english
        diccionario.put("Manzana", "Apple");
        diccionario.put("Naranja", "Orange");
        diccionario.put("Fresa", "Strawberry");

        diccionario.put("Amor", "Love");
        diccionario.put("Amistad", "Friendship");
        diccionario.put("Mezclar", "Mix");

        diccionario.put("Viajar", "Travel");
        diccionario.put("Beber", "Drink");
        diccionario.put("Comer", "Eat");

        diccionario.put("Untar", "Spread");
        diccionario.put("Espolvorear", "Sprinkle");
        diccionario.put("Cortar", "Cut");

        diccionario.put("Dañar", "Damage");
        diccionario.put("Golpear", "Hit");
        diccionario.put("Sanar", "Heal");

        diccionario.put("Misterio", "Mystery");
        diccionario.put("Caso", "Case");
        diccionario.put("Pista", "Clue");

        diccionario.put("Trabajo", "Job");
        diccionario.put("Salario", "Salary");

        // Convert the words into a list
        List<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras); // Mix words using function suffle

        // Read from user
        Scanner scanner = new Scanner(System.in);
        int correctas = 0; //to check how many responses are correct

        System.out.println("Traduce las siguientes palabras al inglés:\n");

        // Ask 5 words
        for (int i = 0; i < 5; i++) {
            String palabraEspañol = palabras.get(i);
            System.out.print(palabraEspañol + ": ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase(diccionario.get(palabraEspañol))) {
                System.out.println("Correcto :D\n");
                correctas++;
            } else {
                System.out.println("Incorrecto :(. La respuesta correcta era: "
                        + diccionario.get(palabraEspañol) + "\n");
            }
        }

        System.out.println("Resultado final: " + correctas + " / 5 correctas");
        scanner.close();
    }
}
