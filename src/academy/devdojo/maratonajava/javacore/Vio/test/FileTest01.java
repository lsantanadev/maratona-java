package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            final boolean isCreated = file.createNewFile();
            System.out.println("Created: "+isCreated);
            System.out.println("Path: "+file.getPath());
            System.out.println("Absolute path: "+file.getAbsolutePath());
            System.out.println("is directory: "+file.isDirectory());
            System.out.println("is file: "+file.isFile());
            System.out.println("is hidden: "+file.isHidden());
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_DATE_TIME));
            final boolean exists = file.exists();
            if(exists){
                final boolean delete = file.delete();
                System.out.println("Deleted: "+delete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
