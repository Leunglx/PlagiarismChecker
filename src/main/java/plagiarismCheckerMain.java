import  utils.*;

public class plagiarismCheckerMain {
    public static void main(String[] args) {
        // 检查文件
        ChecekFilePath.pathChecker(args);
        // 读取文件 并将txt的内容转为字符串
        String str1 = TxtUtils.readTxt(args[0]);
        String str2 = TxtUtils.readTxt(args[1]);
        // 存放结果的文件
        String resultTxtPath =args[2];
        // 计算字符串对应的simHash
        String simHash1 = SimHashUtils.getSimHash(str1);
        String simHash2 = SimHashUtils.getSimHash(str2);
        // 计算海明距离，求出相似度
        double similarity = HammingAndSimilarityUnit.SimilarityResult(simHash1, simHash2);
        // 将相似度写入txt
        TxtUtils.writeTxt(similarity, resultTxtPath);
        // 退出程序
        System.exit(0);
    }
}