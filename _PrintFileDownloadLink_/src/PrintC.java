import java.util.ArrayList;
import java.util.List;

/**
 * 当前类，针对分卷压缩
 */
public class PrintC {

    private static String firstLink = "https://github.com/dzet-share/___JavaPdf_/raw/master/_Data%20Structures%20and%20Algorithms%20in%20Java_41_/src/file/_Data%20Structures%20and%20Algorithms%20in%20Java_41_.z01";

    public static void main(String[] args) {

        printFileDownloadLink(firstLink,1,4);
    }

    private static void printFileDownloadLink(String firstLink, int startNum, int endNum) {
        if (!(startNum >= 0 && endNum > startNum)) {
            return;
        }
        String str = firstLink.substring(0, firstLink.lastIndexOf(".") + 2);
        System.out.println(str);
        System.out.println();
        String strZero = "0";
        for (int i = startNum; i < endNum; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            if (i - 10 < 0) {
                stringBuilder.append(strZero);
                stringBuilder.append(String.valueOf(i));
            } else if (0 <= i - 10 && i < 100) {
                stringBuilder.append(strZero);
                stringBuilder.append(String.valueOf(i));
            } else if (i - 100 >= 0) {
                stringBuilder.append(String.valueOf(i));
            }

            System.out.println(stringBuilder.toString());
        }
        String stringBuilder = str + "ip";
        System.out.println(stringBuilder);

//        for (String s : stringList) {
//            System.out.println(s);
//        }

    }

}
