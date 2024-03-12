package utils;

import org.junit.Test;

public class SimHashUtilsTest {
    @Test
    public void getMD5HashTest() {
        String[] words = {"世界", "时时刻刻", "人文精神", "夏天", "的"};
        for(String word: words) {
            System.out.println(SimHashUtils.getMD5Hash(word));
        }
    }

    @Test
    public void getSimHashTest(){
        String str1 = TxtUtils.readTxt("D:/testTxt/orig.txt");
        String str2 = TxtUtils.readTxt("D:/testTxt/orig_0.8_del.txt");
        System.out.println(SimHashUtils.getSimHash(str1));
        System.out.println(SimHashUtils.getSimHash(str2));
    }
}
