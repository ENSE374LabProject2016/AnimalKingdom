package labproject; 

 public class Grasshopper extends Herbivores {

    public Grasshopper()
    {
        name='P';
    }
    
    public void move()
    {
        this.setPost(this.getPostX()+1,this.getPostY()+1);
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		// TODO Auto-generated method stub
		return false;
	}
}
