import org.junit.Test;

public class MainTest {
    @Test
    public void mainTest0() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }

    @Test
    public void mainTest1() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig_0.8_add.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }

    @Test
    public void mainTest2() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig_0.8_del.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }

    @Test
    public void mainTest3() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig_0.8_dis_1.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }

    @Test
    public void mainTest4() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig_0.8_dis_10.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }

    @Test
    public void mainTest5() {
        String str1 = "D:/testTxt/orig.txt";
        String str2 = "D:/testTxt/orig_0.8_dis_15.txt";
        String resultPath = "D:/result.txt";

        String[] arr = {str1, str2, resultPath};
        plagiarismCheckerMain.main(arr);
    }
}
