package labproject; 

abstract public class Insects extends Herbivores {

    public Insects()
    {
        
    }
    
    public void move()
    {
        this.setPos(this.getPosX()+1,this.getPosY()+1);
    }
}
