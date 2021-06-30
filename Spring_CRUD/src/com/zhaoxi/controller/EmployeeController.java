package com.zhaoxi.controller;

import com.zhaoxi.dao.DepartmentDao;
import com.zhaoxi.dao.EmployeeDao;
import com.zhaoxi.pojo.Department;
import com.zhaoxi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author shkstart
 * @create2021-01-2111:52
 */
@Controller
public class EmployeeController {
    //调用底层DAO,使用Autowired注解实现自动注入
    @Autowired
     private EmployeeDao employeeDao;
    @Autowired
     private DepartmentDao departmentDao;
    //处理展示列表请求
    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "list";
    }

    //处理删除请求
    @RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
    public String deleteEmp(@PathVariable("id")Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

    //处理添加员工前将所有的部门名查询出来,进行展示
    public String getDepartment(Model model){
        //查询部门
        Collection<Department> departments = departmentDao.getDepartments();
        //将查询出的部门名添加在请求域中
        model.addAttribute("depts",departments);
        //返回到添加页面
        return "add";
    }

    //modelAttribute用于add页面的回显
    public void myModelAttribute(
            @RequestParam(value = "id",required = false)Integer id,Model model
    ){
        if(id==null){
            Employee employee = employeeDao.get(id);
            model.addAttribute("employee",employeeDao);
        }
    }


    //处理
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.PUT)
    public String updateEmp(@ModelAttribute("employee")Employee employee/* ,@PathVariable("id")Integer id */) {
        System.out.println("要修改的员工：" + employee);
        // xxxx 更新保存二合一；
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}
