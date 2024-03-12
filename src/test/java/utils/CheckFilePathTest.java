package utils;

import org.junit.Test;

public class CheckFilePathTest {
    @Test
    public void checkFilePathTest() {
        // 路径正常情况
        String[] pathArr = {"D:/testTxt/orig.txt", "D:/testTxt/orig_0.8_add.txt", "D:/result.txt"};
        ChecekFilePath.pathChecker(pathArr);
    }

    @Test
    public void checkFilePathFailTest1() {
        // 路径对应文件不存在
        String[] pathArr = {"D:/testTxt/orig.txt", "D:/testTxt/orig_0.8_add.txt", "D:/testTxt/resulttt.txt"};
        ChecekFilePath.pathChecker(pathArr);
    }


    @Test
    public void checkFilePathFailTest2() {
        // 路径对应文件存在但不是txt文件
        String[] pathArr = {"D:/testTxt/orig.txt", "D:/testTxt/orig_0.8_add.txt", "D:/word.docx"};
        ChecekFilePath.pathChecker(pathArr);
    }
}
