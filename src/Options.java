package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Options {

	public Rectangle backButton = new Rectangle(1200, 50, 70, 30);  // x pos, y pos, length, width
	
	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Options", 440, 100);
		
		Font fnt1 = new Font("arial", Font.BOLD, 20);
		g.setFont(fnt1);
		g.drawString("Pause", backButton.x + 5, backButton.y + 25);
		g2d.draw(backButton);
		
	}
}
