package com.employeepayroll;

import junit.framework.TestSuite;
import org.junit.Test;
import junit.framework.TestCase;



public class EmployeePayrollServicesTest
        extends TestCase {

    public EmployeePayrollServicesTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        return (Test) new TestSuite(EmployeePayrollServicesTest.class);
    }


    public void testApp() {
        assertTrue(true);
    }
}