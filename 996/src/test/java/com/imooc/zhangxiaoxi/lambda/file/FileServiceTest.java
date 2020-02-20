package com.imooc.zhangxiaoxi.lambda.file;

import org.junit.Test;

import java.io.IOException;

public class FileServiceTest {

    @Test
    public void fileHandle() throws IOException {
        FileService fileService = new FileService();

        // TODO 此处替换为本地文件的地址全路径
        String filePath = "E:\\infos.txt";

        // 通过lambda表达式，打印文件内容
        fileService.fileHandle(filePath,
                fileContent -> System.out.println(fileContent));
    }
}
