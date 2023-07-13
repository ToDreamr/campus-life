package net.rain;

import java.io.IOException;
import java.net.URL;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/13 15:47
 */
public class ResourceTest {
    public static void main(String[] args) throws IOException {
        /**
         * 测试用类加载器来获取文件的绝对路径
         */
        URL url = ResourceTest.class.getClassLoader().getResource("./png/6.png");
        assert url != null;
        url.openStream();
        System.out.println(url);
    }
}
