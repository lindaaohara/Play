
import com.play.area.EugeneSquareSolution;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestAreaByParameterizedTest {

    @ParameterizedTest(name = "Coordinates= {0}")
    @MethodSource("arrayAndStringProvider")
    public void AreaTests(String[]coordinates, String expected){
    String actual = EugeneSquareSolution.getAreaTwo(coordinates);
    Assert.assertEquals(expected, actual);
}
   static Stream<Arguments> arrayAndStringProvider(){
        return Stream.of(
            Arguments.of(new String[] {"(1 1)", "(1 3)", "(3 1)", "(3 3)"}, "4"),
            Arguments.of(new String[] {"(-2 -1)", "(-4 -1)", "(-2 -4)", "(-4 -4)"}, "6"),
            Arguments.of(new String[] {"(-1 2)", "(2 2)", "(-1 -2)", "(2 -2)"} , "12") ,
            Arguments.of(new String[] {"(0 0)", "(2 0)", "(2 -2)", "(0 -2)"}, "4")
       );
    }
    @ParameterizedTest(name = "Coordinates= {0}")
    @MethodSource("arrayAndStringProvider")
    public void AreaTests2(String[]coordinates, String expected){
        String actual = EugeneSquareSolution.getArea(coordinates);
        Assert.assertEquals(expected, actual);
    }
}
