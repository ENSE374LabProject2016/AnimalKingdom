package labproject;

public class Fox extends Mammals{
    public Fox()
        {
        name= 'F';
        this.setPos(10,30,'F');
        this.setLifeLimit(20);
        }

	@Override
	public char getName() {
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'R'||e.getName() == 'D'||e.getName() == 'B'||e.getName() == 'G'||e.getName() == 'H'||
		    e.getName() == 'M'||e.getName() == 'W'||e.getName() == 'S'||e.getName() == 'T') {
			return false;
		} 

		return false;
	}
    

}
