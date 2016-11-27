package labproject;

public class Mouse extends Mammals {
    Mouse()
    {
        name= 'M';
        this.setPost(20,20);
        this.setLifeLimit(10);
        
        super.moveStep = 3;
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'F'|| e.getName() == 'H'){
			
			return true;
		}else {
		return false;
	
		}
	}
} 
