package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Mitchell Paiva
 */
public class TestsFromStudent {
    /**
   * Tests if copying an array works properly.
   * 
   * @throws NullKeyException 
   * @throws KeyNotFoundException
   */
  @Test
  public void paivaMitchTest01() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<String, String> testArray = new AssociativeArray<String, String>();
    testArray.set("Grinnell", "College");
    AssociativeArray<String, String> testArrayClone = testArray.clone();
    assertEquals(1, testArrayClone.size(), "Cloned array Size not consistent with original array size.");
    assertEquals(false , (testArray == testArrayClone), "Cloned array should not be the same exact object.");
    assertEquals("College", (testArrayClone.get("Grinnell")), "Cloned array should have the same value as the original.");
    assertEquals(true, testArrayClone.hasKey("Grinnell"), "Cloned array does not have the same key like the original.");
  } //paivaMitchTest01

/**
 * Tests if adding and removing works correctly for key type string and int.
 * 
 * @throws NullKeyException 
 * @throws KeyNotFoundException
 */
@Test
public void paivaMitchTest02() throws NullKeyException, KeyNotFoundException {
  AssociativeArray<String, String> testArray = new AssociativeArray<String, String>();
  AssociativeArray<Integer, String> testArray2 = new AssociativeArray<Integer, String>();
  testArray.set("hello", "others");
  testArray2.set(1, "yep");
  assertEquals(true, testArray.hasKey("hello"), "String key not properly set.");
  assertEquals(true, testArray2.hasKey(1), "Integer key not properly set.");
  testArray.remove("hello");
  testArray2.remove(1);
  assertEquals(false, testArray.hasKey("hello"), "String key not properly removed after creation.");
  assertEquals(false, testArray2.hasKey(1), "Integer key not properly removed after creation.");
} //paivaMitchTest02

/**
 * Tests an empty array that has had nothing added to it.
 * 
 * @throws NullKeyException 
 * @throws KeyNotFoundException
 */
@Test
public void paivaMitchEdge01() throws NullKeyException, KeyNotFoundException {
  AssociativeArray<Integer, String> testArray = new AssociativeArray<Integer, String>();
  AssociativeArray<Integer, String> copy = testArray.clone();
  assertEquals(0, testArray.size(), "Array should be empty.");
  assertEquals(false, testArray.hasKey(1), "An empty array should not have a key.");
  assertEquals(0, copy.size(), "Copying an empty array should result in an array that is empty.");
  assertEquals(false, copy.hasKey(1), "Copying an empty array should result in an array that does not have a key.");
} //paivaMitchEdge01
} // class TestsFromStudent
