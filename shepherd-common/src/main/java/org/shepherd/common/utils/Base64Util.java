package org.shepherd.common.utils;

import org.apache.commons.net.util.Base64;

/**
 * Base64 encryption and decryption Toolkit
 *
 * @author niuzhiwei
 */
public class Base64Util {

    /**
     * File read buffer size
     */
    private static final int CACHE_SIZE = 1024;

    /**
     * <p>
     * Base64 string decoded to binary data
     * </p>
     *
     * @param data
     * @return
     */
    public static byte[] decode(String data) {
        return Base64.decodeBase64(data.getBytes());
    }

    /**
     * <p>
     * The binary data is encoded as a Base64 string
     * </p>
     *
     * @param bytes
     * @return
     */
    public static String encode(byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }

}
