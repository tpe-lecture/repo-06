package tpe.oo.constructor;

/**
 * Untoter aus der Horde.
 */
public class Untoter extends Wesen{

    /** Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung. */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;
    
    /** Fähigkeit zur Atmung unter Wasser. */
    private int unterwasseratmung;
    
    // Konstruktoren fehlen. Bitte hier einfügen.
    public Untoter(int unterwasserat, String name){
    	super(name);
    	this.unterwasseratmung = unterwasserat;
    }
    public Untoter(String name){
    	this(name, STANDARD_UNTERWASSERATMUNG);
    }
    
    /**
     * Fähigkeit zur Unterwasseratmnung.
     * 
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}
