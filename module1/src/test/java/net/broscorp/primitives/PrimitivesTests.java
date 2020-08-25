package net.broscorp.primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PrimitivesTests {

  @Test
  void checkByteValueOverflow() {
    assertEquals(Byte.MIN_VALUE, (byte) (Byte.MAX_VALUE + 1));
    assertEquals(Byte.MAX_VALUE, (byte) (Byte.MIN_VALUE - 1));
  }

  @Test
  void checkShortValueOverflow() {
    assertEquals(Short.MIN_VALUE, (short) (Short.MAX_VALUE + 1));
    assertEquals(Short.MAX_VALUE, (short) (Short.MIN_VALUE - 1));
  }

  @Test
  void checkIntValueOverflow() {
    assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + 1);
    assertEquals(Integer.MAX_VALUE, Integer.MIN_VALUE - 1);
  }

  @Test
  void checkLongValueOverflow() {
    assertEquals(Long.MIN_VALUE, Long.MAX_VALUE + 1);
    assertEquals(Long.MAX_VALUE, Long.MIN_VALUE - 1);
  }

  @Test
  void checkTroublesConvertingLongToInt() {
    assertEquals(224783639, (int) 224783639L);
    assertEquals(-194867196, (int) 4100100100L);
  }

  @Test
  void checkTroublesConvertingFloatToDouble() {
    assertNotEquals(0.111111111111111111, 0.111111111111111111f);
    assertEquals(0.1111111119389534, 0.111111111111111111f);
  }
}
