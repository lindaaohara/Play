import com.play.area.FixTariqSolution;
import com.play.area.SimplerAreaSolution;
import com.play.area.TariqSquareProblem;
import org.junit.Assert;
import org.junit.Test;

public class TestAreaOfRectangle {

    @Test
    public void AreaTest1(){
        String[] strArr = {"(1 1)", "(1 3)", "(3 1)", "(3 3)"};

        String expected = "4";
        //String actual = TariqSquareProblem.RectangleArea(strArr);
        //String actual = SimplerAreaSolution.RectangleArea(strArr);
        String actual = FixTariqSolution.RectangleArea(strArr);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void AreaTest2(){
        String[] strArr = {"(-2 -1)", "(-4 -1)", "(-2 -4)", "(-4 -4)"};

        String expected = "6";
        //String actual = TariqSquareProblem.RectangleArea(strArr);
        //String actual = SimplerAreaSolution.RectangleArea(strArr);
        String actual = FixTariqSolution.RectangleArea(strArr);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void AreaTest3(){
        String[] strArr = {"(-1 2)", "(2 2)", "(-1 -2)", "(2 -2)"};

        String expected = "12";
        //String actual = TariqSquareProblem.RectangleArea(strArr);
        //String actual = SimplerAreaSolution.RectangleArea(strArr);
        String actual = FixTariqSolution.RectangleArea(strArr);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void AreaTest4(){
        String[] strArr = {"(0 0)", "(2 0)", "(2 -2)", "(0 -2)"};

        String expected = "4";
        //String actual = TariqSquareProblem.RectangleArea(strArr);
       //String actual = SimplerAreaSolution.RectangleArea(strArr);
        String actual = FixTariqSolution.RectangleArea(strArr);
        Assert.assertEquals(expected, actual);

    }
}
