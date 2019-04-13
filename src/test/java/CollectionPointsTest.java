import com.noideateam.braincode_noideateam.CollectionPoint;
import com.noideateam.braincode_noideateam.CollectionPoints;
import org.junit.Test;

import java.util.Map;

public class CollectionPointsTest {

    @Test
    public void collectionPointsInRange() {
        Map<CollectionPoint, Double> result= CollectionPoints.collectionPointsInRange(21.98131561279297, 51.41465759277344, 10);
        System.out.println("result = " + result);
    }
}