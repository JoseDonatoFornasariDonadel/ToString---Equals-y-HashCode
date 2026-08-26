import java.util.*;

final class TarjetaAcceso {
    		private final String codigo;
    		private final int nivelAcceso;

    		public TarjetaAcceso(String codigo, int nivelAcceso) {
        			this.codigo = codigo;
        			this.nivelAcceso = nivelAcceso;
    		}

    		public String getCodigo() { return codigo; }
    		public int getNivelAcceso() { return nivelAcceso; }

    		@Override
    		public boolean equals(Object o) {
        			if (this == o) return true;
        			if (o == null || getClass() != o.getClass()) return false;
        			TarjetaAcceso tarjeta = (TarjetaAcceso) o;
       			return nivelAcceso == tarjeta.nivelAcceso && Objects.equals(codigo, tarjeta.codigo);
    		}

    		@Override
    		public int hashCode() {
        			return Objects.hash(codigo, nivelAcceso);
    		}
}


public class ControlAcceso {
    public static void main(String[] args) {
        Set<TarjetaAcceso> tarjetasValidas = new HashSet<>();
        TarjetaAcceso t1 = new TarjetaAcceso("ACC-101", 2);
        tarjetasValidas.add(t1);
        
        // Modificación creando una nueva 
        TarjetaAcceso t2 = new TarjetaAcceso("ACC-101", 5);
        tarjetasValidas.add(t2);

        //Eliminacion de la anterior
        tarjetasValidas.remove(t1);
        
        System.out.println("¿Tarjeta válida en sistema?: " + tarjetasValidas.contains(t2));//tarjeta cambiada de t1 a t2 que es la nueva con nacceso 5
        System.out.println("Cantidad de tarjetas registradas: " + tarjetasValidas.size());
		System.out.println("Nivel de acceso: " + t2.getNivelAcceso());
    }
}