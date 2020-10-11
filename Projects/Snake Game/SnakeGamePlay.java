import java.util.Random;    //Do not import whole package, an error is occured that Timer
import java.awt.*;           //class in javax.swing and java.util are matching therefore  
import java.awt.event.*;     //do not import whole java.util*/
import javax.swing.*;

public class SnakeGamePlay extends JPanel implements KeyListener,ActionListener{
	private int extra = 0;
	private int score = 0;
	
	private int []snakexLength = new int[750];
	private int []snakeyLength = new int[750];
	private int lengthOfSnake = 3; //default length
	
	private int []enemyxPosition = {25,50,75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,
									475,500,525,550,575,600,625,650,675,700,725,750,775,800,825,850};
	private int []enemyyPosition = {75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,
									475,500,525,550,575,600,625};
	
	private ImageIcon enemyImage;
	private Random random = new Random();
	private int xPosition = random.nextInt(enemyxPosition.length); 
	private int yPosition = random.nextInt(enemyyPosition.length);
	
	private int moves = 0; //for default position of snake
	
	private boolean left = false;
	private boolean right = false;
	private boolean up= false;
	private boolean down = false;
	
	private ImageIcon rightMouth;
	private ImageIcon leftMouth;
	private ImageIcon upMouth;
	private ImageIcon downMouth;
	private ImageIcon titleImage;
	private ImageIcon snakeImage;
	
	private Timer timer;
	private int delay = 100;
	
	
	//Constructor
	public SnakeGamePlay() {
		
		addKeyListener(this); //this representing the object of GamePlay Class
		setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay,this);
		timer.start();
	}
    
    //overrided method
	public void paint(Graphics g) {
		
		if(moves == 0) {
			//this code will only run ones when the game has just started
			snakexLength[2] = 50; //position from left
			snakexLength[1] = 75; // position from left
			snakexLength[0] = 100; //position from left
			
			snakeyLength[2] = 100; //position from top
			snakeyLength[1] = 100; // position from top
			snakeyLength[0] = 100; //position from top
			
		}
		
		//draw title image border
		g.setColor(Color.white);
		g.drawRect(24, 10, 851, 55);
		
		//draw the title image
		titleImage = new ImageIcon("./images/snaketitle.jpg");
		titleImage.paintIcon(this, g, 25, 11);
		
		//draw border for gameplay
		g.setColor(Color.white);
		g.drawRect(24, 74, 851, 626);
		
		//draw background for the gameplay
		g.setColor(Color.black);
		g.fillRect(25, 75, 850, 625);
		
		//draw the score
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.PLAIN,14));
		g.drawString("Score: "+score,780,30);
		
		//draw the length
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.PLAIN,14));
		g.drawString("Length: "+lengthOfSnake,780,50);
		
		//drawing snake but we will have no movement 
		rightMouth = new ImageIcon("./images/rightmouth.png");
		rightMouth.paintIcon(this, g, snakexLength[0], snakeyLength[0]);
		
		for(int i=0;i<lengthOfSnake;i++) {
			
			//face position of snake
			if(i==0 && right) {
				rightMouth = new ImageIcon("./images/rightmouth.png");
				rightMouth.paintIcon(this, g, snakexLength[0], snakeyLength[0]);
			}
			if(i==0 && left) {
				leftMouth = new ImageIcon("./images/leftmouth.png");
				leftMouth.paintIcon(this, g, snakexLength[0], snakeyLength[0]);
			}
			if(i==0 && up) {
				upMouth = new ImageIcon("./images/upmouth.png");
				upMouth.paintIcon(this, g, snakexLength[0], snakeyLength[0]);
			}
			if(i==0 && down) {
				downMouth = new ImageIcon("./images/downmouth.png");
				downMouth.paintIcon(this, g, snakexLength[0], snakeyLength[0]);
			}
			
			//i=0 means talikng about snake head and not equals to zero means talking about snake body
			if(i!=0) { 
				snakeImage = new ImageIcon("./images/snakeimage.png");
				snakeImage.paintIcon(this, g, snakexLength[i], snakeyLength[i]);
			}
			
		}
		
		enemyImage = new ImageIcon("./images/enemy.png");
		enemyImage.paintIcon(this, g, enemyxPosition[xPosition], enemyyPosition[yPosition]);
		
		//enemy head collision with enemy
		if(enemyxPosition[xPosition]==snakexLength[0] && enemyyPosition[yPosition]==snakeyLength[0]) {
			//enemy head collision with enemy
			lengthOfSnake++;
			score++;
			xPosition = random.nextInt(enemyxPosition.length); //for next pickup
			yPosition = random.nextInt(enemyyPosition.length);
		}
		
		//gameover collision of snake with itself
		for(int i=1;i<lengthOfSnake;i++) {
			if(snakexLength[i]==snakexLength[0] && snakeyLength[i]==snakeyLength[0]) {
				//gameover collision of snake with itself
				right = false;
				left = false;
				up = false;
				down = false;
				moves = 0;
				lengthOfSnake = 3;
				score = 0;
				
				
				//showing of game over messagege
				g.setColor(Color.RED);
				g.setFont(new Font("arial",Font.BOLD,50));
				g.drawString("Game Over",300,300);
				
				//showing the message of restart
				g.setFont(new Font("arial",Font.BOLD,20));
				g.drawString("Press Space To Restart",320,340);
				extra++;
			}
		}
		
		g.dispose();
	}

	
	public void actionPerformed(ActionEvent e) { // this method automatically called when timer starts
		
	if(extra==0) {	
		timer.start();
		
		//movement of snake towards right side
		if(right) {
			for(int r = lengthOfSnake-1;r>=0;r--) {
				snakeyLength[r+1] = snakeyLength[r];
			}
			for(int r = lengthOfSnake;r>=0;r--) {
				if(r==0) {
					snakexLength[r] = snakexLength[r] + 25;
					
				}
				else {
					snakexLength[r] = snakexLength[r-1];
				}
				
				if(snakexLength[r]>850) {
					snakexLength[r] = 25;
				}
			}
			repaint();
		}
		
		//movement of snake towards left side
		if(left) {
			for(int r = lengthOfSnake-1;r>=0;r--) {
				snakeyLength[r+1] = snakeyLength[r];
			}
			for(int r = lengthOfSnake;r>=0;r--) {
				if(r==0) {
					snakexLength[r] = snakexLength[r] - 25;
					
				}
				else {
					snakexLength[r] = snakexLength[r-1];
				}
				
				if(snakexLength[r]<25) {
					snakexLength[r] = 850;
				}
			}
			repaint();
		}
		
		//movement of snake towards up side
		if(down) {
			for(int r = lengthOfSnake-1;r>=0;r--) {
				snakexLength[r+1] = snakexLength[r];
			}
			for(int r = lengthOfSnake;r>=0;r--) {
				if(r==0) {
					snakeyLength[r] = snakeyLength[r] + 25;
					
				}
				else {
					snakeyLength[r] = snakeyLength[r-1];
				}
				
				if(snakeyLength[r]>675) {
					snakeyLength[r] = 75;
				}
			}
			repaint();
		}
		
		//movement of snake towards down side
		if(up) {
			for(int r = lengthOfSnake-1;r>=0;r--) {
				snakexLength[r+1] = snakexLength[r];
			}
			for(int r = lengthOfSnake;r>=0;r--) {
				if(r==0) {
					snakeyLength[r] = snakeyLength[r] - 25;
					
				}
				else {
					snakeyLength[r] = snakeyLength[r-1];
				}
				
				if(snakeyLength[r]<75) {
					snakeyLength[r] = 675;
				}
			}
			repaint();
		}
	  } //end of extra	
	}

	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			left = false;
			right = false;
			up = false ; 
			down = false;
			moves = 0;
			score = 0;
			lengthOfSnake = 3;
			extra=0;
			repaint();
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			moves++; //means snake moved from original position 
			right = true;
			if(!left) {
				right = true ;
			}
			else {
				right = false;
				left = true;
			}
			up = false;
			down = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			moves++; //means snake moved from original position 
			left = true;
			if(!right) {
				left = true ;
			}
			else {
				left = false;
				right = true;
			}
			up = false;
			down = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			moves++; //means snake moved from original position 
			up = true;
			if(!down) {
				up = true ;
			}
			else {
				up = false;
				down = true;
			}
			left = false;
			right = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			moves++; //means snake moved from original position 
			down = true;
			if(!up) {
				down = true ;
			}
			else {
				down = false;
				up = true;
			}
			left = false;
			right = false;
		}
		
	}

	//Override to avoid error
	public void keyReleased(KeyEvent e) {}
	//Override to avoid error
	public void keyTyped(KeyEvent arg0) {}
}