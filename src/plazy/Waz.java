
package plazy;

/**
 *
 * @author PawelB
 */
public class Waz extends Plazy{

 boolean dangerous;
 
 Waz(String family,boolean poisonous,double length,boolean dangerous){
    super(family,poisonous,length);
    this.dangerous=dangerous;
    }

 public boolean getdangerous(){
 return dangerous;
 }
 
 public String toString(){
    return super.toString()+", is it dangerous: "+getdangerous();
 }
    
}
