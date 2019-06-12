package fr.diginamic.modeles;

/**
 * @author Eloi
 *
 */
public class Marque {

	private Integer id;
	private String nom;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nom
	 */
	public Marque(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
