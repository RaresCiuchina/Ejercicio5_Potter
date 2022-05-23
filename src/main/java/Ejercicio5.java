import java.util.Arrays;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] tienenurl() {

        int cont = 0;
        Personaje[] array = personajes.obtenerTodos();
        for (Personaje person : array) {
            if (person.getImage().isEmpty()) {
                array[cont] = person;
                cont++;
            }
        }
        return getArraySinNulos(array, cont);
    }

    public Personaje[] getArraySinNulos(Personaje[] array, int nulos) {
        return Arrays.copyOfRange(array, 6, nulos);
    }


    //TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están vivos
    public int ContarStaffyVivos() {
        int cont = 0;
        Personaje[] finalpers = personajes.obtenerTodos();
        for (Personaje person : finalpers) {
            if (person.getAlive() && person.getHogwartsStaff()) {
                cont++;
            }

        }
        return cont;

    }

    //TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están muertos
    public int ContarStaffyMuertos() {
        int cont = 0;
        Personaje[] finalpers = personajes.obtenerTodos();
        for (Personaje person : finalpers) {
            if (person.getAlive() && !person.getHogwartsStaff()) {
                cont++;
            }
        }
        return cont;

    }


    // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
    public int CuantosTienenLetra(char letra) {
        int fuera = personajes.obtenerTodos().length;
        int i = 0;

        for (Personaje personaje1 : personajes.obtenerTodos()) {
            boolean encontrado = true;

            if (!personaje1.getName().contains(String.valueOf(letra))) {
                encontrado = false;
                break;
            }

            if (encontrado) {
                i++;
            }
        }
        return i;
    }

    // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
    //  en su nombre y están vivos

    public Personaje[] dimePersonajesQueContengaElStringYEstenVivos(String letras){
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int i=0;

        for (Personaje personaje1 : out) {
            boolean encontrado = true;
            if (!(personaje1.getName().contains(String.valueOf(letras)) && !personaje1.getAlive())) {
                encontrado = false;
                break;
            }

            if (encontrado) {
                out[i] = personaje1;
                i++;
            }
        }

        return getArraySinNulos(out,i);
    }


    // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
    //  exactamente como el string recibido

    public Personaje[] dimeQuePersonajesSeLlamanAsi(String letras){
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int i=0;

        for (Personaje personaje1 : out) {
            boolean encontrado = true;
            if (!(personaje1.getName().contentEquals(letras))) {
                encontrado = false;
                break;
            }

            if (encontrado) {
                out[i] = personaje1;
                i++;
            }
        }

        return getArraySinNulos(out,i);
    }




}
