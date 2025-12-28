public class NestedExample{
    public static void main(String [] args){
        int number = -7;

        if(number > 0){
            if(number % 2 == 0){
                System.out.println("Positive Even");
            } else{
                System.out.println("Positive Odd");
            }
            }else{
                if(number % 2 == 0){
                    System.out.println("Negative Even");
                }else{
                    System.out.println("Negative Odd");
                }
            }
        }
    }
    

