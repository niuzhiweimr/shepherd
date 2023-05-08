package org.shepherd.common.utils;

import java.security.MessageDigest;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * @author niuzhiwei
 * @date 2019/3/8
 */
public class MD5Util {


    public static String getDefaultMd5String(String source) throws Exception {
        return md5String(source, "UTF-8", "");
    }

    public static String getDefaultMd5String(String source, String md5Key) throws Exception {
        return md5String(source, "UTF-8", md5Key);
    }

    public static String md5String(String source, String encoder, String mid5key) throws Exception {
        StringBuilder hexString = new StringBuilder();
        if (!isEmpty(source)) {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((source + mid5key).getBytes(encoder));
            byte[] hash = md.digest();
            for (byte b : hash) {
                if ((0xff & b) < 0x10) {
                    hexString.append("0").append(Integer.toHexString((0xFF & b)));
                } else {
                    hexString.append(Integer.toHexString(0xFF & b));
                }
            }
        }
        return hexString.toString();
    }


}
