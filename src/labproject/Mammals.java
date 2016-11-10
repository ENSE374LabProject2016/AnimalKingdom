package labproject;

abstract public class Mammals extends Omnivores {
    public void move()
    {
        this.setPos(this.getPosX()+3,this.getPosY()+3);
    }

}
 
