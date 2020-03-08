package main.java.com.jiker.keju.utils;


import main.java.com.jiker.keju.billing.StraegyFactoy;
import main.java.com.jiker.keju.billing.TaxiCost;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils {

    public static String readFile(String filePath,String line) throws IOException {
        StringBuffer res=new StringBuffer();
        while (( line = getRead(filePath).readLine()) != null) {
            Matcher matcher = Pattern.compile("[0-9]*").matcher(line);
            if (matcher.find()){
                res.append(StraegyFactoy.getStraegy(Integer.parseInt(matcher.group(0)),Integer.parseInt(line.split("[等待分钟]")[2])).billing());
            }
        }
        return res.toString();
    }


    private static BufferedReader getRead(String filePath) throws FileNotFoundException {
        FileInputStream inputStream = null;
        BufferedReader reader = null;
        inputStream = new FileInputStream(filePath);
        reader = new BufferedReader(new InputStreamReader(inputStream));
        return reader;
    }

}
