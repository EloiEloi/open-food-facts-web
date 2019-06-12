package fr.diginamic.modeles;

/**
 * @author Eloi
 *
 */
public class Produit {

	private Integer id;
	private Integer energie;
	private Integer fibre;
	private String grade;
	private Integer graisse;
	private String nom;
	private String pays;
	private String paysManufact;
	private Integer proteine;
	private Integer sel;
	private Integer sucre;
	private Integer idCat;
	private Integer idMarq;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param energie
	 * @param fibre
	 * @param grade
	 * @param graisse
	 * @param nom
	 * @param pays
	 * @param paysManufact
	 * @param proteine
	 * @param sel
	 * @param sucre
	 * @param idCat
	 * @param idMarq
	 */
	public Produit(Integer id, Integer energie, Integer fibre, String grade, Integer graisse, String nom, String pays,
			String paysManufact, Integer proteine, Integer sel, Integer sucre, Integer idCat, Integer idMarq) {
		this.id = id;
		this.energie = energie;
		this.fibre = fibre;
		this.grade = grade;
		this.graisse = graisse;
		this.nom = nom;
		this.pays = pays;
		this.paysManufact = paysManufact;
		this.proteine = proteine;
		this.sel = sel;
		this.sucre = sucre;
		this.idCat = idCat;
		this.idMarq = idMarq;
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
	 * @return the energie
	 */
	public Integer getEnergie() {
		return energie;
	}

	/**
	 * Setter
	 *
	 * @param energie
	 *            the energie to set
	 */
	public void setEnergie(Integer energie) {
		this.energie = energie;
	}

	/**
	 * Getter
	 * 
	 * @return the fibre
	 */
	public Integer getFibre() {
		return fibre;
	}

	/**
	 * Setter
	 *
	 * @param fibre
	 *            the fibre to set
	 */
	public void setFibre(Integer fibre) {
		this.fibre = fibre;
	}

	/**
	 * Getter
	 * 
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Setter
	 *
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Getter
	 * 
	 * @return the graisse
	 */
	public Integer getGraisse() {
		return graisse;
	}

	/**
	 * Setter
	 *
	 * @param graisse
	 *            the graisse to set
	 */
	public void setGraisse(Integer graisse) {
		this.graisse = graisse;
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

	/**
	 * Getter
	 * 
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * Setter
	 *
	 * @param pays
	 *            the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * Getter
	 * 
	 * @return the paysManufact
	 */
	public String getPaysManufact() {
		return paysManufact;
	}

	/**
	 * Setter
	 *
	 * @param paysManufact
	 *            the paysManufact to set
	 */
	public void setPaysManufact(String paysManufact) {
		this.paysManufact = paysManufact;
	}

	/**
	 * Getter
	 * 
	 * @return the proteine
	 */
	public Integer getProteine() {
		return proteine;
	}

	/**
	 * Setter
	 *
	 * @param proteine
	 *            the proteine to set
	 */
	public void setProteine(Integer proteine) {
		this.proteine = proteine;
	}

	/**
	 * Getter
	 * 
	 * @return the sel
	 */
	public Integer getSel() {
		return sel;
	}

	/**
	 * Setter
	 *
	 * @param sel
	 *            the sel to set
	 */
	public void setSel(Integer sel) {
		this.sel = sel;
	}

	/**
	 * Getter
	 * 
	 * @return the sucre
	 */
	public Integer getSucre() {
		return sucre;
	}

	/**
	 * Setter
	 *
	 * @param sucre
	 *            the sucre to set
	 */
	public void setSucre(Integer sucre) {
		this.sucre = sucre;
	}

	/**
	 * Getter
	 * 
	 * @return the idCat
	 */
	public Integer getIdCat() {
		return idCat;
	}

	/**
	 * Setter
	 *
	 * @param idCat
	 *            the idCat to set
	 */
	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}

	/**
	 * Getter
	 * 
	 * @return the idMarq
	 */
	public Integer getIdMarq() {
		return idMarq;
	}

	/**
	 * Setter
	 *
	 * @param idMarq
	 *            the idMarq to set
	 */
	public void setIdMarq(Integer idMarq) {
		this.idMarq = idMarq;
	}

}
