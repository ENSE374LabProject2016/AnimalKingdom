package labproject; 

abstract public class Insects extends Herbivores {

    public Insects()
    {
        name='I';
    }
    
    public void move()
    {
        this.setPos(this.getPosX()+1,this.getPosY()+1,'I');
    }
}
