package com.example.demo3.Service;

import com.example.demo3.Pojo.Organization;

import java.util.List;

public interface OrganizationService {
    /**
     * 添加机构
     * @param organization
     * @return
     */
    int Insert_O(Organization organization);
    /**
     * 查询
     * @param organization
     * @return
     */
    List<Organization> Select_O(Organization organization);
    /**
     * 删除
     * @param organization
     * @return
     */
    int Delete_O(Organization organization);
    /**
     * 修改
     * @param organization
     * @return
     */
    int Update_O(Organization organization);
}
