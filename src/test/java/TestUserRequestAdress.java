import com.noideateam.braincode_noideateam.UserRequestAdress;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRequestAdress {
    @Test
    public void testCreateUser() {
        UserRequestAdress user = new UserRequestAdress("Makapaka", "Grunwaldzka 182", "Poznań", "60-309");

        Assert.assertEquals("Makapaka", user.getLogin());
        Assert.assertEquals("Grunwaldzka 182", user.getStreet());
        Assert.assertEquals("60-309", user.getZip());
        Assert.assertEquals("Poznań", user.getCity());
    }
}
