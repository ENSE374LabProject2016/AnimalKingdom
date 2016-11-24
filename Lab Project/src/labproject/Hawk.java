package labproject;

public class Hawk extends Birds {
    public Hawk()
        {
        name= 'H';
        this.setPos(5,10,'H');
        this.setLifeLimit(30);
        }

	@Override
	public char getName() {
		
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		
		if (e.getName() == 'R'||e.getName() == 'D'||e.getName() == 'B'||e.getName() == 'G'||e.getName() == 'F'||
		    e.getName() == 'M'||e.getName() == 'W'||e.getName() == 'S'||e.getName() == 'T') {
			return false;
		} 
		return false;
	}

}
