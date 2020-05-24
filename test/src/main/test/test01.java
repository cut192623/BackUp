import java.io.IOException;
import java.util.Random;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
public class test01 {

    public static class Shuapiaole {

        public static void main(String[] args) throws InterruptedException, IOException {
            // TODO Auto-generated method stub
            while(true){
                HttpClient httpClient = new HttpClient();
                String url = "http://gaowei.juzhen02.com/2018-4/2020/xinshidai0509/";
                PostMethod postMethod = new PostMethod(url);
                //   填入各个表单域的值
                NameValuePair[] data = {
                        new NameValuePair("userId", "xxxx"),
                };
                //   将表单的值放入postMethod中
                postMethod.setRequestBody(data);
                //   执行postMethod
                String s = getRandomIp();
                postMethod.setRequestHeader("x-forwarded-for",s);
                System.out.println(s);

                int statusCode = 0;
                try {
                    statusCode = httpClient.executeMethod(postMethod);
                    System.out.println(postMethod.getResponseBodyAsString());
                } catch (HttpException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //   HttpClient对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发
                //   301或者302
                if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY || statusCode == HttpStatus.SC_MOVED_TEMPORARILY)
                {
                    //   从头中取出转向的地址
                    Header locationHeader = postMethod.getResponseHeader("location");
                    String location = null;
                    if (locationHeader != null) {
                        location = locationHeader.getValue();
                        System.out.println("The page was redirected to:" + location);
                    }
                    else {
                        System.err.println("Location field value is null.");
                    }
                    return;
                }
                else
                {
                    System.out.println(postMethod.getStatusLine());
                    String str = "";
                    str = postMethod.getResponseBodyAsString();
                    System.out.println(str);
                }
                postMethod.releaseConnection();
                int waitTime = (int)(Math.random()*4);
                for(int j = 0; j < waitTime; j++){
                    System.out.print(". ");
                    Thread.sleep(1000);
                }
                System.out.println("\n");
            }


        }

        public static String getRandomIp(){

            //ip范围
            int[][] range = {{607649792,608174079},//36.56.0.0-36.63.255.255
                    {1038614528,1039007743},//61.232.0.0-61.237.255.255
                    {1783627776,1784676351},//106.80.0.0-106.95.255.255
                    {2035023872,2035154943},//121.76.0.0-121.77.255.255
                    {2078801920,2079064063},//123.232.0.0-123.235.255.255
                    {-1950089216,-1948778497},//139.196.0.0-139.215.255.255
                    {-1425539072,-1425014785},//171.8.0.0-171.15.255.255
                    {-1236271104,-1235419137},//182.80.0.0-182.92.255.255
                    {-770113536,-768606209},//210.25.0.0-210.47.255.255
                    {-569376768,-564133889}, //222.16.0.0-222.95.255.255
            };

            Random rdint = new Random();
            int index = rdint.nextInt(10);
            String ip = num2ip(range[index][0]+new Random().nextInt(range[index][1]-range[index][0]));
            return ip;
        }

        /*
         * 将十进制转换成ip地址
         */
        public static String num2ip(int ip) {
            int [] b=new int[4] ;
            String x = "";

            b[0] = (int)((ip >> 24) & 0xff);
            b[1] = (int)((ip >> 16) & 0xff);
            b[2] = (int)((ip >> 8) & 0xff);
            b[3] = (int)(ip & 0xff);
            x=Integer.toString(b[0])+"."+Integer.toString(b[1])+"."+Integer.toString(b[2])+"."+Integer.toString(b[3]);

            return x;
        }

    }


}
