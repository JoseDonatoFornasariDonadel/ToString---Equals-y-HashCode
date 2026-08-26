import java.util.*;

class TarjetaAcceso {
    private final String codigo; // Identificador inmutable
    private int nivelAcceso;      // Atributo mutable

    public TarjetaAcceso(String codigo, int nivelAcceso) {
        this.codigo = codigo;
        this.nivelAcceso = nivelAcceso;
    }
	//agrego el metodo get para mostrar el nivel de acceso
	public int getNivelAcceso(){
		return this.nivelAcceso;
	}

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaAcceso tarjeta = (TarjetaAcceso) o;
        return Objects.equals(codigo, tarjeta.codigo); // Criterio de identidad único
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo); // Hash constante independientemente del nivel
    }
}



public class ControlAcceso {
    public static void main(String[] args) {
        Set<TarjetaAcceso> tarjetasValidas = new HashSet<>();
        TarjetaAcceso t1 = new TarjetaAcceso("ACC-101", 2);
        tarjetasValidas.add(t1);
        
        // Modificación posterior a la inserción
        t1.setNivelAcceso(5);
        
        System.out.println("¿Tarjeta válida en sistema?: " + tarjetasValidas.contains(t1));
        System.out.println("Cantidad de tarjetas registradas: " + tarjetasValidas.size());
		System.out.print("Nivel de acceso de la tarjeta: " + t1.getNivelAcceso());
    }
}