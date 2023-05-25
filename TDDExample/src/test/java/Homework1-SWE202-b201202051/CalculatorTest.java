import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    /**
    * STUDENT-ID : B201202051
     * NAME : SEYMA
     * SURNAME : ALTIPARMAK
     * COURSE NAME : SWE202
     * HOMEWORK NAME :
     * SWE202 SOFTWARE VERIFICATION AND VALIDATION
     * 2022-2023 SPRING SEMESTER
     * HOMEWORK 1
     * REPOSITORY NAME : B201202051-SoftwareVerificationAndValidation
     * REPOSITORY LINK : --> https://github.com/seyma-altiparmak/B201202051-SoftwareVerificationAndValidation
    * */

    
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /*******************************************************************
     * Our TEST DIVISIONS FIRST:
    @Test
    void testDivision1() {assertEquals(5, Calculator.divide(10, 2));}
    @Test
    void testDivision2() {assertEquals(2.5, Calculator.divide(10, 4));}
    @Test
    void testDivision3() {assertEquals(2.5, Calculator.divide(12.5, 5));}
    @Test
    void testDivision4() {assertEquals(4, Calculator.divide(10, 2.5));}
    @Test
    void testDivision5() {assertEquals(5, Calculator.divide(12.5, 2.5));}
     ***************************************************************************/

    @ParameterizedTest
    @CsvSource(value = {
            "10,2,5",
            "10,4,2.5",
            "12.5,5,2.5",
            "10,2.5,4",
            "12.5,2.5,5"})
    public void Parameterized_Test(float dividing,float divider,float expected){
        assertEquals(expected,Calculator.divide(dividing,divider));
    }
    /*for zero - throws exception*/
    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }
}