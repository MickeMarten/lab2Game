package creature;

 public class Creature {
int hitpoints;
int strength;
int movement;
int posistionX;
int posistionY;

    public Creature(){
       this.hitpoints = 10;
       this.strength = 5;
       this.movement = 5;
       this.posistionX = 5;
       this.posistionY= 5;
    }

    public int getPosistionX(){
       return posistionX;
    }

    public int getPosistionY(){
       return posistionY;
    }

    public int setPosistionX(int newPosistion){
      return this.posistionX = newPosistion;
    };

    public int setPosistionY(int newPosistion){
        return this.posistionY = newPosistion;
    }

     public void setStartPosition(int x, int y){
         this.setPosistionX(x);
         this.setPosistionY(y);
     }


}