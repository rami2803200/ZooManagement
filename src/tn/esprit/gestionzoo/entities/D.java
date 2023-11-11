package tn.esprit.gestionzoo.entities;

public final class D extends Aquatic {
    float swimmingspeed;

    public D(String family, String name, int age, boolean isMammal,String habitat,float swimmingspeed) {
        super( family,  name,  age,  isMammal, habitat);
        this.swimmingspeed = swimmingspeed;
    }
    public D() {
    }


}
