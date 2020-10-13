import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SnakeGame{

    public SnakeGame(){
        snakeFrame();
    }

    //method for snake frame
    public void snakeFrame(){
        JFrame frameSnake = new JFrame("2D Snake Game");
        SnakeGamePlay gamePlay=new SnakeGamePlay();

        frameSnake.setBounds(200,30,905,800);
        frameSnake.setResizable(false);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSnake.setBackground(Color.DARK_GRAY);
        frameSnake.add(gamePlay);
        frameSnake.revalidate();
                
        JFrame f = new JFrame("Rules");
        f.setVisible(true);
        f.setResizable(false);
        f.setBounds(230,150,530,400);

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        Font fo = new Font("Arial",Font.PLAIN,16);

        JLabel lblRules = new JLabel("Simple Rules");
        JLabel l1 = new JLabel("1) There will be 1 score on each pick of enemy.");
        JLabel l2 = new JLabel("2) Length of Snake will be increased by 1 at each pick of enemy.");
        JLabel l3 = new JLabel("3) When Snake touches itself, the game will over.");

        lblRules.setFont(fo);
        l1.setFont(fo);
        l2.setFont(fo);
        l3.setFont(fo);

        lblRules.setBounds(200,40,370,20);
        l1.setBounds(50,90,370,20);
        l2.setBounds(50,140,450,20);
        l3.setBounds(50,190,370,20);

        JButton btnCon = new JButton("Continue");
        btnCon.setBounds(190,250,130,60);
        btnCon.setFont(new Font("Arial",Font.BOLD,18));
        btnCon.setBackground(Color.GREEN);
        btnCon.setForeground(Color.RED);

        c.add(btnCon);
        c.add(lblRules);
        c.add(l1);
        c.add(l2);
        c.add(l3);
                
        btnCon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                frameSnake.setVisible(true);
                f.dispose();
            }
        });
    }

    public static void main(String[] args){
        new SnakeGame();
    }
}