package calmacalabreso;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Calma_calabreso - a robot by (Kanna e Kaleu)
 */
public class Calma_calabreso extends AdvancedRobot {
	/**
	 * run: Calma_calabreso's default behavior
	 */
	public void run() {
		//mudando as cores do calma calabreso
		setBodyColor(Color.black); //cor do corpo (ou lataria)
		setRadarColor(Color.red);  //cor do radar
		setGunColor(Color.black);  //cor da arma
		setBulletColor(Color.magenta); //cor da bala
		
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
