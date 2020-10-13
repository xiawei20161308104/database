package com.xw.database;

import com.xw.database.bean.InsertRoleParam;
import com.xw.database.bean.Menu;
import com.xw.database.mapper.MenuMapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatabaseApplication.class)
class DatabaseApplicationTests {
  @Autowired
  MenuMapper menuMapper;

  @Test
  void contextLoads() {
//    double b=4.9;
//    System.out.println((int)b);
//    String parentCode=menuMapper.selectByParentCode(4);
//    System.out.println(parentCode);

   InsertRoleParam param=new InsertRoleParam();
    param.setName("c系统订单配送单");
    param.setOrderIndex(4.9);
    param.setPrivilegeFlag("menu.sale.systemcOrderDelivery");
    param.setUrl("systemc-order-delivery.html");
    Menu menu=new Menu();
    menu.setCode("TDSMNU"+creatCode());
    menu.setName(param.getName());
    menu.setCreateTime(new Date());
    menu.setUpdateTime(new Date());
    menu.setValid(true);
    menu.setVersion(0);
    menu.setLevel(1);
    //请确定您的顺序索引，将会自动添加父级Code
    menu.setOrderIndex(param.getOrderIndex());
    int parentIndex=(int) param.getOrderIndex().doubleValue();
    String parentCode=menuMapper.selectByParentCode(Double.valueOf(parentIndex));
    menu.setParentCode(parentCode);
    String privilegeCode="TDSPRV"+creatCode();
    menu.setPrivilegeCode(privilegeCode);
    menu.setPrivilegeFlag(param.getPrivilegeFlag());
    menu.setUrl(param.getUrl());
    menuMapper.insert(menu);

  }
@Test
void test1(){
  menuMapper.selectByPrimaryKey(25l);
  System.out.println(menuMapper.selectByPrimaryKey(25l));
}
  String creatCode(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddHHmmssSSS");
    String timeStamp = simpleDateFormat.format(new Date());
    int max=10000,min=1;
    long randomNum = System.currentTimeMillis();
    int ran3 = (int) (randomNum%(max-min)+min);
    System.out.println(ran3+timeStamp);
    return ran3+timeStamp;
  }

}
