package com.houarizegai.calculator.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorUITest2 {

    @BeforeEach
    void setUp() {
        calculatorUI = new CalculatorUI();
    }
    private CalculatorUI calculatorUI;

    @Test
    public void testAddition() {
        assertEquals(8,calculatorUI.calculate(3.0,5.0, '+'));
    }


}