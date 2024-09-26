import java.util.Scanner;
public class T3{
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
        //a
        int[] arr2 = new int[n];
        int j= 0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Reversed using a new array:");            
        for(int i=0;i<n;i++){
            System.out.println(i+": "+arr2[i]);            
        }
        //b
        j=arr.length-1;
        for(int i=0;i<n;i++){
            if(i ==j){
                break;
            }
            int st = arr[j];
            arr[j] = arr[i];
            arr[i] = st;
            j--;
        }
        System.out.println("Reversed the original array:");            
        for(int i=0;i<n;i++){
            System.out.println(i+": "+arr[i]);            
        }
    }
}