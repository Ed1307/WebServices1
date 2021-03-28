package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\Ed\\Desktop\\Projects\\WebServices1\\src\\task1\\Flowers.xml");

        // Считываем текстовый файл в пакете
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String temp = null;

        while ( ( temp = br.readLine() ) != null) {
            System.out.println(temp);
        }
    }
}
