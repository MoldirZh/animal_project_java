package animalproj;

public class Tiger extends AnimalImpl {

    private int age;

    @Override
    public String animalKind() {
        return "Tiger";
    }

    @Override
    public boolean canEat(String food) {
        if (food.equals("Meat")) {
            return true;
        }
            return false;
    }

    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)) {
            throw new Exception("Tigers cannot eat " + food);
        }
        System.out.println("MUNCH, MUNCH...");
    }

    public String toString() {
        return "A tiger which is " + age + " years old";
    }
}
