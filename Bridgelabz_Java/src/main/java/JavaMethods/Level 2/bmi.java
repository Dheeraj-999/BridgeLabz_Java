import java.util.Scanner;

public class isPositiveNegative {

    public static boolean isPositive(int num) {

        return num >=0;
    }


    public static boolean isEven(int num) {
        
        return num % 2 == 0 ;

    }

    
    public static int compare(int num1,int num2) {
        if(num1>num2){
            return 1;
        }else if(num1==num2){
            return 0;
        }else {
            return -1;
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter person " + (i+1) + " weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter person " + (i+1) + " height: ");
            data[i][1] = sc.nextDouble();

            System.out.print("Enter person " + (i+1) + " bmi: ");
            data[i][2] = sc.nextDouble();
            
        
    }


        for(int i=0;i<arr.length;i++){

           if (isPositive(arr[i])){
                System.out.println("The number "+ arr[i] +" is Positive " );
            

               if(isEven(arr[i])){
                System.out.println("The number "+ arr[i] +" is Even " );
              }else{
                System.out.println("The number "+ arr[i] +" is odd " );

              }
            }else{
              System.out.println("The number "+ arr[i] +" is negative " );

            }


            int result = compare(arr[0],arr[arr.length-1]);
            
            if(result==1){
                System.out.println("First element is greater than last element" );

            }else if(result==0){
                System.out.println("First element is equal to last element" );

            }else{
                System.out.println("last element is greater than first element" );

            }
        }


        sc.close();
    }
}