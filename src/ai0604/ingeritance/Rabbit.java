package ai0604.ingeritance;

public class Rabbit {
    // super 클래스의 필드 또는 메소드 앞에 private를 붙이면 자식클래스 서브클래스에서 사용이 제한된다
    String shape;// 토끼의 모양
     int xPos;// x위치
     int yPos;// y위치

    //jvm은 클래스 내에 생성사가 하나도 없는 경우 기본생성자를 만들어서 사용한다
    // 그러나 클래스 내에 생성자가 선언 되어 있다면 선언된 생성자만  사용할수있다
    public Rabbit(){
    }

    public Rabbit(String shape){
        this.shape =shape;
    }


    //토까의 좌표
    public void setLocation(int xPos, int yPos){
        this.yPos = yPos;
        this.xPos = xPos;
    }
    //토끼의 모양,위치  출력 메소드
    public void printInfo() {
        System.out.printf("%s 모양의 토끼는 (%d,%d) 좌표에 위치하고 있다.\n", shape, xPos, yPos);
    }
        //x축으로 10씩 오른쪽으로 이동하는 메소드
        public void moveRightTen(){
            xPos += 10;
        }

        //y축으로 10씩 왼쪽으로 이동하는 메소드
        public void moveLeftTen(){
            yPos -= 10;
        }


    }







