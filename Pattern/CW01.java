package Pattern;

public class CW01 {
    public static void main(String[] args) {
       for (int i=0;i<=5;i++){
           for (int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
       for (int i=1;i<=5;i++){
           for (int j=5;j>=i;j--){
               System.out.print("*");
           }
           System.out.println(" ");
       }
       int c=1;
       for (int i = 1;i<=5;i++){
           for (int j=1;j<=i;j++){
               System.out.print(c+" ");
               c++;
           }
           System.out.println(" ");
       }
    }
}
