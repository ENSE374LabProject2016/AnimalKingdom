package labproject; 

 public class Grasshopper extends Herbivores {

    public Grasshopper()
    {
        name='P';
        
        super.moveStep = 4;
    }
    
//    public void move()
//    {
//        this.setPost(this.getPostX()+1,this.getPostY()+1);
//    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if ( e.getName() == 'B'){
			
			return true;
		} else {
			
			return false;
		}
	
	}

}
