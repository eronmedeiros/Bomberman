package codes;

import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Character{

	private Rectangle rectangle;
	private ImageIcon goRight;
	private ImageIcon goLeft;
	private ImageIcon goUp;
	private ImageIcon goDown;
	/*
	private ImageIcon goRightStop;
	private ImageIcon goLeftStop;
	private ImageIcon goUpStop;
	private ImageIcon goDownStop;
	*/
	private JLabel jlabel;
	private int life = 1;
	ArrayList<Bomb> bombs;
	
	Character(int x, int y){
		bombs = new ArrayList<Bomb>();
		this.rectangle = new Rectangle(x, y, 50, 50);
		this.jlabel = new JLabel();
		this.jlabel.setBounds(rectangle);
		jlabel.setIcon(goDown);
	}
	
	
	//ainda preciso dos gifs goRight, goLeft, goUp e goDown
	//por enquanto, o bomberman ficar� sem movimento na imagem.
	public void setMoveImages(String stop, String goRight, String goLeft, String goUp, String goDown){
		this.goRight = new ImageIcon(getClass().getResource(goRight));
		this.goLeft = new ImageIcon(getClass().getResource(goLeft));
		this.goUp = new ImageIcon(getClass().getResource(goUp));
		this.goDown = new ImageIcon(getClass().getResource(goDown));
	}
	
	//esse m�todo substituir� "setMoveImages" quando os gifs estiverem prontos.
	public void setMoveImages2(String goRight, String goRightStop,
							   String goLeft, String goLeftStop,
							   String goUp, String goUpStop,
							   String goDown, String goDownStop){
		
		this.goRight = new ImageIcon(getClass().getResource(goRight));
		this.goLeft = new ImageIcon(getClass().getResource(goLeft));
		this.goUp = new ImageIcon(getClass().getResource(goUp));
		this.goDown = new ImageIcon(getClass().getResource(goDown));
		/*
		this.goRightStop = new ImageIcon(getClass().getResource(goRightStop));
		this.goLeftStop = new ImageIcon(getClass().getResource(goLeftStop));
		this.goUpStop = new ImageIcon(getClass().getResource(goUpStop));
		this.goDownStop = new ImageIcon(getClass().getResource(goDownStop));
		*/
	}
	
	public JLabel getJLabel(){
		return jlabel;
	}
	
	public void goRight(){
		this.jlabel.setIcon(goRight);
		this.rectangle.x+=50;
		this.jlabel.setBounds(rectangle);
	}
	
	public void goLeft(){
		this.jlabel.setIcon(goLeft);
		this.rectangle.x-=50;
		this.jlabel.setBounds(rectangle);
	}
	
	public void goUp(){
		this.jlabel.setIcon(goUp);
		this.rectangle.y-=50;
		this.jlabel.setBounds(rectangle);
	}
	
	public void goDown(){
		this.jlabel.setIcon(goDown);
		this.rectangle.y+=50;
		this.jlabel.setBounds(rectangle);
	}
	
	public void stopWalking(){
		//this.jlabel.setIcon(stop);
	}
	
	public Rectangle getRectangle(){
		return this.rectangle;
	}
	
	public void kill(){
		this.life--;
	}
	
	public boolean isAlive(){
		if(this.life >= 1)
			return true;
		return false;
	}
}