public class Gorilla extends Mamal {
    public int energyLevel = displayEnergy();

    public void throwSomething(){
        String[] arr = {"Rock","Mud","Barrel","Coconut","Bolder"};
        System.out.println("Gorilla throws " + arr[(int)Math.random() * arr.length]);
        energyLevel -= 5;
        System.out.println("[Energy Level]: " + energyLevel);
    }

    public void eatBananas(){
        System.out.println("Gorilla eats bananas");
        energyLevel += 10;
        System.out.println("[Energy Level]: " + energyLevel);
    }

    public void climb(){
        System.out.println("Gorilla climbs ");
        energyLevel -= 10;
        System.out.println("[Energy Level]: " + energyLevel);
    }

}

