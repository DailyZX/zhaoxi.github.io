package com.zhaoxi.pojo;

/**
 * @author shkstart
 * @create2021-01-2110:45
 */
public class Department {
    //部门名字和id
    private String departmentName;
    private Integer id;

    public Department(Integer id,String departmentName ) {
        this.departmentName = departmentName;
        this.id = id;
    }

    public Department() {
    }



    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", id=" + id +
                '}';
    }
}
