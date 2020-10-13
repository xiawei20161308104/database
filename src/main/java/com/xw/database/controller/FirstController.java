package com.xw.database.controller;


import com.xw.database.bean.InsertRoleParam;
import com.xw.database.bean.Menu;
import com.xw.database.bean.Privilege;
import com.xw.database.bean.RolePrivilege;
import com.xw.database.mapper.MenuMapper;
import com.xw.database.mapper.PrivilegeMapper;
import com.xw.database.mapper.RolePrivilegeMapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  private static final Long www = 104l;
  @Autowired
  MenuMapper menuMapper;
  @Autowired
  PrivilegeMapper privilegeMapper;
  @Autowired
  RolePrivilegeMapper rolePrivilegeMapper;

  @GetMapping("/")
  public void test2() {

    InsertRoleParam param=new InsertRoleParam();
    param.setName("c系统订单配送单");
    param.setOrderIndex(4.9);
    param.setPrivilegeFlag("menu.sale.systemcOrderDelivery");
    param.setUrl("systemc-order-delivery.html");
    Menu menu=new Menu();
    menu.setCode("TDSMNU"+creatCode());
    System.out.println("---------------"+"TDSMNU"+creatCode());
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
    Privilege privilege=new Privilege();
    privilege.setCode(privilegeCode);
    privilege.setCreateTime(new Date());
    privilege.setCreator("TRSSTF00000000000001");
    privilege.setUpdateTime(new Date());
    privilege.setUpdater("TRSSTF00000000000001");
    privilege.setValid(true);
    privilege.setVersion(0);
    privilege.setDescription(param.getName()+"页面");
    privilege.setFlag(param.getPrivilegeFlag()+".show");
    privilege.setType(0);
    privilegeMapper.insert(privilege);
    RolePrivilege rolePrivilege=new RolePrivilege();
    rolePrivilege.setCode("TRSRAP"+creatCode());
    rolePrivilege.setCreateTime(new Date());
    rolePrivilege.setCreator("TRSSTF00000000000001");
    rolePrivilege.setUpdateTime(new Date());
    rolePrivilege.setUpdater("TRSSTF00000000000001");
    rolePrivilege.setValid(true);
    rolePrivilege.setVersion(0);
    rolePrivilege.setPrivilegeCode(privilegeCode);
    rolePrivilege.setRoleCode("TDSROL00000000000001");
    rolePrivilege.setRoleCompanyCode(null);
    rolePrivilegeMapper.insert(rolePrivilege);
  }


  @PostMapping("/insert")
  @Transactional(rollbackFor = Exception.class)
  public void insertToDatabase(@RequestBody InsertRoleParam param) {
//    menuMapper.selectByPrimaryKey(25l);
//    System.out.println(menuMapper.selectByPrimaryKey(25l));
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
    Privilege privilege=new Privilege();
    privilege.setCode(privilegeCode);
    privilege.setCreateTime(new Date());
    privilege.setCreator("TRSSTF00000000000001");
    privilege.setUpdateTime(new Date());
    privilege.setUpdater("TRSSTF00000000000001");
    privilege.setValid(true);
    privilege.setVersion(0);
    privilege.setDescription(param.getName()+"页面");
    privilege.setFlag(param.getPrivilegeFlag()+".show");
    privilege.setType(0);
    privilegeMapper.insert(privilege);
    RolePrivilege rolePrivilege=new RolePrivilege();
    rolePrivilege.setCode("TRSRAP"+creatCode());
    rolePrivilege.setCreateTime(new Date());
    rolePrivilege.setCreator("TRSSTF00000000000001");
    rolePrivilege.setUpdateTime(new Date());
    rolePrivilege.setUpdater("TRSSTF00000000000001");
    rolePrivilege.setValid(true);
    rolePrivilege.setVersion(0);
    rolePrivilege.setPrivilegeCode(privilegeCode);
    //TODO:
    rolePrivilege.setRoleCode("TDSROL00000000000001");
    rolePrivilege.setRoleCompanyCode(null);

  }

  public String creatCode(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddHHmmssSSS");
    String timeStamp = simpleDateFormat.format(new Date());
    int max=1000,min=1;
    long randomNum = System.currentTimeMillis();
    int ran3 = (int) (randomNum%(max-min)+min);
    System.out.println(ran3+timeStamp);
    return ran3+timeStamp;
  }






}
