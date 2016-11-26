package labproject;

public class Squirrel extends Mammals{
    Squirrel()
    {
         name= 'S';
        this.setPost(20,5);
        this.setLifeLimit(20);
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		
		if (e.getName() == 'D'||e.getName() == 'B'||e.getName() == 'M'||
				e.getName() == 'G'||e.getName() == 'H'||e.getName() == 'W'||
			    e.getName() == 'R'||e.getName() == 'T'||
			    e.getName() == 'C'||e.getName() == 'P') {
			return false;
		} 
		
		if(e.getName() == 'F' ||e.getName() == 'H'){
			
			return true;
		}
		return false;
	}
} 
