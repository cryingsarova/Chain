import com.sun.media.jfxmedia.events.BufferListener;

public class Client {

    public static void main(String[] args) {
        FloorBuilder floorBuilder = new FloorBuilder();
        RoofBuilder roofBuilder = new RoofBuilder();
        BaseBuilder baseBuilder = new BaseBuilder();
        Builder lastBuilder = roofBuilder.setNext(floorBuilder.setNext(baseBuilder));

        HouseProject houseProject = new HouseProject(Steps.CREATE_ROOF, Steps.ADD_FLOOR, Steps.CREATE_BASEMENT);
        lastBuilder.build(houseProject);
    }
}
