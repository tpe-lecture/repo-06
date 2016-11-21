package tpe.enumeration.own;
/**
 * 
 * @author c.arsoy.
 *
 */
public enum WuerfelTyp {
    D2(2), D4(4), D6(6), D8(8), D10(10), D12(12);
    
    private final int seitenanzahl;
    
    private WuerfelTyp(int seitenanzahl){
        this.seitenanzahl = seitenanzahl;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

}
