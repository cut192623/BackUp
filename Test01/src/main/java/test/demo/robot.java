package test.demo;



import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class robot {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\12159\\Desktop\\java框架\\新建文件夹\\";
        Connection.Response response = Jsoup.connect("https://pvp.qq.com/web201605/js/item.json").ignoreContentType(true).execute();
        String body = response.body();
//        //1
//        JsonArray array =  new JsonParser().parse(body).getAsJsonArray();
//        for(int i=0;i<array.size();i++){
//            System.out.println(
//                  "名称"+  array.get(i).getAsJsonObject().get("item_name")+" "+
//                  "售价"+array.get(i).getAsJsonObject().get("price")+" "+
//                  "总价"+array.get(i).getAsJsonObject().get("total_price")+" "+
//                  "图片"+"https://game.gtimg.cn/images/yxzj/img201606/itemimg/"+array.get(i).getAsJsonObject().get("item_id")+".jpg"
//            );
//        }
//2
        Type type = new TypeToken<List<info>>(){}.getType();
        List<info> list = new Gson().fromJson(body,type);
        info info =new info();
        for(int i=0;i<list.size();i++){
            info=null;
            info.setItem_name(list.get(i).getItem_name());
            info.setPrice(list.get(i).getPrice());
            info.setTotal_price(list.get(i).getTotal_price());
            info.setPic("https://game.gtimg.cn/images/yxzj/img201606/itemimg/"+list.get(i).getItem_id()+".jpg");
            System.out.println(
                    "名字："+info.getItem_name()+" "+
                    "价格："+info.getPrice()+" "+
                    "总价："+info.getTotal_price()+" "+
                    "图片："+info.getPic()
            );

        }




    }

    public static void savefile(String url,String filename) throws IOException {
        Connection.Response execute = Jsoup.connect(url).ignoreContentType(true).execute();
        byte[] data = execute.bodyAsBytes();
        System.out.println(data);
        //java io
        FileOutputStream fileOutputStream = new FileOutputStream(new File(filename));
        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();

    }
}
