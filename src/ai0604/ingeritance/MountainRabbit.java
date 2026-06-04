package ai0604.ingeritance;

public class MountainRabbit extends  Rabbit {
    //산이름
    String MountainName;

    //사로먹기
    public void eatGrass(String feedName) {
        System.out.println(MountainName + "에서 산토끼가  " + feedName + "풀을 먹는다");
    }
}