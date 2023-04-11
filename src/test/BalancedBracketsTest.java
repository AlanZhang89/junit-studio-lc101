package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void doesHaveBalancedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }
    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testStringWithOnlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testStringWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testStringWithUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testStringWithNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode] is awesome!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code[ is awesome!]"));
    }

    @Test
    public void testStringWithNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }

    @Test
    public void testStringWithMultipleBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch][Code]"));
    }
    @Test public void test(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]Code["));
    }
}
