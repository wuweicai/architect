package com.ysx.architect.common;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class StringUtil {
    public StringUtil() {
    }

    public static boolean isNullOrBlock(Object string) {
        return string == null || "".equals(string.toString());
    }

    public static boolean isNotNullOrBlock(Object string) {
        return !isNullOrBlock(string);
    }

    public static boolean afterTrimIsNullOrBlock(String string) {
        if (string != null && !"".equals(string)) {
            string = string.trim();
            return string == null || "".equals(string);
        } else {
            return true;
        }
    }

    public static boolean afterTrimIsNotNullOrBlock(String string) {
        return !afterTrimIsNullOrBlock(string);
    }

    public static String fristCharToUpperCase(String string) {
        return (string.charAt(0) + "").toUpperCase() + string.substring(1);
    }

    public static String fristCharToLowerCase(String string) {
        return (string.charAt(0) + "").toLowerCase() + string.substring(1);
    }

    public static String unicodeToUtf8(String theString) {
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        int x = 0;

        while(true) {
            while(true) {
                while(x < len) {
                    char aChar = theString.charAt(x++);
                    if (aChar == '\\') {
                        aChar = theString.charAt(x++);
                        if (aChar == 'u') {
                            int value = 0;

                            for(int i = 0; i < 4; ++i) {
                                aChar = theString.charAt(x++);
                                switch(aChar) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        value = (value << 4) + aChar - 48;
                                        break;
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    default:
                                        throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        value = (value << 4) + 10 + aChar - 65;
                                        break;
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                        value = (value << 4) + 10 + aChar - 97;
                                }
                            }

                            outBuffer.append((char)value);
                        } else {
                            if (aChar == 't') {
                                aChar = '\t';
                            } else if (aChar == 'r') {
                                aChar = '\r';
                            } else if (aChar == 'n') {
                                aChar = '\n';
                            } else if (aChar == 'f') {
                                aChar = '\f';
                            }

                            outBuffer.append(aChar);
                        }
                    } else {
                        outBuffer.append(aChar);
                    }
                }

                return outBuffer.toString();
            }
        }
    }

    public static String list2String(List<?> list) {
        if (list != null && list.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator i$ = list.iterator();

            while(i$.hasNext()) {
                Object object = i$.next();
                stringBuffer.append(object.toString() + ",");
            }

            String rs = stringBuffer.toString();
            return rs.substring(0, rs.length() - 1);
        } else {
            return "";
        }
    }

    public static String getUUid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String getRandomNum(int numLen) {
        if (numLen <= 0 || numLen >= 100) {
            numLen = 6;
        }

        String rs = "";

        for(int i = 0; i < numLen; ++i) {
            Random random = new Random();
            int randomInt = random.nextInt() % 10;
            rs = rs + Math.abs(randomInt);
        }

        return rs;
    }

    public static boolean isNotBlank(String theString) {

        if(theString.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        Integer i = new Integer(2);
        System.out.println(i.toString());
    }
}