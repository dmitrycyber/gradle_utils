package lib;

import lib.exception.NotNumberException;

public class StringUtils {


    public static boolean isPositiveNumber(String str) {
        if (str.startsWith("-")){
            String replaceFirst = str.replaceFirst("-", "");
            if (org.apache.commons.lang3.StringUtils.isNumeric(replaceFirst)){
                return false;
            }
        }
        if (!org.apache.commons.lang3.StringUtils.isNumeric(str)){
            throw new NotNumberException();
        }

        return true;
    }
}
