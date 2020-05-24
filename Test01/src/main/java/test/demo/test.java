package test.demo;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

    private static final String path = "C:\\Users\\12159\\Desktop\\java框架\\新建文件夹\\";

    public static void main(String[] args) throws IOException {
        //向指定url发起请求,并返回文本内容
        Document document = Jsoup.connect("https://pvp.qq.com/web201605/item.shtml").get();

        //ul
        //根据class查找元素
        Elements herolist = document.getElementsByClass("herolist");

        //根据标签名称查找元素
        Elements imgs = herolist.get(0).getElementsByTag("img");
        System.out.println(imgs);
//        for (int i = 0; i < imgs.size(); i++) {
//            String url = imgs.get(i).attr("src");
//            String name = imgs.get(i).attr("alt");
//          //  saveFile("https:" + url, path + name + ".jpg");   //盘古.jpg
//        }
    }

    /**
     *  保存文件
     * @param url
     * @param fileName 路径+文件名   例如: c:/123.jpg
     */
    public static void saveFile(String url, String fileName) throws IOException {
        Connection.Response execute = Jsoup.connect(url).ignoreContentType(true).execute();
        byte[] data = execute.bodyAsBytes();

        //java io
        //把内存中的数据输出为文件时,要用到io流
        FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
