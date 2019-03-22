
package plazy;

/**
 *
 * @author PawelB
 */
public class Zaba extends Plazy {
    
    boolean canswim;
    
    
    
    Zaba(String family,boolean poisonous,double length,boolean canswim){
    super(family,poisonous,length);
    this.canswim=canswim;
    }
    
    public boolean getcanswim(){
    return canswim;
    }
    
    public String toString(){
    return super.toString()+", can it swim: "+getcanswim();
    }
    
}
