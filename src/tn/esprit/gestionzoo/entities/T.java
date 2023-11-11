package tn.esprit.gestionzoo.entities;

public class T extends Animal{
    int nblegs;

    public T(String family, String name, int age, boolean isMammal,int nblegs) {
        super( family,  name,  age,  isMammal);
        this.nblegs = nblegs;
    }

    public T(){};
}
