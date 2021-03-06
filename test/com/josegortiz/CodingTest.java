package com.josegortiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import  com.josegortiz.Coding;

class CodingTest {

  @ParameterizedTest
  @CsvFileSource(resources = "affirmative-data.csv")
  void makes10(int a, int b) {
    assertTrue(Coding.makes10(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "negative-data.csv")
  void doesNotMake10(int a, int b) {
    assertFalse(Coding.makes10(a,b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "pos-neg-data-true.csv")
  void posNegTrue(int a, int b, boolean negative) {
    assertTrue(Coding.posNeg(a,b,negative));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "pos-neg-data-false.csv")
  void posNegFalse(int a, int b, boolean negative) {
    assertFalse(Coding.posNeg(a,b,negative));
  }

}