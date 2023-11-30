import java.util.Objects;

public abstract  class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;


    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal()+

                '}';
    }

    public abstract void swim();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aquatic aquatic = (Aquatic) o;

        if (!Objects.equals(habitat, aquatic.habitat)) return false;
        return getName().equals(aquatic.getName()) && getAge() == aquatic.getAge();
    }


}
