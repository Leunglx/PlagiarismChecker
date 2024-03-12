package utils;

import org.junit.Test;

public class HammingAndSimilarityUnitTest {
    @Test
    public void HammingAndSimilarityTest() {
        String str1 = TxtUtils.readTxt("D:/testTxt/orig.txt");
        String str2 = TxtUtils.readTxt("D:/testTxt/orig_0.8_del.txt");
        double similarity = HammingAndSimilarityUnit.SimilarityResult(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str2));
        System.out.println("相似度为：" + similarity);
    }
}
