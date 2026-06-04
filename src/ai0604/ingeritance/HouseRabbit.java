package ai0604.ingeritance;

//상속은 자원(필드와 메소드)를 확장해서 사용하는 것을 의미합니다.
public class HouseRabbit extends Rabbit{
    //주인이름
    String masterName;

    //사로먹기
    public void eatFeed(String feedName){
        System.out.println("집토끼가 " + masterName +"주인이 주는 "+feedName+"사료를 먹는다");

    }

    // 메소드 재정의: super 클래스에 정의된 메소드를 sub 클래스에 다시 정의하는것
    //울타리 x좌표가 0을 벗어나지 않고 10씩 감소하게
    @Override
    public void moveLeftTen() {
        if (xPos >= 10)
            super.moveLeftTen();

    }
    //울타리 x 좌표가 500을 벗어나지 않고 10씩 증가하게
    @Override
    public void moveRightTen() {
        super.moveRightTen();
        if(xPos<=490)
            super.moveRightTen();
    }
}


