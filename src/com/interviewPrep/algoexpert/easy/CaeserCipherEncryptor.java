package com.interviewPrep.algoexpert.easy;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class CaeserCipherEncryptor {
    public static Logger LOGGER = LoggerFactory.getLogger(CaeserCipherEncryptor.class);
    public void caeserCipherEncryptor(String str, int key) {
        char[] charString = str.toCharArray();
        try {
            byte[] byteString = str.getBytes("US-ASCII");
            for (byte byteElement: byteString){
                LOGGER.debug("Byte:: " + byteElement);
            }
        } catch (Exception e) {
            LOGGER.error("Error while byte creation:: " + e);
        }
    }
}
