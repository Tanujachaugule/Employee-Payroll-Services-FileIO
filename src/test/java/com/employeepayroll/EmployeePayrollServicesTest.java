package com.employeepayroll;

import junit.framework.TestSuite;
import junit.framework.TestCase;



public class EmployeePayrollServicesTest
        extends TestCase
{

    public EmployeePayrollServicesTest(String testName )
    {

        super( testName );
    }


    public static TestSuite suite()
    {

        return new TestSuite( EmployeePayrollServicesTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
}
