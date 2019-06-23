package com.sargeraswang.util.ExcelUtil;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class TestExportBean {
    @Test
    public void exportXls() throws IOException {
        //用排序的Map且Map的键应与ExcelCell注解的index对应
        Map<String,String> map = new LinkedHashMap<>();
        map.put("1","线路");
        map.put("2","出团日期");
        map.put("3","市场成人价");
        map.put("4","市场小童价");
        map.put("5","同行成人价");
        map.put("6","同行小童价");
        map.put("7","备注");
        Collection<Object> dataset=new ArrayList<Object>();
        dataset.add(new Model2("端午节：6月：B2、【粽乐连城】北京皇城+叹宫廷美食欢乐纯玩直航六天（南航北京往返）1日、8日（早对午）", new Date(), "111","222","333","444","纯玩团！独家安排：皇家行宫御苑【颐和园】坐【龙舟游昆明湖】，看老佛爷专属风景！享用颐和园【听鹂馆】独特宫廷风味菜，体验慈禧太后欣赏戏曲用膳的地方！品尝风味：宫廷小吃！品尝烤鸭！声声慢饺子宴！北京住准四！房差：补650元，退500元。"));
        dataset.add(new Model2("端午节：6月：B2、【粽乐连城】北京皇城+叹宫廷美食欢乐纯玩直航六天（南航北京往返）1日、8日（早对午）", new Date(), "111","222","333","444","纯玩团！独家安排：皇家行宫御苑【颐和园】坐【龙舟游昆明湖】，看老佛爷专属风景！享用颐和园【听鹂馆】独特宫廷风味菜，体验慈禧太后欣赏戏曲用膳的地方！品尝风味：宫廷小吃！品尝烤鸭！声声慢饺子宴！北京住准四！房差：补650元，退500元。"));
        
        File f=new File("C:/Users/Administrator/Desktop/test.xls");
        OutputStream out =new FileOutputStream(f);
        
        ExcelUtil.exportExcel(map, dataset, out);
        out.close();
    }
}
