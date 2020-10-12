package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    boolean checker = false;
    double one_int = 0;
    double second_int = 0;
    double answer = 0;
    String one = "";
    char two;
    @FXML
    Label ans;

    public void pressNum(ActionEvent actionEvent) {
        Button btnez = (Button) actionEvent.getSource();
        one = one.concat(btnez.getText());
        ans.setText(one);
    }
    public void pressAct(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        if(!checker){
            one_int = Double.parseDouble(ans.getText());
            ans.setText("");
            two = btn.getText().charAt(0);
            checker = true;
            one = "";
        }
        else{
            second_int = Double.parseDouble(ans.getText());
            if(two == '+'){
                answer = one_int + second_int;
            }
            if(two == '-'){
                answer = one_int - second_int;
            }
            if(two == '/'){
                answer = one_int / second_int;
            }
            if(two == '*'){
                answer = one_int * second_int;
            }
            ans.setText(String.format("%f", answer));
            two = btn.getText().charAt(0);
            one_int = answer;
            one = "";
        }
    }
    public void pressEqual(ActionEvent actionEvent){
        if(!checker){
            one_int = Double.parseDouble(ans.getText());
            ans.setText(String.valueOf(one_int));
            checker = false;
            one = "";
        }
        else{
            second_int = Double.parseDouble(ans.getText());
            if(two == '+'){
                answer = one_int + second_int;
            }
            if(two == '-'){
                answer = one_int - second_int;
            }
            if(two == '/'){
                answer = one_int / second_int;
            }
            if(two == '*'){
                answer = one_int * second_int;
            }
            ans.setText(String.format("%f", answer));
            checker = false;
            one = "";
        }
    }
    public void clearAll(ActionEvent actionEvent){
        checker = false;
        one_int = 0;
        second_int = 0;
        answer = 0;
        one = "";
        ans.setText("");
    }
}
