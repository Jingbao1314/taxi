package com.jiker.keju;

import main.java.com.jiker.keju.utils.FileUtils;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        /*TODO
          1. args[0]为resources下的测试数据文件名，例如传入的args[0]值为"testData.txt"，注意并不包含文件路径。
          2. 你写的程序将把testDataFile作为参数加载此文件并读取文件内的测试数据，并对每条测试数据计算结果。
          3. 将所有计费结果拼接并使用\n分割，然后保存到receipt变量中。
         */
        StringBuffer receipt = new StringBuffer();
        FileUtils.readFile(System.getProperty("user.dir")+"/src/main/resources/testData.txt",receipt);
        System.out.println(receipt.toString());
    }
}
