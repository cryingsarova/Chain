public class BaseBuilder extends Builder {

    public BaseBuilder() {
        super(Steps.CREATE_BASEMENT);
    }

    @Override
    public void buildImpl() {
        System.out.println("######");
    }
}
