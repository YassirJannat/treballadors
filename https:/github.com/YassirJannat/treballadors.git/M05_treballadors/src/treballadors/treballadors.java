package treballadors;

/**
 * Classe per a guardar les dades d'un treballador No tenim main perquè no la
 * farem servir a soles
 * 
 * @author EMILIO
 *
 */
class treballadors {
	static final int DIRECTOR = 0;
	static final int SUBDIRECTOR = 1;
	static final int BASE = 2;
	String nomTreballador;
	int tipusTreballador;
	float nominaTreballador;
	int horesExtresTreballador;

	// Constructor amb arguments, alternatiu al constructor per defecte
	treballadors(String nom, int tipus, float nomina, int hores) {
		nomTreballador = nom;
		tipusTreballador = tipus;
		nominaTreballador = nomina;
		horesExtresTreballador = hores;
	}

	// Constructor buit per defecte, l'hem de declarar si volem poder usar-lo per
	// culpa d'haver declarat l'anterior
	treballadors() {
	}

	/*
	 * El següent metode comprova que si el nom es menor que 3 executa el error i si ho guarda
	 * a un atribut nomTreballador.
	 */
	void setNom(String nom) throws Exception {
		// Si la longitud del nou nom es inferior a tres caracters llença excepcio
		// avisant del problema
		if (nom.length() < 3) {
			throw new Exception("El nom ha de tenir 3 o més caracters");
		}
		// En cas contrari assigna el nom
		nomTreballador = nom;
	}
	
	/*
	 * El següent metode retorna el nom del treballador que estaba guardat al objecte nomTreballador
	 */

	String getNom() {
		return nomTreballador;
	}

	/*
	 * El següent metode guarda en el objecte de la nomina del treballador els euros.
	 */
	
	void setNomina(float euros) {
		// Per simplicitat no comprovem que la nomina és superior a zero ja que el
		// programa no fallarà per aquest error
		// i així ens estalviem les excepcions
		nominaTreballador = euros;
	}

	/*
	 * El següent metode retorna la nomina del treballador que estaba guardat al objecte nominaTreballador
	 */
	
	float getNomina() {
		return nominaTreballador;
	}

	/*
	 * El següent metode guarda en el objecte de clase treballador les hores extra.
	 */
	void setHoresExtres(int hores) {
		// Les hores extra poden ser zero sense problema
		horesExtresTreballador = hores;
	}

	/*
	 * Aquest metode retorna les hores extres que estaben guardades a objecte treballador
	 */
	int getHoresExtres() {
		return horesExtresTreballador;
	}

	/* 
	 * El següent mètode comprova si el tipus de treballador es igual als que hi han abaix i si ho es ho guarda
	 * dins el atribut tipusTreballador i si no ho es executa la execepcio
	 */
	void setTipusTreballador(int tipus) throws Exception {
		// Aqui no és recomanable estalviar-se les comprovacions perquè el tipus de
		// treballador només pot ser DIRECTOR, SUbDIRECTOR o BASE
		if ((tipus == DIRECTOR) || (tipus == SUBDIRECTOR) || (tipus == BASE)) {
			// Si el tipus és vàlid, l'assignem
			tipusTreballador = tipus;
		} else {
			// Si el tipus no és valid, creem excepció
			throw new Exception("Tipus de treballador no vàlid");
		}
	}

	/*
	 * El següent metode retorna el tipus de treballador que estaba guardat al objecte tipusTreballador
	 */
	int getTipusTreballador() {
		return tipusTreballador;
	}
}