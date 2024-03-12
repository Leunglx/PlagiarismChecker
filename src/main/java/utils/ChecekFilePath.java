package utils;

import java.io.File;

public class ChecekFilePath {
    // 检查输入的文件路径是否正确
    public static void pathChecker(String[] pathArr) {
        if(pathArr.length != 3) {
            System.out.println("\n必须提供3个文件路径作为参数。");
//            System.exit(1);
        }
        for (String path: pathArr) {
            File file = new File(path);
            try {
                // 检查文件是否存在
                if(!file.exists()) {
                    System.err.println("\n文件不存在：" + path);
//                    System.exit(1);
                }
                // 检查是不是txt文件
                if(!path.endsWith(".txt")) {
                    System.out.println("\n存在非txt类型的文件：" + path);
//                    System.exit(1);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
