package model;

public class User_input {
    String variable = "";
    public void set_zero(){
        variable = variable + 0;
    };
    public void set_one(){
        variable = variable + 1;
    };
    public void set_two(){
        variable = variable + 2;
    };
    public void set_three(){
        variable = variable + 3;
    };
    public void set_four(){
        variable = variable + 4;
    };
    public void set_five(){
        variable = variable + 5;
    };
    public void set_six(){
        variable = variable + 6;
    };
    public void set_seven(){
        variable = variable + 7;
    };
    public void set_eight(){
        variable = variable + 8;
    };
    public void set_nine(){
        variable = variable + 9;
    };
    public void set_dot(){
        variable = variable + ".";
    };
    String get_variable(){
        return variable;
    };
    public static void main(String[] args) {
        User_input input = new User_input();

        input.set_one();
        input.set_two();
        input.set_dot();
        input.set_three();
        System.out.println(input.get_variable());
        Memory memory = new Memory();
        memory.set_first_variable(input.get_variable());
        System.out.println(memory.get_first_variable());
       }
}
