package animalproj;

public class AnimalImpl implements Animal {

    private int age;
    private int maxAge;
    private boolean isAlive;

    @Override
    public String animalKind() {
        return "Animal";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean canEat(String food) {
        if (food.equals("Food")) {
            return true;
        }
        return false;
    }

    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)) {
            throw new Exception("Animals cannot eat " + food);
        }
        System.out.println("Animal eating");
    }

    @Override
    public void ageOneYear() {
        if (age < maxAge) {
            isAlive = true;
            age++;
        } else {
            isAlive = false;
            System.out.println("Animal is not alive");
        }
    }

    public String toString() {
        return "An animal which is " + age + " years old";
    }
}
