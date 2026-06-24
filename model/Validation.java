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
        return true;
    }
    boolean is_operator_valid(String operator){
        // condition 1: operator length is greather than 1
        if (operator != "+" && operator != "*" && operator)
 
        return true;
    }

}
