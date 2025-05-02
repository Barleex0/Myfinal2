import java.util.Scanner;
import java.util.ArrayList;
import java.util.random.*;
public class menu {
static Scanner menuinp = new Scanner(System.in);
static byte[] map; 

static ArrayList<String> prv = new ArrayList<String>();


    static void MM() {
        System.out.println(
        "please choose an option by entering a number\n"+
        "1 to Load a map\n"+
        "2 to Generate a map\n"+
        "3 to Save a map file\n"+
        "4 to Clean Exit"
        );
        int ans = menuinp.nextInt();
        try {
         if (ans <= 4 && ans > 0) {
            System.out.println("Routing you to your menu. \n");
            menuinp.nextLine();
         }
         else{
         throw new IndexOutOfBoundsException(1);
         }
        } catch (Exception e) {
            System.out.println("1-4 are the only valid values\n");
            MM();
        }
        
        switch (ans) {
            case 1:
                fileman.LF();
                MM();
            case 2:
             System.out.println("give a size below 255");
             ans = menuinp.nextInt();
            try {
                if (ans <= 225 && ans > 0) {
                   System.out.println("accepted \n");
                   menuinp.nextLine();
                   for (int i = 0; i < (ans-1); i++) {
                    prv.add("ans" + ans/System.currentTimeMillis());
                   }
                }
                else{
                throw new IndexOutOfBoundsException(1);
                }
               } catch (Exception e) {
                   System.out.println("less than 225 sending bac to menu");
               }


               
            
                MM();
            case 3:
                fileman.SF(map);
            
                MM();
            case 4:
                
            
                System.exit(ans);

                
        
            default:
                break;
        }

    }



    
}
