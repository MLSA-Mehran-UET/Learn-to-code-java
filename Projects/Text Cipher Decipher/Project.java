import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class EncrypeterDycrpyter implements ActionListener{
String str;
String str1;
String str2;
String str3;
char[] ch;	
char[] ch1;
JFrame f5=new JFrame();
JButton b1=new JButton("Encrypt Message");
JButton b2=new JButton("Encrypt TextFile ");
JButton b3=new JButton("decrypt Message");
JButton b4=new JButton("Exit");
JButton bt2=new JButton("Back");
JButton bt3=new JButton("Decrypt Message");
JButton bt4=new JButton("Back");
JTextArea t3=new JTextArea();
JTextArea t4=new JTextArea();
JLabel l3=new JLabel("Enter Message");
JLabel l4=new JLabel("Encrypted Message");
JFrame f1=new JFrame();
JFrame f2=new JFrame();
JFrame f3=new JFrame();
JFrame f4=new JFrame();
JTextArea t1=new JTextArea();
JTextArea t2=new JTextArea();
JLabel l1=new JLabel("Enter Text");
JLabel l2=new JLabel("Decrypted Text");
JButton bt1=new JButton("Encrypt Message");
ED(){
	f4.setLayout(null);
f1.setLayout(new GridLayout(3,1,20,20));
f1.setSize(400,400);
l1.setBounds(20,30,200,50);
bt2.setBounds(240,260,200,50);
t1.setBounds(20,80,430,150);
t2.setBounds(20,350,430,150);
l2.setBounds(20,300,200,50);
f4.setSize(500,550);
l3.setBounds(20,30,200,50);
bt3.setBounds(20,260,200,50);
bt4.setBounds(240,260,200,50);
t3.setBounds(20,80,430,150);
t4.setBounds(20,350,430,150);
l4.setBounds(20,300,200,50);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
bt1.addActionListener(this);
bt2.addActionListener(this);
bt3.addActionListener(this);
bt4.addActionListener(this);
f2.add(bt2);
f2.add(t2);
f2.add(l1);
f1.add(b1);
f1.add(b3);	
f1.add(b4);
f2.add(t1);
f2.add(l2);
f2.add(bt1);
f4.add(bt3);
f4.add(bt4);
f4.add(l3);
f4.add(l4);
f4.add(t3);
f4.add(t4);
f1.show();	
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
f2.setLayout(null);
f2.setSize(500,550);
bt1.setBounds(20,260,200,50);
f2.show();
}	
if(e.getSource()==bt1){
str=t1.getText();	
ch=str.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]=='A'||ch[i]=='a')
ch[i]='!';
else if(ch[i]=='B'||ch[i]=='b')
ch[i]='(';
else if(ch[i]=='c'||ch[i]=='C')
ch[i]='*';
else if(ch[i]=='c'||ch[i]=='C')
ch[i]='*';
else if(ch[i]=='d'||ch[i]=='D')
ch[i]='&';
else if(ch[i]=='E'||ch[i]=='e')
ch[i]='^';
else if(ch[i]=='f'||ch[i]=='F')
ch[i]='%';
else if(ch[i]=='G'||ch[i]=='g')
ch[i]='$';
else if(ch[i]=='h'||ch[i]=='H')
ch[i]='#';
else if(ch[i]=='i'||ch[i]=='I')
ch[i]='@';
else if(ch[i]=='j'||ch[i]=='J')
ch[i]='!';
else if(ch[i]=='k'||ch[i]=='K')
ch[i]=':';
else if(ch[i]=='L'||ch[i]=='l')
ch[i]='+';
else if(ch[i]=='m'||ch[i]=='M')
ch[i]='/';
else if(ch[i]=='n'||ch[i]=='N')
ch[i]='=';
else if(ch[i]=='o'||ch[i]=='O')
ch[i]=';';
else if(ch[i]=='p'||ch[i]=='P')
ch[i]='~';
else if(ch[i]=='q'||ch[i]=='Q')
ch[i]='`';
else if(ch[i]=='r'||ch[i]=='R')
ch[i]='"';
else if(ch[i]=='s'||ch[i]=='S')
ch[i]=',';
else if(ch[i]=='t'||ch[i]=='T')
ch[i]='.';
else if(ch[i]=='u'||ch[i]=='U')
ch[i]='?';
else if(ch[i]=='v'||ch[i]=='V')
ch[i]='>';
else if(ch[i]=='w'||ch[i]=='W')
ch[i]='<';
else if(ch[i]=='x'||ch[i]=='X')
ch[i]='{';
else if(ch[i]=='y'||ch[i]=='Y')
ch[i]='}';
else if(ch[i]=='z'||ch[i]=='Z')
ch[i]='[';
else if(ch[i]==' ')
ch[i]='_';
}
str1=str1.copyValueOf(ch);
t2.setText(str1);
}
if(e.getSource()==bt2){
f2.show(false);
f1.show();	
}
if(e.getSource()==b3){
f4.show();	
f1.show(false);	
}
if(e.getSource()==bt3){
str2=t3.getText();
ch1=str2.toCharArray();	
for(int i=0;i<ch1.length;i++){
if(ch1[i]=='!')
ch1[i]='A';
else if(ch1[i]=='(')
ch1[i]='B';
else if(ch1[i]=='*')
ch1[i]='C';
else if(ch1[i]=='&')
ch1[i]='D';
else if(ch1[i]=='^')
ch1[i]='E';
else if(ch1[i]=='%')
ch1[i]='f';
else if(ch1[i]=='$')
ch1[i]='G';
else if(ch1[i]=='#')
ch1[i]='H';
else if(ch1[i]=='@')
ch1[i]='I';
else if(ch1[i]=='!')
ch1[i]='J';
else if(ch1[i]==':')
ch1[i]='k';
else if(ch1[i]=='+')
ch1[i]='L';
else if(ch1[i]=='/')
ch1[i]='M';
else if(ch1[i]=='=')
ch1[i]='N';
else if(ch1[i]==';')
ch1[i]='O';
else if(ch1[i]=='~')
ch1[i]='P';
else if(ch1[i]=='`')
ch1[i]='Q';
else if(ch1[i]=='"')
ch1[i]='R';
else if(ch1[i]==',')
ch1[i]='S';
else if(ch1[i]=='.')
ch1[i]='T';
else if(ch1[i]=='?')
ch1[i]='U';
else if(ch1[i]=='>')
ch1[i]='V';
else if(ch1[i]=='<')
ch1[i]='W';
else if(ch1[i]=='{')
ch1[i]='X';
else if(ch1[i]=='}')
ch1[i]='Y';
else if(ch1[i]=='[')
ch1[i]='Z';
else if(ch1[i]=='_')
ch1[i]=' ';
}
str3=str3.copyValueOf(ch1);
t4.setText(str3);
}
if(e.getSource()==bt4){
f1.show();
f4.show(false);	}
if(e.getSource()==b4)
System.exit(0);	
}
}
class Project{
public static void main(String arg[]){
ED bt=new ED();	
}
}
