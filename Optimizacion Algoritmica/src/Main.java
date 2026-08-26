import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(primerCaracterNoRepetidoRapido("barco"));
    }

    public static Character primerCaracterNoRepetidoRapido(String texto) {
        if (texto == null || texto.isEmpty()) {
            return null;
        }

        // Primer recorrido
        Map<Character, Integer> conteo = new HashMap<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }

        // Segundo recorrido
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (conteo.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}