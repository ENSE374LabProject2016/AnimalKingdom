package labproject; 

abstract public class Insects extends Herbivores {

    public Insects()
    {
        name='I';
    }
    
    public void move()
    {
        this.setPos(this.getPostX()+1,this.getPostY()+1,'I');
    }
}
