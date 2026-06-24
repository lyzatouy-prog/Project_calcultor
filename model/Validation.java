package model;

public class Validation {
    
    boolean is_variable_valid(String variable){

        // condition: two dots in the variable
        int count = 0;
        for (int  i = 0; i < variable.length(); i++){
            if (variable.charAt(i) == '.'){
                count++;
            }
  
            }
            if (count > 1 ){
                System.out.println("Invalid variable");
                return false;
        }

        System.out.println("Valid variable");
        return true;
    }


    boolean is_operator_valid(String operator){
        // condition 1: operator length is greather than 1
        if (operator.length() > 1){
            return false;
        }

        // condition 2; operator is one of the following: +, -, *, /
        if (operator != "+" && operator != "-" && operator != "*" && operator != "/"){
            return false;
        }
 
        return true;
    }

}
