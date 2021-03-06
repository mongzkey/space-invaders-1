package entities;

import org.newdawn.slick.Graphics;

import managers.TextureManager;
import states.GameState;

public class Laser1 extends Laser {
	
	public Laser1(float x, float y) {
		super(x, y);
		laserTex = GameState.texMan.getTexture(TextureManager.INVADER_LASER);
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(laserTex, this.x, this.y);
	}

	@Override
	public void update(int delta) {
		super.update(delta);
	}

}
