public class TestEnum {
    public void judge(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("afjl");
                break;
            case SUMMER:
                System.out.println("afjadfal");
                break;
            case FALL:
                System.out.println("afewgjl");
                break;
            case WINTER:
                System.out.println("afadfjl");
                break;
        }

    }

    public static void main(String[] args) {
        for (SeasonEnum s :SeasonEnum.values())
        {
            System.out.println(s.name());

        }
        new TestEnum().judge(SeasonEnum.SPRING);
    }
}
