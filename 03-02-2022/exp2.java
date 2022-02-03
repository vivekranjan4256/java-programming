import java.util.Scanner;
public class exp2 {
    public static void main(String[] args){
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname=Obj.nextLine();
        System.out.println("Enter last name:");
        String lastname=Obj.nextLine();
        System.out.println("Name in required format is: "+lastname+" "+firstname);
    }
    
}
