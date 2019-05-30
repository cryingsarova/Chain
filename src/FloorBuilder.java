public class FloorBuilder extends Builder {

    public FloorBuilder(){
        super(Steps.ADD_FLOOR);
    }

    @Override
    public void buildImpl() {
        System.out.println("-----");
        System.out.println("|   ||");
        System.out.println("|   ||");
    }
}
