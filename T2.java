import java.util.Scanner;
public class T2{
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
        System.out.println("Before removing duplicates:");            
        for(int i=0;i<n;i++){
            System.out.println(i+": "+arr[i]);            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == arr[j]){
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        System.out.println("After removing duplicates:");            
        for(int i=0;i<n;i++){
            System.out.println(i+": "+arr[i]);            
        }
    }
}