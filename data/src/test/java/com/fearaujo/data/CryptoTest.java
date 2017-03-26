package com.fearaujo.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by felipearaujo on 06/12/16.
 */

public class CryptoTest {

    private CryptoUtil mCryptoUtil;

    @Before
    public void setUp() {
        mCryptoUtil = new CryptoUtil();
    }

    @Test
    public void string1Test() {
        Assert.assertEquals("7e04da88cbb8cc933c7b89fbfe121cca", mCryptoUtil.MD5_Hash("felipe"));
        Assert.assertEquals("1c3954fed8a8b462ac4f9f13af9a7100", mCryptoUtil.MD5_Hash("1293129hd82d872hhf72hf783hf7893hf783hf738hf7893hf"));
    }

}
