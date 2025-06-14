package Character;

public class Raccoon extends Monster {
	public Raccoon() {
		name = "너구리";
		hp = 100;
		mp = 0;
		level = 1;
		power = 20;
		defense = 5;
		money = 10;
		experience = 10;
	}

	@Override
	public int attack() {
		return super.attack();
	}

	@Override
	public void attacked(int sum) {
		super.attacked(sum);
	}
}
