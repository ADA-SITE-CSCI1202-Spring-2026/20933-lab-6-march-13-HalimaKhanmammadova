public class MainAnimal {
    public static void main(String[] args) {

        // Normal Animal
        Animal cat = new Animal("Whiskers", "Alice", 3);
        System.out.println(cat);

        // Normal Dog
        Dog dog1 = new Dog("Rex", "Bob", 5, "Labrador");
        Dog dog2 = new Dog("Rex", "Bob", 5, "Labrador");
        System.out.println(dog1);
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));

        // Trigger IllegalArgumentException for negative age
        try {
            Animal badAnimal = new Animal("Ghost", "Eve", -2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Trigger via setter
        try {
            dog1.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
