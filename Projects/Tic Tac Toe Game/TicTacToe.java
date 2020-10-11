import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class TicTacToe{
    //For Design
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JLabel lblName;
    JLabel score1;
    JLabel score2;
    JLabel playerX;
    JLabel playerO;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnExit;
    JButton btnReset;

    //For game working
    private String startGame = "X" ;
    private int xScore = 0;
    private int oScore = 0;
    private  int clr1 = 1;
    private  int clr2 = 1;
    private  int clr3 = 1;
    private  int clr4 = 1;
    private  int clr5 = 1;
    private  int clr6 = 1;
    private  int clr7 = 1;
    private  int clr8 = 1;
    private  int clr9 = 1;
    
    public TicTacToe(){
        gameDesign();
    }

    private void gameScore(){
        score1.setText( String.valueOf(xScore) );
        score2.setText( String.valueOf(oScore) );
    }

    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O" ;
        }
        else {
            startGame = "X" ;
        }
    }

    private void winningGame(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();

        if(b1==("X") && b2==("X") && b3==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn2.setBackground(Color.PINK);
            btn3.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
        }
        else if(b4==("X") && b5==("X") && b6==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b7==("X") && b8==("X") && b9==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn7.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } 
        else if(b1==("X") && b4==("X") && b7==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn4.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b2==("X") && b5==("X") && b8==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b3==("X") && b6==("X") && b9==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b1==("X") && b5==("X") && b9==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b3==("X") && b5==("X") && b7==("X")){
            JOptionPane.showMessageDialog(null,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xScore++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        
        else if(b1==("O") && b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b7==("O") && b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } 
        else if(b1==("O") && b4==("O") && b7==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b2==("O") && b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b3==("O") && b6==("O") && b9==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b1==("O") && b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b3==("O") && b5==("O") && b7==("O")){
            JOptionPane.showMessageDialog(null,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oScore++;
            gameScore();
            btn3.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    
    }


    public void gameDesign(){
        frame = new JFrame("Tic Tac Toe");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(200,100,1000,600);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(0,1,994,100);
        LineBorder border = new LineBorder(Color.BLACK,2);
        panel1.setBorder(border);
        c.add(panel1);

        lblName = new JLabel("Tic Tac Toe");
        lblName.setFont(new Font("Arial",Font.BOLD,60));
        lblName.setBounds(320,0,500,100);

        panel1.add(lblName);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,5));
        panel2.setBounds(0,100,994,471);
        panel2.setBorder(border);
        c.add(panel2);

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        playerX = new JLabel("Player X"); 
        score1 = new JLabel("0");

        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        playerO = new JLabel("Player O"); 
        score2 = new JLabel("0");

        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnExit = new JButton("Exit");
        btnReset = new JButton("Reset");

        LineBorder b = new LineBorder(Color.BLACK,1);
        playerX.setBorder(b);
        playerO.setBorder(b);
        score1.setBorder(b);
        score2.setBorder(b);
        btn1.setBorder(b);
        btn2.setBorder(b);
        btn3.setBorder(b);
        btn4.setBorder(b);
        btn5.setBorder(b);
        btn6.setBorder(b);
        btn7.setBorder(b);
        btn8.setBorder(b);
        btn9.setBorder(b);
        btnExit.setBorder(b);
        btnReset.setBorder(b);

        playerX.setHorizontalAlignment(JLabel.CENTER);
        playerO.setHorizontalAlignment(JLabel.CENTER);
        score1.setHorizontalAlignment(JLabel.CENTER);
        score2.setHorizontalAlignment(JLabel.CENTER);

        playerX.setForeground(Color.RED);
        playerO.setForeground(Color.BLUE);
        score1.setForeground(Color.RED);
        score2.setForeground(Color.BLUE);

        Font f1 = new Font("Arial",Font.BOLD,36);
        playerX.setFont(f1);
        playerO.setFont(f1);
        score1.setFont(f1);
        score2.setFont(f1);
        btnExit.setFont(f1);
        btnReset.setFont(f1);

        Font f2 = new Font("Arial",Font.BOLD,70);

        btn1.setFont(f2);
        btn2.setFont(f2);
        btn3.setFont(f2);
        btn4.setFont(f2);
        btn5.setFont(f2);
        btn6.setFont(f2);
        btn7.setFont(f2);
        btn8.setFont(f2);
        btn9.setFont(f2);

        
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(playerX);
        panel2.add(score1);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(playerO);
        panel2.add(score2);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btnReset);
        panel2.add(btnExit);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn1Action(evt);
            }
        });

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn2Action(evt);
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn3Action(evt);
            }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn4Action(evt);
            }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn5Action(evt);
            }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn6Action(evt);
            }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn7Action(evt);
            }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn8Action(evt);
            }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn9Action(evt);
            }
        });
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnExitAction(evt);
            }
        });
        btnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnResetAction(evt);
            }
        });
    }


    private void btn1Action(ActionEvent evt){
        String a= btn1.getText();
        if( a!="X" && a!="O"){
            btn1.setText(startGame);
        }
        else{
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr1==1){
            if(startGame.equalsIgnoreCase("X")){
                btn1.setForeground(Color.RED);
                clr1=5;
            }
            else {
                btn1.setForeground(Color.BLUE);
                clr1=5;
            }
        
            choose_a_Player();
            winningGame();
        }
    }
    private void btn2Action(ActionEvent evt){
        String a= btn2.getText();
        if( a!="X" && a!="O"){
            btn2.setText(startGame);
        }
        else{
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr2==1){
            if(startGame.equalsIgnoreCase("X")){
                btn2.setForeground(Color.RED);
                clr2=5;
            }
            else {
                btn2.setForeground(Color.BLUE);
                clr2=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn3Action(ActionEvent evt){
        String a= btn3.getText();
        if( a!="X" && a!="O"){
            btn3.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr3==1){
            if(startGame.equalsIgnoreCase("X")){
                btn3.setForeground(Color.RED);
                clr3=5;
            }
            else {
                btn3.setForeground(Color.BLUE);
                clr3=5;
            }
        
            choose_a_Player();
            winningGame();
        }
    }
    private void btn4Action(ActionEvent evt){
        String a= btn4.getText();
        if( a!="X" && a!="O"){
            btn4.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr4==1){
            if(startGame.equalsIgnoreCase("X")){
                btn4.setForeground(Color.RED);
                clr4=5;
            }
            else {
                btn4.setForeground(Color.BLUE);
                clr4=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn5Action(ActionEvent evt){
        String a= btn5.getText();
        if( a!="X" && a!="O"){
            btn5.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr5==1){
            if(startGame.equalsIgnoreCase("X")){
                btn5.setForeground(Color.RED);
                clr5=5;
            }
            else {
                btn5.setForeground(Color.BLUE);
                clr5=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn6Action(ActionEvent evt){
        String a= btn6.getText();
        if( a!="X" && a!="O"){
            btn6.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr6==1){
            if(startGame.equalsIgnoreCase("X")){
                btn6.setForeground(Color.RED);
                clr6=5;
            }
            else {
                btn6.setForeground(Color.BLUE);
                clr6=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn7Action(ActionEvent evt){
        String a= btn7.getText();
        if( a!="X" && a!="O"){
            btn7.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr7==1){
            if(startGame.equalsIgnoreCase("X")){
                btn7.setForeground(Color.RED);
                clr7=5;
            }
            else {
                btn7.setForeground(Color.BLUE);
                clr7=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn8Action(ActionEvent evt){
        String a= btn8.getText();
        if( a!="X" && a!="O"){
            btn8.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(clr8==1){
            if(startGame.equalsIgnoreCase("X")){
                btn8.setForeground(Color.RED);
                clr8=5;
            }
            else {
                btn8.setForeground(Color.BLUE);
                clr8=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btn9Action(ActionEvent evt){
        String a= btn9.getText();
        if( a!="X" && a!="O"){
            btn9.setText(startGame);
        }
        else {
            JOptionPane.showMessageDialog(null,"The Box is Already Filled","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
            if(clr9==1){
                if(startGame.equalsIgnoreCase("X")){
                btn9.setForeground(Color.RED);
                clr9=5;
            }
            else {
                btn9.setForeground(Color.BLUE);
                clr9=5;
            }
            choose_a_Player();
            winningGame();
        }
    }
    private void btnExitAction(ActionEvent evt){
        int option=JOptionPane.showConfirmDialog(null,"Confirm if you want to exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION);
        if(option==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    private void btnResetAction(ActionEvent evt){
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
        btn6.setBackground(null);
        btn7.setBackground(null);
        btn8.setBackground(null);
        btn9.setBackground(null);
        
        clr1=1;
        clr2=1;
        clr3=1;
        clr4=1;
        clr5=1;
        clr6=1;
        clr7=1;
        clr8=1;
        clr9=1;

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

    }
    
    public static void main(String[] args){
        new TicTacToe();
    }
}