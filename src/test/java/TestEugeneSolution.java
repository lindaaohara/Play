import com.play.area.EugeneSquareSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestEugeneSolution {

        @Test
        public void AreaTest1() {
            String[] coordinates = {"(1 1)", "(1 3)", "(3 1)", "(3 3)"};

            String expected = "4";

           // String actual = EugeneSquareSolution.getAreaTwo(coordinates);
            String actual = EugeneSquareSolution.getArea(coordinates);

            Assert.assertEquals(expected, actual);

        }

        @Test
        public void AreaTest2() {
            String[] coordinates = {"(-2 -1)", "(-4 -1)", "(-2 -4)", "(-4 -4)"};

            String expected = "6";
            //String actual = EugeneSquareSolution.getAreaTwo(coordinates);
            String actual = EugeneSquareSolution.getArea(coordinates);
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void AreaTest3() {
            String[] coordinates = {"(-1 2)", "(2 2)", "(-1 -2)", "(2 -2)"};

            String expected = "12";
           // String actual = EugeneSquareSolution.getAreaTwo(coordinates);
            String actual = EugeneSquareSolution.getArea(coordinates);
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void AreaTest4() {
            String[] coordinates = {"(0 0)", "(2 0)", "(2 -2)", "(0 -2)"};

            String expected = "4";
           // String actual = EugeneSquareSolution.getAreaTwo(coordinates);
            String actual = EugeneSquareSolution.getArea(coordinates);
            Assert.assertEquals(expected, actual);

        }

}
