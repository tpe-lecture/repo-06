package tpe.oo.polymorphie;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert die Tiere.
     * 
     * @param Zootier zootier, das gefüttert werden soll. 
     */
    public void gibFutter(ZooTier zootier) {
        zootier.fuettern();
    }
    
 
}
