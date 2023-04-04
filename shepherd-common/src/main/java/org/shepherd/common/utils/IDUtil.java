package org.shepherd.common.utils;

import java.util.UUID;

/**
 * @author niuzhiwei
 */
public class IDUtil {

    public static String generatePK() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
