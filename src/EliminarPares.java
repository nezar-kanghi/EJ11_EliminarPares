import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarPares {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(numeros);
    }
}
