package ai0604.ingeritance;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30,50);
        hr1.moveRightTen();
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("아주좋은");

        MountainRabbit mr2 = new MountainRabbit();
        mr2.shape = "세모";
        mr2.moveLeftTen();
        mr2.moveLeftTen();
        mr2.printInfo();
        mr2.MountainName = "남산";
        mr2.eatGrass("클로버");
    }
}
