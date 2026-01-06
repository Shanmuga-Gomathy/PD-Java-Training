public class String1 {
    public static void main( String[] args){
        String org = "Hello";
        String rev = "";


        for (int i = org.length() - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }

        System.out.println("Original: " + org);
        System.out.println("Reversed: " + rev);




    }
}
