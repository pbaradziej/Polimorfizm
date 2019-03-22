
package plazy;

/**
 *
 * @author PawelB
 */
public class Plazy {

    String family;
    boolean poisonous;
    double length;
    
    Plazy(){
    }
    
    Plazy(String family,boolean poisonous,double length){
    this.family=family;
    this.poisonous=poisonous;
    this.length=length;
    }

public String getfamily(){
return family;
}

public boolean getpoisonous(){
return poisonous;
}

public double getlength(){
return length;
}

public String toString(){
    return "Belongs to: "+getfamily()+", has poison: "+getpoisonous()+", has "+getlength()+"cm";
}

}
