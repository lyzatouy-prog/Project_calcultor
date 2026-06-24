package model;

public class Clear_BS {
    String varaible = "1234.5678";
    
    void set_clear(){
        varaible = "";
    };

    void set_backspace(){
        if(varaible.length() > 0){
            varaible = varaible.substring(0, varaible.length() - 1);
        }
    };

    String get_variable(){
        return varaible;
    };
    public static void main(String[] args) {
        Clear_BS clear_bs = new Clear_BS();
        System.out.println(clear_bs.get_variable());
        clear_bs.set_backspace();
        System.out.println(clear_bs.get_variable());
        clear_bs.set_clear();
        System.out.println(clear_bs.get_variable());
    }
}
