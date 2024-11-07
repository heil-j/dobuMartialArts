package Test4;

public class testing {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 36;
        double aSq = Math.pow(a, 2);
        double bSq = Math.sqrt(b);

        System.out.println("a = " + aSq);
        System.out.println("b = " + bSq);

        //for loop

        String name = "RIGOR";

        for (int i = 0; i < name.length(); i++){
            System.out.println("The Letters in Rigors name are: " + name.charAt(i));
        
        }

        

    }
}
