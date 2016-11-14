package lab;


public class Grid {
	
public static void main(String [ ] args){
	    AnimalKingdom animal = new AnimalKingdom();
	    Grid grid = new Grid();
            grid.clearGrid();
	    grid.displayGrid();
		
	}
	
	public static final int gCol = 30;
	public static final int gRow = 30;
	
	private char[][] the_Grid = new char[gCol][gRow];
	
	
       public void clearGrid(){
    	   
    	   char d = '.';
			
			for ( int i = 0; i < gRow; i++)
			{
				for (int j = 0; j < gCol; j++)
				{
					
					the_Grid[i][j] = d;
				}
			}
			
		}
		
		public void displayGrid(){
			
	        for ( int j = 0; j < gCol; j++)
		{
			System.out.print('-');
		}
			
		System.out.println();

		for ( int i = 0; i < gRow; i++)
		{
			for ( int j = 0; j < gCol; j++)
			{
				System.out.print(the_Grid[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < gCol; j++)
		{
			System.out.print('-');
		}
		System.out.println();
		
		}
		
		
		public void addAnimal(int animal_row_pos, int animal_col_pos, char animal_letter){
			assert(animal_row_pos >= 0);
			assert(animal_row_pos < gRow);
			assert(animal_col_pos >= 0);
			assert(animal_col_pos < gCol);
			the_Grid[animal_row_pos][animal_col_pos] = animal_letter;
		}
		
		
		
		
		static boolean isValidPositionForCanvas(
			int row_pos1, int col_pos1){
			
			return (row_pos1 >= 0) && (col_pos1 >= 0) &&
			       (row_pos1 < gRow) && (col_pos1 < gCol);
			
		}
	

		static boolean isValidRideForCanvas( int row_pos1, int col_pos1, 
						     int row_size1, int col_size1){
			
			return (row_pos1 >= 0) && (col_pos1 >= 0) &&
			       (row_size1 >= 0) && (col_size1 >= 0) &&
			       (row_pos1 + row_size1 - 1 < gRow) &&
			       (col_pos1 + col_size1 - 1 < gCol);
		}
		
		

}
