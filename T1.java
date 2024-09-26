import java.util.Scanner;
public class T1{
    public static void main(String[] args) {
        //a
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();
            System.out.print("\n");
        }
        System.out.println("The elements of the array are:");            
        for(int i=0;i<n;i++){
            System.out.println(i+": "+arr[i]);            
        }
        //b
        System.out.print("Enter Another Number: ");
        int ex = sc.nextInt();
        int[] arr2 = new int[n+1];
        for(int i=0;i<n;i++){
            arr2[i] = arr[i];
        }
        arr2[n] = ex;
        System.out.println("After resizing the array:");
        for(int i=0;i<n+1;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.print("\n");
    }
}