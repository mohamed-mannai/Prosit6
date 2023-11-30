public class Zoo {
    Animal [] animals;
    Aquatic [] aquaticAnimals;

    private String name;
    private String city;
    private int nbrCages=25;

    private  int nbrAnimals;
    private int nbrAnimalsAquatic;
    private  int nbrAnimals1;

    public Zoo(String name,String city, int nbrCages,int nbrAnimalsAquatic){
        animals = new Animal[nbrCages];
        aquaticAnimals=new Aquatic[nbrAnimalsAquatic];
        this.name = name;
        this.city = city;
        this.nbrAnimalsAquatic = nbrAnimalsAquatic;
        this.nbrCages = nbrCages;
    }

    public void displayZoo(){
        System.out.println("myZoo{name:'" +name+"',city:'"+city+"',nbrCages:"+nbrCages+"}");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    public boolean addAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (nbrAnimals != nbrCages) {

            for (int i = 0; i < animals.length; i++)
                /*if(animals[i]!=null && animals[i].getName().equals(animal.getName())){
                    System.out.println("Erreur : animal trouve ");
                    return false;
                }*/

                if(animals[i]!=null&&index !=-1){
                    System.out.println("Erreur: Animal exist please add another animal that does not exist");
                    return false;

                }

            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;




        }










        return false;







    }


    public void displayanimals(){
        for(int i = 0;i<animals.length;i++){
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){

        for(int i=0;i<animals.length;i++) {
            if (animals[i]!=null && animals[i].getName()!=null&&animals[i].getName().equals(animal.getName())) {
                return i;
            }

        }
        return -1;





    }


    public boolean removeAnimal(Animal animal){


        for(int i=0;i<nbrAnimals;i++){
            if(animals[i]!=null && animals[i].getName()!=null&&animals[i].getName().equals(animal.getName())){


                for(int j=i;j<nbrAnimals-1;j++){
                    animals[j]=animals[j+1];

                }


                animals[nbrAnimals -1]=null;
                nbrAnimals--;
                return true ;
            }
        }














        return false ;
    }
    public void addAquaticAnimal(Aquatic aquatic) {


        if(nbrAnimals1!=nbrAnimalsAquatic){
            aquaticAnimals[nbrAnimals1] =aquatic;
            nbrAnimals1++;

        }
        else{
            System.out.println("Zoo Plein!!!!!! ");
        }











    }
    public float maxPenguinSwimmingDepth(){
        float maxDeph=0.0f;
        for(Aquatic animal :aquaticAnimals){
            if(animal instanceof Penguin){
                float pengDeph= ((Penguin) animal).getSwimmingDepth();
                if(pengDeph>maxDeph){
                    maxDeph=pengDeph;
                }
            }
        }
        return maxDeph;
    }
    public void displayNumberOfAquaticsByType(){
        int nombreDophins=0;
        int nombrePenguin=0;

        for(Aquatic animal:aquaticAnimals){
            if(animal instanceof Dolphin ){
                nombreDophins++;

            }
            if(animal instanceof Penguin){
                nombrePenguin++;
            }


        }
        System.out.println("Nombre de dauphins dans le zoo : "+nombreDophins);
        System.out.println("Nombre de penguins dans le zoo : "+nombrePenguin);
    }

    public void displayaquatic(){
        for(int i=0;i<aquaticAnimals.length;i++){
            System.out.println(aquaticAnimals[i]);
        }
    }







}
