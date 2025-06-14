package Character;

public class Wild_Boar extends Monster {
	public Wild_Boar() {
		name = "멧돼지";
		hp = 1500;
		mp = 0;
		level = 10;
		power = 130;
		defense = 40;
		money = 50;
		experience = 90;
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
