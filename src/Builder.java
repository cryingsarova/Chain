public abstract class Builder {

    protected Builder nextBuilder;
    private final Steps step;

    public Builder(Steps step) {
        this.step = step;
    }

    public abstract void buildImpl();

    public void build(HouseProject houseProject){
        if(houseProject.getSteps().contains(step)){
            buildImpl();
        }
        if (nextBuilder != null){
            nextBuilder.build(houseProject);
        }
    }

    public Builder setNext(Builder builder){
        nextBuilder = builder;
        return this;
    }



}
