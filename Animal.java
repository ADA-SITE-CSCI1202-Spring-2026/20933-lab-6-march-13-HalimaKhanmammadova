public class Animal {
    private String animalName;
    private String ownerName;
    private int age;

    // Constructor
    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age); // use setter so validation runs
    }

    // Getters
    public String getAnimalName() { return animalName; }
    public String getOwnerName()  { return ownerName; }
    public int    getAge()        { return age; }

    // Setters
    public void setAnimalName(String animalName) { this.animalName = animalName; }
    public void setOwnerName(String ownerName)   { this.ownerName = ownerName; }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative. Provided: " + age);
        }
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Animal{name='" + animalName + "', owner='" + ownerName + "', age=" + age + "}";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return age == other.age
            && animalName.equals(other.animalName)
            && ownerName.equals(other.ownerName);
    }
}