import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio5 ej = new Ejercicio5();

    @Test
    public void CuantosConImagenHay() {
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Personajes que tienen imagen asociada.
        // tip: ej.personajes.obtenerTodos()[0].getImage()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 25

        Assertions.assertEquals(25,
                ej.tienenurl().length);

    }


    @Test
    public void CuantosPottersHay() {
        // TODO Comprueba que la función: obtenerPotters()
        //  nos devuelve una lista de 6 elementos
        // tip: ej.personajes.obtenerPotters()

        Assertions.assertEquals(6, ej.personajes.obtenerPotters().length);
    }


    @Test
    public void PruebaCuantosHowwartshayAlive() {
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(17, ej.StaffHowartsyAlive());
    }

    @Test
    public void PruebaCuantosHowwartshayNoAlive() {
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están muertos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(8, ej.StaffHowartsyNoAlive());
    }

    @Test
    public void PRUEBATIENELETRAa() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(250, ej.CuantosTienenLetra('a'));
    }

    @Test
    public void PRUEBATIENELETRA_A() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(51, ej.CuantosTienenLetra('A'));
    }

    @Test
    public void PRUEBATIENELETRA_b() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(72, ej.CuantosTienenLetra('b'));
    }

    @Test
    public void PRUEBATIENELETRA_B() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(64, ej.CuantosTienenLetra('B'));
    }

    @Test
    public void PRUEBATIENELETRA_e() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(285, ej.CuantosTienenLetra('e'));
    }

    @Test
    public void PRUEBATIENELETRA_E() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(26, ej.CuantosTienenLetra('E'));
    }

    @Test
    public void PRUEBATIENELETRA_F() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(30, ej.CuantosTienenLetra('F'));
    }

    @Test
    public void PRUEBATIENELETRA_g() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(95, ej.CuantosTienenLetra('g'));
    }

    @Test
    public void Pruebatiene_tri() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
        //  en su nombre y están vivos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos

        Assertions.assertEquals(1,ej.dimePersonajesQueContengaElStringYEstenVivos("tri").length);

    }
    @Test
    public void Pruebatiene_ron() {
        Assertions.assertEquals(1,ej.dimePersonajesQueContengaElStringYEstenVivos("ron").length);
    }
    @Test
    public void Pruebatiene_Ron() {
        Assertions.assertEquals(2,ej.dimePersonajesQueContengaElStringYEstenVivos("Ron").length);
    }
    @Test
    public void Pruebatiene_RON() {
        Assertions.assertEquals(0,ej.dimePersonajesQueContengaElStringYEstenVivos("RON").length);
    }


    @Test
    public void PruebaSellamaHarryPotter() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Assertions.assertEquals(1,ej.dimeQuePersonajesSeLlamanAsi("Harry Potter").length);

    }
}
