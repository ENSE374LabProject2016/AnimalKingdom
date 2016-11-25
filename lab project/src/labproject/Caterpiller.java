package labproject; 

 public class Caterpiller extends Herbivores {

    public Caterpiller()
    {
        name='C';
    }
    
    public void move()
    {
        this.setPos(this.getPostX()+1,this.getPostY()+1,'P');
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
