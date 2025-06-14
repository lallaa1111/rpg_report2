package Character;

public class Lynx extends Monster {
	public Lynx() {
		name = "살쾡이";
		hp = 500;
		mp = 0;
		level = 5;
		power = 70;
		defense = 20;
		money = 30;
		experience = 50;
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
