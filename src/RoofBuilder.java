public class RoofBuilder extends Builder{

    public RoofBuilder(){
        super(Steps.CREATE_ROOF);
    }

    @Override
    public void buildImpl() {
        System.out.println(" /\\\\ ");
        System.out.println("/  \\\\");

    }
}
