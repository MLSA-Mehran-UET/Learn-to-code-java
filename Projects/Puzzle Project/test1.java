import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class test1 implements ActionListener{
JFrame f1=new JFrame();
int x=0;
int y=0;
JButton bt1=new JButton("");
test1(){
f1.setLayout(null);
f1.setBounds(0,0,361,550);
bt1.setBounds(0,0,120,120);
f1.add(bt1);
bt1.addActionListener(this);
f1.show();
}  
public void actionPerformed(ActionEvent e){
if(e.getSource()==bt1){
	x=x+20;
	y=y+20;
	
JButton bt2=new JButton("2");
bt2.setBounds(x,y,200,200);
f1.add(bt2);
}
}
}

class test{
public static void main(String arg[]){
test1 p=new test1();		
		
}
}

 