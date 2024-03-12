package utils;

import org.junit.Test;

public class TxtUtilsTest {
    @Test
    public void readTxtTest() {
        // 正常读取
        String str = TxtUtils.readTxt("D:/testTxt/orig.txt");
        String[] lines = str.split(" ");
        for (String string : lines) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 正常写入
        double[] testArr = {1.00, 0.5, 0.853, 0.45};
        for(double num: testArr) {
            TxtUtils.writeTxt(num, "D:/result.txt");
        }
    }
}
