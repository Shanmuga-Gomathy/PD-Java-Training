public class Array2 {
    public static void main(String[] args) {
        int[] arr={10,30,20,40,60,50};
        int a = 20;
        boolean found = false;

        for(int i=0; i< arr.length ; i++){
            if(arr[i] == a){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found the Value");
        }
        else{
            System.out.println("Cannot find the value");
        }

    }
}
