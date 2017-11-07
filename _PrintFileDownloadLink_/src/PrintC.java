import java.util.ArrayList;
import java.util.List;

/**
 * 当前类，针对7z分卷压缩
 */
public class PrintC {

    private static final String _算法第4版_181_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_%E7%AE%97%E6%B3%95%E7%AC%AC4%E7%89%88_181_/src/file/_%E7%AE%97%E6%B3%95%E7%AC%AC4%E7%89%88_181_.zip.001";
    private static final String _算法基础_打开算法之门_40_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_%E7%AE%97%E6%B3%95%E5%9F%BA%E7%A1%80_%E6%89%93%E5%BC%80%E7%AE%97%E6%B3%95%E4%B9%8B%E9%97%A8_40_/src/file/_%E7%AE%97%E6%B3%95%E5%9F%BA%E7%A1%80_%E6%89%93%E5%BC%80%E7%AE%97%E6%B3%95%E4%B9%8B%E9%97%A8_40_.zip.001";
    private static final String _数据结构与算法分析_Java语言描述_第2版_37_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%E5%88%86%E6%9E%90_Java%E8%AF%AD%E8%A8%80%E6%8F%8F%E8%BF%B0_%E7%AC%AC2%E7%89%88_37_/src/file/_%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%E5%88%86%E6%9E%90_Java%E8%AF%AD%E8%A8%80%E6%8F%8F%E8%BF%B0_%E7%AC%AC2%E7%89%88_37_.zip.001";
    private static final String _图解数据结构_使用Java_247_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_%E5%9B%BE%E8%A7%A3%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84_%E4%BD%BF%E7%94%A8Java_247_/src/file/_%E5%9B%BE%E8%A7%A3%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84_%E4%BD%BF%E7%94%A8Java_247_.zip.001";
    private static final String _Java软件结构与数据结构_4版_130_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_Java%E8%BD%AF%E4%BB%B6%E7%BB%93%E6%9E%84%E4%B8%8E%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84_4%E7%89%88_130_/src/file/_Java%E8%BD%AF%E4%BB%B6%E7%BB%93%E6%9E%84%E4%B8%8E%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84_4%E7%89%88_130_.zip.001";
    private static final String _Java数据结构和算法_第二版_25_ ="https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_Java%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E5%92%8C%E7%AE%97%E6%B3%95_%E7%AC%AC%E4%BA%8C%E7%89%88_25_/src/file/_Java%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E5%92%8C%E7%AE%97%E6%B3%95_%E7%AC%AC%E4%BA%8C%E7%89%88_25_.zip.001";

    private static final String _算法导论_原书第3版_101_ = "https://github.com/dzetSharePdf/___JavaPdf_/raw/master/_%E7%AE%97%E6%B3%95%E5%AF%BC%E8%AE%BA_%E5%8E%9F%E4%B9%A6%E7%AC%AC3%E7%89%88_101_/src/file/_%E7%AE%97%E6%B3%95%E5%AF%BC%E8%AE%BA_%E5%8E%9F%E4%B9%A6%E7%AC%AC3%E7%89%88_101_.zip.001";

    public static void main(String[] args) {

//        printFileDownloadLink(_算法第4版_181_,1, 19);
//        printFileDownloadLink(_算法基础_打开算法之门_40_,1, 4);
//        printFileDownloadLink(_数据结构与算法分析_Java语言描述_第2版_37_, 1, 4);
//        printFileDownloadLink(_图解数据结构_使用Java_247_, 1, 24);
//        printFileDownloadLink(_Java软件结构与数据结构_4版_130_, 1, 13);
//        printFileDownloadLink(_Java数据结构和算法_第二版_25_, 1, 3);
        printFileDownloadLink(_算法导论_原书第3版_101_,1,10);
    }

    private static void printFileDownloadLink(String firstLink, int startNum, int endNum) {
        if (!(startNum >= 0 && endNum > startNum)) {
            return;
        }
        String str = firstLink.substring(0, firstLink.lastIndexOf(".") + 1);
//        System.out.println(str);
        String strZero = "0";
        List<String> stringList = new ArrayList<>();
        for (int i = startNum; i <= endNum; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            if (i - 10 < 0) {
                stringBuilder.append(strZero);
                stringBuilder.append(strZero);
                stringBuilder.append(String.valueOf(i));
            } else if (0 <= i - 10 && i < 100) {
                stringBuilder.append(strZero);
                stringBuilder.append(String.valueOf(i));
            } else if (i - 100 >= 0) {
                stringBuilder.append(String.valueOf(i));
            }

            System.out.println(stringBuilder.toString());
            stringList.add(stringBuilder.toString());
        }

//        for (String s : stringList) {
//            System.out.println(s);
//        }

    }

}
