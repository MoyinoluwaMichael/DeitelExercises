package chapterFifteen.classwork;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class FilesIOStreams {
    public static void main(String[] args) {
//        EXAMPLE1
//        Path path3 = Path.of("a:");
//        Path path = Paths.get("a:/b/c.java");
//        System.out.println(path.getFileName());
//        System.out.println(path.getFileSystem());
//        System.out.println();
//        System.out.println(path.endsWith(Paths.get("c.java")));
//
//        Path path2 = Paths.get("a:/b/c/..").normalize();
//        System.out.println(path2.getFileName());
//        System.out.println(path2.getFileSystem());
//        System.out.println(path2.getRoot());
//
//        System.out.println(System.getProperty("file.separator"));


//        EXAMPLE2
//
//        Path path4 = Paths.get("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\fileStream");
////
//        try{
//            Files.createDirectory(path4);
//            for (int i = 1; i <= 3; i++) {
//                Path path = Path.of("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\fileStream"+"reg"+i+".java");
//                Files.createFile(path);
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
////
//        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path4)){
//            Files.createFile(path4);
//            Iterator<Path> iterator = directoryStream.iterator();
//            if (iterator.hasNext()){
//                Path path = iterator.next();
//                System.out.println(path.getFileName());
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        EXAMPLE3
        Path path = Paths.get("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\" +
                "classwork");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            int counter = 1;
            for (Path file : directoryStream) {
                if (Files.isDirectory(file)) {
                    System.out.println(counter + ". " + file + " is a dir and has below files:");
                    counter++;
                    int count = 1;
                    try (DirectoryStream<Path> directoryStream1 = Files.newDirectoryStream(file)) {
                        for (Path innerFile : directoryStream1) {
                            System.out.println(" " + count + ". " + innerFile.getFileName());
                            count++;
                        }
                    } catch(IOException w){
                        System.out.println(w.getMessage());
                    }
                } else {
                    System.out.println(counter + ". " + file.getFileName() + " is a file");
                    counter++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
