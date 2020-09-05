package com.carhern.loginpage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void username_isCorrect(){
        assertEquals("din_djarin", MethodsTest.user("din_djarin") );
        assertEquals("cs_student", MethodsTest.user("cs_student"));
        assertEquals("win_5", MethodsTest.user("win_5"));
    }

    @Test
    public void password_isCorrect(){
        assertEquals("baby_yoda_ftw", MethodsTest.password("baby_yoda_ftw"));
        assertEquals("laptop10", MethodsTest.password("laptop10"));
        assertEquals("start32", MethodsTest.password("start32"));
    }
    
    @Test
    public void intent_factory(){
        assertEquals("baby_yoda_ftw", MethodsTest.factory("baby_yoda_ftw"));
    }

}