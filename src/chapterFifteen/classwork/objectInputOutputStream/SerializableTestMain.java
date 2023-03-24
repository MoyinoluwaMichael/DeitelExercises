package chapterFifteen.classwork.objectInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTestMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bingo");
        dog.setBreed("German Shepherd");
        try (ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(
                        "C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\objectInputOutputStream\\Dog"))){
            objectOutputStream.writeObject(dog);
        }catch (IOException | SecurityException e){
            System.out.println(e.getMessage());
        }
    }
}
