package labproject; 

abstract public class Insects extends Herbivores {

    public Grasshopper()
    {
        name='P';
    }
    
    public void move()
    {
        this.setPos(this.getPostX()+1,this.getPostY()+1,'P');
    }
}
