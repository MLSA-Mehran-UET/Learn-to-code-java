import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class puzzle implements ActionListener{
JFrame f1=new JFrame();
ImageIcon it=new ImageIcon("main.jpg");
JLabel l1=new JLabel(it);
JFrame f4=new JFrame();
JFrame f2=new JFrame();
Icon i16=new ImageIcon("f1.jpg");
Icon i1=new ImageIcon("1.jpg");
Icon i2=new ImageIcon("2.jpg");
Icon i3=new ImageIcon("3.jpg");
Icon i4=new ImageIcon("4.jpg");
Icon i5=new ImageIcon("5.jpg");
Icon i6=new ImageIcon("6.jpg");
Icon i7=new ImageIcon("7.jpg");
Icon i8=new ImageIcon("8.jpg");
Icon i9=new ImageIcon("9.jpg");
Icon i10=new ImageIcon("10.jpg");
Icon i11=new ImageIcon("11.jpg");
Icon i12=new ImageIcon("12.jpg");
Icon i13=new ImageIcon("13.jpg");
Icon i14=new ImageIcon("14.jpg");
Icon i15=new ImageIcon("15.jpg");
Icon blank=new ImageIcon("blank.jpg");
JButton first=new JButton(i16);
JButton ex=new JButton("EXit");
JButton bt1=new JButton(i5);
JButton bt2=new JButton(i11);
JButton bt3=new JButton(i4);
JButton bt4=new JButton(i1);
JButton bt5=new JButton(i2);
JButton bt6=new JButton(i10);
JButton bt7=new JButton(i9);
JButton bt8=new JButton(i7);
JButton bt9=new JButton(blank);
JButton bt10=new JButton(i3);
JButton bt11=new JButton(i15);
JButton bt12=new JButton(i8);
JButton bt13=new JButton(i6);
JButton bt14=new JButton(i13);
JButton bt15=new JButton(i14);
JButton bt16=new JButton(i12);
JButton bt18=new JButton("Actual Picture");
JButton bt19=new JButton("Exit");
puzzle(){
f1.setBounds(550,0,361,550);
l1.setBounds(0,0,361,433);
ex.setBounds(0,475,361,33);
f4.setLayout(null);
f4.setBounds(0,0,495,670);
f2.setBounds(0,0,712,495);
first.setBounds(0,0,712,495);
bt1.setBounds(0,0,120,120);
bt2.setBounds(120,0,120,120);
bt3.setBounds(240,0,120,120);
bt4.setBounds(360,0,120,120);
bt5.setBounds(0,120,120,120);
bt6.setBounds(120,120,120,120);
bt7.setBounds(240,120,120,120);
bt8.setBounds(360,120,120,120);
bt9.setBounds(0,240,120,120);
bt10.setBounds(120,240,120,120);
bt11.setBounds(240,240,120,120);
bt12.setBounds(360,240,120,120);
bt13.setBounds(0,360,120,120);
bt14.setBounds(120,360,120,120);
bt15.setBounds(240,360,120,120);
bt16.setBounds(360,360,120,120);
bt18.setBounds(0,480,240,150);
bt19.setBounds(240,480,240,150);
f4.add(bt19);
f4.add(bt1);
f4.add(bt2);
f4.add(bt3);
f4.add(bt4);
f4.add(bt5);
f4.add(bt6);
f4.add(bt7);
f4.add(bt8);
f4.add(bt9);
f4.add(bt10);
f4.add(bt11);
f4.add(bt12);
f4.add(bt13);
f4.add(bt14);
f4.add(bt15);
f4.add(bt16);
f4.add(bt18);
f2.add(first);
f2.show();
f1.add(ex);
f1.add(l1);
ex.addActionListener(this);
bt1.addActionListener(this);
bt2.addActionListener(this);
bt3.addActionListener(this);
bt4.addActionListener(this);
bt5.addActionListener(this);
bt6.addActionListener(this);
bt7.addActionListener(this);
bt8.addActionListener(this);
bt9.addActionListener(this);
bt10.addActionListener(this);
bt11.addActionListener(this);
bt12.addActionListener(this);
bt13.addActionListener(this);
bt14.addActionListener(this);
bt15.addActionListener(this);
bt16.addActionListener(this);
bt18.addActionListener(this);
first.addActionListener(this);
bt19.addActionListener(this);
} 
public void actionPerformed(ActionEvent e){

if(e.getSource()==first){
f4.show();
f2.show(false);    }
if(e.getSource()==bt19){
	System.exit(0);
}
if(e.getSource()==bt18){
f1.show();
}
if(e.getSource()==ex){
	f1.show(false);
}
if(e.getSource()==bt1){
if(bt2.getIcon()==blank) {
bt2.setIcon(bt1.getIcon());
bt1.setIcon(blank);	  
}
else if(bt5.getIcon()==blank) {
bt5.setIcon(bt1.getIcon());
bt1.setIcon(blank);	  
}
}
if(e.getSource()==bt2){
if(bt1.getIcon()==blank){
bt1.setIcon(bt2.getIcon());
bt2.setIcon(blank);	
}	
else if(bt6.getIcon()==blank){
	bt6.setIcon(bt2.getIcon());
bt2.setIcon(blank);	
}
else if(bt3.getIcon()==blank){
	bt3.setIcon(bt2.getIcon());
bt2.setIcon(blank);	
}
}
if(e.getSource()==bt3){
if(bt2.getIcon()==blank){
bt2.setIcon(bt3.getIcon());
bt3.setIcon(blank);	
}	
else if(bt4.getIcon()==blank){
	bt4.setIcon(bt3.getIcon());
bt3.setIcon(blank);	
}
else if(bt7.getIcon()==blank){
	bt7.setIcon(bt3.getIcon());
bt3.setIcon(blank);	
}
}
if(e.getSource()==bt4){
if(bt3.getIcon()==blank){
bt3.setIcon(bt4.getIcon());
bt4.setIcon(blank);	
}	
else if(bt8.getIcon()==blank){
	bt8.setIcon(bt4.getIcon());
bt4.setIcon(blank);	
}
}
if(e.getSource()==bt5){
if(bt1.getIcon()==blank){
bt1.setIcon(bt5.getIcon());
bt5.setIcon(blank);	
}	
else if(bt9.getIcon()==blank){
	bt9.setIcon(bt5.getIcon());
bt5.setIcon(blank);	
}
else if(bt6.getIcon()==blank){
	bt6.setIcon(bt5.getIcon());
bt5.setIcon(blank);	
}
}
if(e.getSource()==bt6){
if(bt2.getIcon()==blank){
bt2.setIcon(bt6.getIcon());
bt6.setIcon(blank);	
}	
else if(bt5.getIcon()==blank){
	bt5.setIcon(bt6.getIcon());
bt6.setIcon(blank);	
}
else if(bt10.getIcon()==blank){
	bt10.setIcon(bt6.getIcon());
bt6.setIcon(blank);	
}
else if(bt7.getIcon()==blank){
	bt7.setIcon(bt6.getIcon());
bt6.setIcon(blank);	
}
}
if(e.getSource()==bt7){
if(bt6.getIcon()==blank){
bt6.setIcon(bt7.getIcon());
bt7.setIcon(blank);	
}	
else if(bt11.getIcon()==blank){
	bt11.setIcon(bt7.getIcon());
bt7.setIcon(blank);	
}
else if(bt3.getIcon()==blank){
	bt3.setIcon(bt7.getIcon());
bt7.setIcon(blank);	
}
else if(bt8.getIcon()==blank){
	bt8.setIcon(bt7.getIcon());
bt7.setIcon(blank);	
}
}
if(e.getSource()==bt8){
if(bt7.getIcon()==blank){
bt7.setIcon(bt8.getIcon());
bt8.setIcon(blank);	
}	
else if(bt12.getIcon()==blank){
	bt12.setIcon(bt8.getIcon());
bt8.setIcon(blank);	
}
else if(bt4.getIcon()==blank){
	bt4.setIcon(bt8.getIcon());
bt8.setIcon(blank);	
}
}
if(e.getSource()==bt9){
if(bt5.getIcon()==blank){
bt5.setIcon(bt9.getIcon());
bt9.setIcon(blank);	
}	
else if(bt10.getIcon()==blank){
	bt10.setIcon(bt9.getIcon());
bt9.setIcon(blank);	
}
else if(bt13.getIcon()==blank){
	bt13.setIcon(bt9.getIcon());
bt9.setIcon(blank);	
}
}
if(e.getSource()==bt10){
if(bt6.getIcon()==blank){
bt6.setIcon(bt10.getIcon());
bt10.setIcon(blank);	
}	
else if(bt9.getIcon()==blank){
	bt9.setIcon(bt10.getIcon());
bt10.setIcon(blank);	
}
else if(bt14.getIcon()==blank){
	bt14.setIcon(bt10.getIcon());
bt10.setIcon(blank);	
}
else if(bt11.getIcon()==blank){
	bt11.setIcon(bt10.getIcon());
bt10.setIcon(blank);	
}
}
if(e.getSource()==bt11){
if(bt10.getIcon()==blank){
bt10.setIcon(bt11.getIcon());
bt11.setIcon(blank);	
}	
else if(bt12.getIcon()==blank){
bt12.setIcon(bt11.getIcon());
bt11.setIcon(blank);	
}
else if(bt7.getIcon()==blank){
bt7.setIcon(bt11.getIcon());
bt11.setIcon(blank);	
}
else if(bt15.getIcon()==blank){
bt15.setIcon(bt11.getIcon());
bt11.setIcon(blank);	
}
}
if(e.getSource()==bt12){
if(bt8.getIcon()==blank){
bt8.setIcon(bt12.getIcon());
bt12.setIcon(blank);	
}	
else if(bt11.getIcon()==blank){
bt11.setIcon(bt12.getIcon());
bt12.setIcon(blank);	
}	
else if(bt16.getIcon()==blank){
bt16.setIcon(bt12.getIcon());
bt12.setIcon(blank);	
}	
}
if(e.getSource()==bt13){
if(bt9.getIcon()==blank){
bt9.setIcon(bt13.getIcon());
bt13.setIcon(blank);	
}	
else if(bt14.getIcon()==blank){
bt14.setIcon(bt13.getIcon());
bt13.setIcon(blank);	
}
}
if(e.getSource()==bt14){
if(bt13.getIcon()==blank){
bt13.setIcon(bt14.getIcon());
bt14.setIcon(blank);	
}	
else if(bt10.getIcon()==blank){
bt10.setIcon(bt14.getIcon());
bt14.setIcon(blank);	
}
else if(bt15.getIcon()==blank){
bt15.setIcon(bt14.getIcon());
bt14.setIcon(blank);	
}}
if(e.getSource()==bt15){
if(bt14.getIcon()==blank){
bt14.setIcon(bt15.getIcon());
bt15.setIcon(blank);	
}	
else if(bt11.getIcon()==blank){
bt11.setIcon(bt15.getIcon());
bt15.setIcon(blank);	
}
else if(bt16.getIcon()==blank){
bt16.setIcon(bt15.getIcon());
bt15.setIcon(blank);	
}
}
if(e.getSource()==bt16){
if(bt12.getIcon()==blank){
bt12.setIcon(bt16.getIcon());
bt16.setIcon(blank);	
}	
else if(bt15.getIcon()==blank){
bt15.setIcon(bt16.getIcon());
bt16.setIcon(blank);	}
}
}
}

class test{
public static void main(String arg[]){
puzzle p=new puzzle();		
		
}
}

 