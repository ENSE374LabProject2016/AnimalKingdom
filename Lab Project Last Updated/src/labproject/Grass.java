package labproject;

public class Grass extends Plants {

    public Grass()
        {
        name= 'G';
        this.setPost(1,15);
        this.setLifeLimit(40);
        this.age=0;
        }

	@Override
	public char getName() {
		
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'P'||e.getName() == 'R'||e.getName() == 'M'||e.getName() == 'D'){
			
			return true;
		} else {
		return false;
	}
		
	}

}
