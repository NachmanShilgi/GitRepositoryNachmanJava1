package b;

public class car {

	// 0 - 90
	private int speed;

	// add get and set speed

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newspeed) {
		if (newspeed >= 0 && newspeed <= 90) {
			speed = newspeed;
		}

	}
}

