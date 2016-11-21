package tpe.generics.use;

public class MuenzStack<M> {
    
    private M[] muenzen;
    private int pos;
    
    @SuppressWarnings("unchecked")
    public MuenzStack(int size){
        muenzen = (M[])new Object[size];
        pos = 0;
    }
        
    public void Push(M o){
        muenzen[pos++] = o;
    }
    
   public M pop(){
       return muenzen[--pos];
   }
}
