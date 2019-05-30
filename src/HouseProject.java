import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HouseProject {

    private final Set steps = new HashSet();

    public HouseProject(Steps... steps){
        this.steps.addAll(Arrays.asList(steps));
    }

    public Set getSteps(){
        return steps;
    }

}
