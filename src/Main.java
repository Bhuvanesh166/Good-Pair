import java.util.Scanner;

class Pair{
    public int goodPair(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==k){
            count++;
        }
    }
        }
        return count;
    }

    public static void main(String[] args) {
        Pair pair=new Pair();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();

        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter K value");
        int k=scanner.nextInt();
        System.out.println(pair.goodPair(arr,k));

    }
}