package com.bankocr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;

public class BankOCRTest {

    private AccountNumberParser accountNumberParser;

    @Before
    public void setUp() throws Exception {
        accountNumberParser = new AccountNumberParser();
    }

    @Test
    public void testHamcrest() throws Exception {
        Assert.assertThat(0, is(0));
    }

    @Test
    public void testCanReadFileFromResources() throws Exception {
        Assert.assertThat(accountNumberParser.readFileLines("account_numbers.txt"), is(not(nullValue())));
    }
}
