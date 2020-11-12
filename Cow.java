package animalproj;

public class Cow extends AnimalImpl {

    private int age;

    @Override
    public String animalKind() {
        return "Cow";
    }

    @Override
    public boolean canEat(String food) {
        if (food.equals("Grass")) {
            return true;
        }
        return false;
    }

    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)) {
            throw new Exception("Cows cannot eat " + food);
        }
        System.out.println("Chew, chew, chew...");
    }

    public String toString() {
        return "A cow which is " + age + " years old";
    }
}
