package Rabbit;

public class Rabbit {
    String shape;// 토끼의 모양
    int xPos;// x위치
    int yPos;// y위치

    public Rabbit(){
    }

    public Rabbit(String shape){
        this.shape =shape;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}







