package tn.esprit.gestionzoo.entities;

public final class pinguins extends Aquatic{
    float swimmingDepth;

    public pinguins(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super( family,  name,  age,  isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public pinguins() {

    }
}
