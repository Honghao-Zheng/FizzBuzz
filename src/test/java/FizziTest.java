import com.sparta.FizziBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class FizziTest {
    @Test
    @DisplayName("given one return one as String")
    public void givenOne_Return_oneAsString() {
        assertEquals("1", FizziBuzz.find(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "4,4"})
    @DisplayName("Given a number, return it as a string")
    public void givenANnumber_returnString(int input, String expected) {
        assertEquals(expected, FizziBuzz.find(input));
    }

    @Test
    @DisplayName("given three return Fizz as String")
    public void givenThree_Return_Fizz() {
        assertEquals("Fizz", FizziBuzz.find(3));
    }
    @ParameterizedTest
    @ValueSource(ints = {6, 9, 12})
    @DisplayName("given 6,8,12 return Fizz as String")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input){
        assertEquals("Fizz", FizziBuzz.find(input));
    }

    @Test
    @DisplayName("given five return Buzz as String")
    public void givenFive_Return_Buzz() {
        assertEquals("Buzz", FizziBuzz.find(5));
    }
    @ParameterizedTest
    @ValueSource(ints = {10, 20, 25})
    @DisplayName("given 10,20,25 return Buzz as String")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input){
        assertEquals("Buzz", FizziBuzz.find(input));
    }
    @Test
    @DisplayName("given 15 return FizzBuzz as String")
    public void givenFifteen_Return_FizzBuzz(){
        assertEquals("FizzBuzz", FizziBuzz.find(15));
    }
    @ParameterizedTest
    @ValueSource(ints = {30,45,60 })
    @DisplayName("given 30,45,60 return FizzBuzz as String")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input){
        assertEquals("FizzBuzz", FizziBuzz.find(input));
    }




}
