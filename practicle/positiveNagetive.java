import java.util.Scanner;

public class positiveNagetive {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n>0){
            System.out.println(n + " It is posative");
        } else{
            System.out.println(n + " It is native");
        }
    }
}

// This can be refer to current class instant variable... current class method. invoke current class constractor.
// 4. This can be pass as an argument in the method call. 
// 5. This can be pass as a 
// 6. This can be use to return the current class instance from the method.