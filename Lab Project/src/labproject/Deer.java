package labproject;

public class Deer extends Mammals{
        Deer()
        {
        name= 'D';
        this.setPos(10,1,name);
        this.setLifeLimit(20);
        }

		@Override
		public char getName() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean canBeAteBy(Eatable e) {
			
			if (e.getName() == 'W') {
			return true;
		}
		
		
		return false;
		}
}
