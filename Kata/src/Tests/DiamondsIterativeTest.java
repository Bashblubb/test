package Tests;

import org.junit.Ignore;
import org.junit.Test;
import Diamonds.DiamondsIterative;

import static org.junit.Assert.assertEquals;

/**
 * These test cases can be used to test-drive a solution to the diamond kata, in an interative manner.
 * Enable only one test case for "Diamond A", one for "Diamond B" and one for "Diamond C" at any one time.
 * The idea is that you iterate towards a full solution. 
 *
 * Instructions:
 * 1. Make the first test for Diamond A (which is failing) pass
 * 2. Remove the '@Ignore' on the next test case. Make it pass too.
 * 3. Replace the '@Ignore' on that test case, (or delete it), and instead enable the following test case
 * 4. keep doing this, always having exactly one enabled test case for each diamond, (A, B, and C) until you've got to the end of the file.
 * At that point you should have a working implementation.
 */
public class DiamondsIterativeTest {
	
	
	@Ignore
    @Test
    public void DiamondA_has_one_line_containing_A() {
        assertEquals("A", DiamondsIterative.print('A'));
    }

    @Ignore
    @Test
    public void DiamondB_prints_a_char_sequence_for_the_top_half() {
        assertEquals("AB", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondB_prints_a_char_sequence_for_the_whole_diamond() {
        assertEquals("ABA", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondC_prints_a_char_sequence_for_the_whole_diamond() {
        assertEquals("ABCBA", DiamondsIterative.print('C'));
    }

    @Ignore
    @Test
    public void DiamondB_has_newlines() {
        assertEquals("A\nB\nA", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondB_has_indentation_on_first_and_last_rows() {
        assertEquals(" A\nB\n A", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondC_has_indentation_on_all_rows_except_middle() {
        assertEquals("  A\n" +
                     " B\n" +
                     "C\n" +
                     " B\n" +
                     "  A", DiamondsIterative.print('C'));
    }

    @Ignore
    @Test
    public void DiamondB_duplicates_B_on_middle_row() {
        assertEquals(" A\nBB\n A", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondC_has_duplicates_on_middle_rows() {
        assertEquals("  A\n" +
                     " BB\n" +
                     "CC\n" +
                     " BB\n" +
                     "  A", DiamondsIterative.print('C'));
    }

    @Ignore
    @Test
    public void DiamondB_has_a_space_between_the_Bs() {
        assertEquals(" A\nB B\n A", DiamondsIterative.print('B'));
    }

    @Ignore
    @Test
    public void DiamondC_has_between_spaces_on_all_rows_except_first_and_last() {
        assertEquals("  A\n" +
                     " B B\n" +
                     "C   C\n" +
                     " B B\n" +
                     "  A", DiamondsIterative.print('C'));
    }

    @Ignore
    @Test
    public void DiamondD_is_correct_in_all_aspects() {
        assertEquals("   A\n" +
                     "  B B\n" +
                     " C   C\n" +
                     "D     D\n" +
                     " C   C\n" +
                     "  B B\n" +
                     "   A", DiamondsIterative.print('D'));
    }
}
