package com.example.demo3.Service;

import com.example.demo3.Mapper.OrganizationMapper;
import com.example.demo3.Pojo.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl  implements  OrganizationService{
    @Autowired
    public OrganizationMapper organizationMapper;
    @Override
    public int Insert_O(Organization organization) {
        return organizationMapper.Insert_O(organization);
    }

    @Override
    public List<Organization> Select_O(Organization organization) {
        return organizationMapper.Select_O(organization);
    }

    @Override
    public int Delete_O(Organization organization) {
        return organizationMapper.Delete_O(organization);
    }

    @Override
    public int Update_O(Organization organization) {
        return organizationMapper.Update_O(organization);
    }
}
