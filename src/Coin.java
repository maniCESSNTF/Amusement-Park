public class Coin {
    private int color;//1==>black//2==>white//3==>blue//4==>red//5==>green//6==>gold
    private int owner;// 3==>have not owner // 2==>player 2 // 1==>player 1
    private int x,y;
    public void setOwner(int owner) {
        this.owner = owner;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getOwner() {
        return owner;
    }
    public int getColor() {
        return color;
    }
    //,int X,int Y
    public Coin(int owner,int color){
        //   setX(X);
        //   setY(Y);
        setColor(color);
        setOwner(owner);
    }
}
