package treballadors;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class treballadorsTest {
	@Test
	public void testNomTreballadorIncorrecte() {
//Aquest test prova si el programa detecta que volem assignar un nom
//incorrecte i llença l'excepció que toca
//Noteu que per als objectes individuals de la classe Treballador i
// Exception podem triar els noms que ens done la gana,
// no cal fer-los coincidir amb els de les classes
		treballadors treballadorMeu = new treballadors();
//Codi per a provocar excepcions, modificat a partir de 'exemple de la calculadora
		Exception excepcioMeva = assertThrows(Exception.class, () -> treballadorMeu.setNom(""));
//L'assercio mira si el text de l'excepcio avisa del problema de nom curt
		assertEquals("El nom ha de tenir 3 o més caracters", excepcioMeva.getMessage());
	}

	@Test
	public void testNomTreballadorCorrecte() {
		String nomTest = "Emilio";
		treballadors treballador = new treballadors();
		// Assignem un nom, com el metode setNom pot produir excepcions ha d'anar en un
		// bloc try catch
		// A diferencia del cas anterior, aquí no estem provocant l'excepció a propòsit,
		// sino que és el tractament
		// habitual de les excepcions, ja ho veureu en M3
		try {
			treballador.setNom(nomTest);
		} catch (Exception e) {
			// Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla,
			// aixi el programa no peta
			System.out.println(e.getMessage());
		}
		;
		// L'assercio comprova que el nom és correcte i en cas contrari mostraria el
		// missatge d'error
		assertEquals(nomTest, treballador.getNom(), "Els noms han de coincidir!!!");
	}

	@Test
	public void testNomina() {
		float nomina = 2300;
		treballadors treballador = new treballadors();
		// Assignem una nomina, com aquest mètode no provoca excepcions no necessitem el
		// bloc try-catch
		treballador.setNomina(nomina);
		// L'asserció comprova que la nomina és correcta i en cas contrari mostra
		// missatge d'error
		assertEquals(nomina, treballador.getNomina(), "Els dos valors de la nomina han de coincidir!!!");
	}

	@Test
	public void testHoresExtres() {
		int hores = 20;
		
		treballadors treballador = new treballadors();
		
		treballador.setHoresExtres(hores);
			assertEquals(hores, treballador.getHoresExtres(), "Els dos valors de les hores extres han de coincidir");
	}

	@Test
	public void testTipusTreballadorIncorrecte() {
		treballadors treballadorMeu = new treballadors();
		
		Exception excepcioMeva = assertThrows(Exception.class, () -> treballadorMeu.setTipusTreballador(3));
		
		assertEquals("Tipus de treballador no vàlid",
			excepcioMeva.getMessage());
	}

	@Test
	public void testTipusTreballadorCorrecte() {
		int tipusTest = 0;
		treballadors treballador = new treballadors();
		
		try {
			treballador.setTipusTreballador(treballadors.DIRECTOR);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};
		assertEquals(tipusTest, treballador.getTipusTreballador(), "Els tipus han de coincidir");
	}
}