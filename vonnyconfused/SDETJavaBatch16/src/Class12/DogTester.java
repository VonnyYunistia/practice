package Class12;

public class DogTester {

    public static void main(String[] args) {

        Dog actualDog= new Dog();

        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;


        actualDog.bark();

        Dog object= new Dog();

        object.name="Inos";
        object.age=5;
        object.breed="ChowChow";
        object.color="Brown";
        object.weight=89;
        object.fur="long";

        object.sleep();





    }
}
