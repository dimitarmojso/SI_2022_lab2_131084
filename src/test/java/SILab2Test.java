import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementAndBranchTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0","#");

        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case1));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case2));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> case3 = List.of( "0","#","0", "#","0","#", "#","#","0");
        List<String> case3ExpectedOutput = List.of("2", "#", "2", "#", "4", "#", "#", "#", "2");
        assertEquals(SILab2.function(case3), case3ExpectedOutput);
    }
}