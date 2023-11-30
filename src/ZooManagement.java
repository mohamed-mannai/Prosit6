public class ZooManagement {
    public static void main(String[] args){

        Zoo myZoo = new Zoo("Wild Savannah Zoo","Safariville",3,9);
        Animal lion = new Animal("Lion","Leo",2,true);

        Animal lion1 = new Animal("Lion1","Leo1",3,true);
        Animal dog = new Animal("dog","berge",3,true);



        Aquatic aquatic=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",24);
        Aquatic aquatic2=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",12);
        Aquatic aquatic3=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",25);
        Aquatic aquatic4=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",35);
        Aquatic aquatic5=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",1);
        Aquatic aquatic6=new Penguin("Spheniscidae","Penguin1",15,false,"Southern Hemisphere",50);

        Aquatic aquatic1=new Dolphin("Delphinidae","Dolphin1",2,true,"oceans ans seas",25);
        Terrestrial terrestrial = new Terrestrial("Felidae","Liyo",10,true,4);
        Dolphin dolphin = new Dolphin("Delphinidae","Dolphin",2,true,"Oceans",25);
        Penguin penguin = new Penguin("Spheniscidae","Penguin",15,false,"Southern Hemisphere",24);



        System.out.println(dolphin);
        System.out.println(terrestrial);

        dolphin.swim();
        penguin.swim();

        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(aquatic1);
        myZoo.addAquaticAnimal(aquatic2);
        myZoo.addAquaticAnimal(aquatic3); myZoo.addAquaticAnimal(aquatic6);
        myZoo.addAquaticAnimal(aquatic4);
        myZoo.addAquaticAnimal(aquatic5);
        System.out.println( myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();


        myZoo.displayaquatic();

/*
//Ajouter

      System.out.println(myZoo.addAnimal(lion));
       System.out.println(myZoo.addAnimal(lion1));
        System.out.println(myZoo.addAnimal(dog));
        //rechercher




        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(lion1));
       System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(dog));






 myZoo.displayanimals();



*/






    }
}
