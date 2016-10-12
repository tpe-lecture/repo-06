// TODO: JavaDoc
/**
 * 
 * 
 * @author CangoHD126
 * 
 *
 */
public class Waehrung {

    // TODO: JavaDoc
	/**
	 * Instanzvariable fuer gegenwaertigen Kurs
	 */
    private final int kurs;

    // TODO: JavaDoc
    /**
     * Instanzvariable fuer Namen der Waehrung
     */
    private final String name;

    // TODO: JavaDoc
    /**
     * Instazvariable fuer Kuerzel der Waehrung
     */
    private final String kuerzel;

    // TODO: JavaDoc
    /**
     * Instanzvariabel fuer die Umrechnung der Waehrungen
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    // TODO: JavaDoc
    /**
     * @param betrag Betrag der gewechselt wird
     * @param Waehrung Art der Waehrung die gewechselt wird
     * @param toWaehrung in welche andere Waehrung gewechselt wird
     * @return vollstaedige umgerechnete Waehrung die ausgegeben wird
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    // TODO: JavaDoc
    /**
     * getter fuer den Kurs der Waehrung
     * @return gegenwaertiger Kurs
     */
    public int getKurs() {
        return kurs;
    }
    
    // TODO: JavaDoc
    /**
     * getter fuer den Namen der Waehrung
     * @return gegenwaertiger Name der Waehrung
     */
    public String getName() {
        return name;
    }

    // TODO: JavaDoc
    /**
     * getter fuer die Kuerzel der Waehrung
     * @return gegenwaertiges Kuerzel der Waehrung
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
