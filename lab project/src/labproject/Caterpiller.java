package labproject;

public class Caterpiller extends Herbivores {



	public Caterpiller() {
		name = 'C';
		setPost(12, 31);
		 super.moveStep = 3;
	}


<<<<<<< HEAD

	@Override
	public char getName() {
		
=======
    public Caterpiller()
    {
        name='C';
        setPost(12,31);
    }
    
    public void move()
    {
        this.setPost(this.getPostX()+1,this.getPostY()-1);
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285
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
