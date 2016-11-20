package labproject;

public class Wolf extends Mammals {
	Wolf() {
		name = 'W';
		this.setPos(20, 50);
		this.setLifeLimit(40);
	}

	@Override
	public boolean canBeAteBy(Eatable e) {

		if (e.getName() == 'R') {
			return false;
		}

		return false;
	}

	@Override
	public char getName() {
		return name;
	}

}
