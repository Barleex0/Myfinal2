import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
//File Manager Does all file operations
public class fileman {
static Path loc = Paths.get("Save.txt");

//This ensures that the file always exists in some capacity
static void cf(){
    try {
        loc.toFile().createNewFile();
    } catch (Exception e) {
        System.out.println("file exists\n");
    }
}

static void SF(byte[] tosave){
    cf();
    try {

        Files.write(loc, tosave);
    } catch (Exception e) {
        //This should never get called at anypoint in time
    }
    
}

static byte[] LF(){
    byte[] temp;
    cf();
    try {
        temp = Files.readAllBytes(loc);
        
    } catch (Exception e) {
        System.out.println("Load Failed"+e.getLocalizedMessage());
        temp= new byte[10];
    }
    return temp; 
}


//I AM LOST I HAVE NO IDEA WHATS GOING ONNNNNNNNNNN ANYMORE I HAVE BEEN UP FOR OVER 24 hours THIS BETTER WORK.
    
}
