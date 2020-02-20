import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Calculator {

    public static int addSum(ArrayList<Integer> values){

        int sum =0;
        for (int i = 0; i < values.size(); i++){
            sum = sum + values.get(i);
        }
        return sum;
    }

    public static int multiplication(ArrayList<Integer> values){

        int total = 1;
        for (int i = 0; i < values.size(); i++){
            total = total * values.get(i);
        }
        return total;

    }

    public static boolean ExceptionHandler(String num){
        try {
            Integer.parseInt(num);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args){


        ArrayList<Integer> number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any number of your wish and type [Stop] to terminate : ");
        String total = scanner.next();

        if (total != " "){
            while (ExceptionHandler(total))
            {
                int  newTotal = Integer.parseInt(total);
                number.add(newTotal);
                if (!total.trim().equals("Stop")){

                    System.out.println("Please Enter any number of your wish and type [Stop] to terminate : ");
                    total = scanner.next();
                }
                else {
                    break;
                }
            }
        }

        System.out.println("The sum of "+number+" is = "+addSum(number));

        System.out.println("The multiplication of "+number+" is = "+multiplication(number));
    }


}
