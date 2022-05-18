import java.util.Arrays;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] tienenurl(){

        int cont = 0;
        Personaje[] array = personajes.obtenerTodos();
        for ( Personaje person : array) {
            if (person.getImage().isEmpty()){
                array[cont] = person;
                cont++;
            }
        }
        return getArraySinNulos(array,cont) ;
    }

    public Personaje[] getArraySinNulos (Personaje[] array, int nulos){
        return Arrays.copyOfRange(array,6,nulos );
    }
}
