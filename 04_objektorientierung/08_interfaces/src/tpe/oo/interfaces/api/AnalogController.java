package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController {

    /**
     * Nach oben bewegen.
     * @param double percentage für den Prozensatz der Betaetigung
     */
    void up(double percentage);
    
    /**
     * Nach unten bewegen.
     * @param double percentage für den Prozensatz der Betaetigung
     */
    void down(double percentage);
    
    /**
     * Nach links bewegen.
     * @param double percentage für den Prozensatz der Betaetigung
     */
    void left(double percentage);
    
    /**
     * Nach rechts bewegen.
     * @param double percentage für den Prozensatz der Betaetigung
     */
    void right(double percentage);
    
    /**
     * Liefert die aktuelle Position zurück.
     * 
     * @return Die Position.
     */
    Point getPosition();
}
