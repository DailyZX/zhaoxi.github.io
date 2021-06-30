package com.zhaoxi.AjaxController;

import com.zhaoxi.dao.EmployeeDao;
import com.zhaoxi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author shkstart
 * @create2021-01-249:25
 */
//获取一下所有的员工信息
@Controller
public class ajaxController   {
    @Autowired
    private EmployeeDao employeeDao;

    //处理所有员工信息
    @ResponseBody
    @RequestMapping("/getallajax")
    public Collection<Employee> getAjax(){
        Collection<Employee> all = employeeDao.getAll();
        return all;
    }
}
