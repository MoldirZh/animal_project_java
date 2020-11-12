package animalproj;

public class TestingAnimal {

    public static void feedMeat(Animal animal) {
        try{
            animal.feed("Meat");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Cow cow = new Cow(); // We can also do this
                             // Animal cow = new Cow();
        Tiger tiger = new Tiger();

        System.out.println(cow.canEat("Meat"));
        System.out.println(tiger.canEat("Meat"));

        cow.ageOneYear();

        System.out.println(cow);
        System.out.println(tiger);

        feedMeat(cow);
        feedMeat(tiger);
    }
}
