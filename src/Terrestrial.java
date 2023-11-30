public class Terrestrial extends Animal {

    int nbrLegs;

    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;

    }
    @Override
    public String toString() {
        return "Terrestrial{" +
                "habitat='" + nbrLegs + '\'' +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal()+

                '}';
    }


}
