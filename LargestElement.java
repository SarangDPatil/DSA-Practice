public class LargestElement{
    public static void main(String[] args){
        int []arr = {2,4,5,7,2,9,10};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element is : "+max);
    }
}