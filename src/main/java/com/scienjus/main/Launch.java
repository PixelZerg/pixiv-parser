package com.scienjus.main;

import com.scienjus.client.PixivClient;

import java.text.ParseException;

/**
 * Created by Scienjus on 2015/3/16.
 */
public class Launch {

    public static void main(String[] args) throws ParseException {
        //创建实例并选择图片保存位置
        PixivClient client = PixivClient.create("E:/as109");
        //设置用户名和密码
        client.setUsername("1498129534@qq.com");
        client.setPassword("a123456");
        if (client.login()) {
            //根据关键字搜索并过滤收藏数
            // param: 关键字 是否r18 最小收藏数
//            client.searchByKeyword("時雨", false, 1000);
            //搜索某一天的排行榜
//            client.downloadRankOn(new SimpleDateFormat("yyyyMMdd").parse("20150318"), RankingMode.all, false);
            //搜索某个作者的所有作品
            client.searchByAuthor("1910668");
        }
        //关闭资源
        client.close();
    }

}