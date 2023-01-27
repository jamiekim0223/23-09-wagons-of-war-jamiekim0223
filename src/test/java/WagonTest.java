import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WagonTest {


    @BeforeAll
    static void setUp () {

    }



    private static Stream<Arguments> providedNumbers_testInitialTrips() {
        return Stream.of(
                Arguments.of(9000,3000,2000,2000,true),
                Arguments.of(1000,4000,3000,5000,false),
                Arguments.of(250,1000,500,100,false),
                Arguments.of(4000,3000,4000,4000, true),
                Arguments.of(2500,2500,2500,2500,true)
        );
    }

    @DisplayName("Testing need to change oxen right from the start")
    @ParameterizedTest
    @MethodSource ("providedNumbers_testInitialTrips")
    void checking_initial_oxen_status (int start, int oxen, int leg1, int leg2, boolean need) {
        Wagon w = new Wagon(start, oxen);
        assertEquals(need, w.timeForOxenChange());
    }

    private static Stream<Arguments> providedNumbers_testingAfterOneLeg() {
        return Stream.of(
                Arguments.of(9000,3000,2000,2000,false),
                Arguments.of(1000,4000,3000,5000,true),
                Arguments.of(250,1000,500,100,false),
                Arguments.of(4000,3000,4000,4000, true),
                Arguments.of(2500,2500,2500,2500,true)
        );
    }

    @DisplayName("Testing need to change oxen after one leg of the trip")
    @ParameterizedTest
    @MethodSource ("providedNumbers_testingAfterOneLeg")
    void checking_after_one_leg_of_trip (int start, int oxen, int leg1, int leg2, boolean need) {
        Wagon w = new Wagon(start, oxen);
        w.timeForOxenChange();
        w.addMiles(leg1);
        assertEquals(need, w.timeForOxenChange());
    }

    private static Stream<Arguments> providedNumbers_testingAfterTwoLegs() {
        return Stream.of(
                Arguments.of(9000,3000,2000,2000,true),
                Arguments.of(1000,4000,3000,5000,true),
                Arguments.of(250,1000,500,100,false),
                Arguments.of(4000,3000,4000,4000, true),
                Arguments.of(2500,2500,2500,2500,true)
        );
    }

    @DisplayName("Minimum number in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_testingAfterTwoLegs")
    void checking_after_two_legs_of_trip (int start, int oxen, int leg1, int leg2, boolean need) {
        Wagon w = new Wagon(start, oxen);
        w.timeForOxenChange();
        w.addMiles(leg1);
        w.timeForOxenChange();
        w.addMiles(leg2);
        assertEquals(need, w.timeForOxenChange());
    }

   
}
