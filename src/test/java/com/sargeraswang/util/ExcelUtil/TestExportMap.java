/**
 * @author SargerasWang
 */
package com.sargeraswang.util.ExcelUtil;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

/**
 * The <code>TestExportMap</code>	
 * 
 * @author SargerasWang
 * Created at 2014年9月21日 下午4:38:42
 */
public class TestExportMap {
  @Test
  public void exportXls() throws IOException {
    List<Map<String,Object>> list = new ArrayList<>();
    Map<String,Object> map =new LinkedHashMap<>();
    map.put("lineTitle","");
    map.put("planDate","");
    map.put("sAdultPrice","");
    map.put("sChildPrice","");
    map.put("adultPrice","");
    map.put("childPrice","");
    map.put("remark","");
    Map<String,Object> map2 =new LinkedHashMap<String, Object>();
    map.put("lineTitle",null);
    map.put("planDate",null);
    map.put("sAdultPrice",null);
    map.put("sChildPrice",null);
    map.put("adultPrice",null);
    map.put("childPrice",null);
    map.put("remark",null);
    Map<String,Object> map3 =new LinkedHashMap<String, Object>();
    map3.put("lineTitle","线路");
    map3.put("planDate",new Date());
    map3.put("sAdultPrice","市场成人价");
    map3.put("sChildPrice","市场小童价");
    map3.put("adultPrice","同行成人价");
    map3.put("childPrice","同行小童价");
    map3.put("remark","备注");
    list.add(map);
    list.add(map2);
    list.add(map3);
    Map<String,String> map1 = new LinkedHashMap<>();
    map1.put("lineTitle","线路");
    map1.put("planDate","出团日期");
    map1.put("sAdultPrice","市场成人价");
    map1.put("sChildPrice","市场小童价");
    map1.put("adultPrice","同行成人价");
    map1.put("childPrice","同行小童价");
    map1.put("remark","备注");
    File f= new File("C:/Users/Administrator/Desktop/test.xls");
    OutputStream out = new FileOutputStream(f);
    ExcelUtil.exportExcel(map1,list, out );
    out.close();
  }
}
