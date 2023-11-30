public  class Penguin extends Aquatic{

    private float swimmingDepth;

    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth ){

        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
        //super.swim();
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth='" + getSwimmingDepth() + '\'' +
                "habitat='" + getHabitat() + '\'' +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal()+

                '}';
    }

    public void swim(){
        System.out.println("the penguin is swimming");
    }
}
