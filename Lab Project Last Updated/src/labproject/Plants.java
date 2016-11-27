package labproject;

abstract public class Plants extends AnimalKingdom {
	Plants() {

		this.setLifeLimit(50);
	}
	// public void move()
	// {
	// this.setPost(getPostX(),getPostY());
	// }

	@Override
	public boolean isTimeToMove() {
		return false;
	}

}
