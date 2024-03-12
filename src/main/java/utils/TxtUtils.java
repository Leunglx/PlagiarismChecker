package utils;

import java.io.*;
import java.text.DecimalFormat;

public class TxtUtils {
    /**
     * 读取txt内容到字符串
     * @param path 文件路径
     * @return txt文件内容
     */
    public static String readTxt(String path) {
        String line;
        String content;

        // 用ButteredReader类的readLine()方法逐行读取文件，将文件内容加到带有换行符的StingBuilder对象
        try {
            // 定义file对象 用来初始化FileReader
            File file = new File(path);
            // 定义一个BufferedReader对象 将文件内容读取到缓存
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            while(null != (line = reader.readLine())) {
                // 将读取的每行字符串后面加换行符 累加存放在缓存中
                stringBuilder.append(line + "\n");
            }
            content = stringBuilder.toString();
            // 关闭资源
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }

    /**
     * 写入txt文件
     * @param content 写入的内容
     * @param path 写入的文件路径
     */
    public static void writeTxt(double content, String path) {
        // 将浮点数格式化为两位小数
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedContent = df.format(content);

        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(formattedContent);
            writer.write("\r\n"); // 换行
            writer.close(); // 关闭资源
            System.out.println("重复率已写入文件");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
