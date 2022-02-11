import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Books {
  public static void main(String[] args) throws IOException {
    Path fileName = Path.of("books.md");
    String str = Files.readString(fileName);
    System.out.println(str);
  }
}