import com.play.area.InsertDashes;
import org.junit.Assert;
import org.junit.Test;

public class TestInsertDashes {

    @Test
    public void insertedDashesTest1(){
        String str = "9933444";

        String expected = "9-9-3-3444";
        String actual = InsertDashes.insertedDashes(str);

        Assert.assertEquals(expected,actual);


    }
    @Test
    public void insertedDashesTest2(){
        String str = "24682468";

        String expected = "24682468";
        String actual = InsertDashes.insertedDashes(str);

        Assert.assertEquals(expected,actual);


    }
}
