package labproject;

public class Caterpiller extends Herbivores {



	public Caterpiller() {
		name = 'C';
		setPost(12, 31);
		 super.moveStep = 3;
	}



	@Override
	public char getName() {
		
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		
		if (e.getName() == 'B'){
			
			return true;
		} else {
			
			return false;
		}
		
		
	}

}
