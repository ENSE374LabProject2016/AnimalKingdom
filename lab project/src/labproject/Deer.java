package labproject;

public class Deer extends Mammals{
        Deer()
        {
        name= 'D';
        this.setPost(10,1);
        this.setLifeLimit(20);
        }


		@Override
		public boolean canBeAteBy(Eatable e) {
			
			if (e.getName() == 'W') {
			return true;
		}
		
		
			return false;
		}
	
	        @Override
		public char getName() {
			return name;
}

}