package chapterFifteen.classwork.objectInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableTestMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        try(ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\objectInputOutputStream\\Dog"))){
            dog = (Dog)objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException | SecurityException e){
            System.out.println(e.getMessage());
        }
        System.out.println(dog.getBreed());
        System.out.println(dog.getName());
    }
}
