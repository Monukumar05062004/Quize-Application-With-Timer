package quizeapplication;
import java.io.File;
public class cwh_1 {
    public static void main(String[] args) {
        try {
            File ob = new File("C:\\Users\\Monu Kumar\\OneDrive\\Desktop\\project12");
            if (ob.createNewFile()) {
                //System.out.println("file created "+ob.getName());
                System.out.println("is file readable "+ob.getAbsolutePath());

            }
            else{ System.out.println("file exit");

                System.out.println("is file readable "+ob.canRead());
                System.out.println("is file readable "+ob.canRead());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
