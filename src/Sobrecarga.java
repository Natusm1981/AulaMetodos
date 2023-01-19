import com.nataniel.aula.Quadrilatero;

public class Sobrecarga {
    public static void main(String[] args) throws Exception {
    
        System.out.println("área de um quadrado calculada: ");
        Quadrilatero.Calcular(4);
        System.out.println("área de um retângulo calculada: ");
        Quadrilatero.Calcular(4, 2);
        System.out.println("área de um Trapézio calculada: ");
        Quadrilatero.Calcular(4, 2, 5);
    
    
    }
}
