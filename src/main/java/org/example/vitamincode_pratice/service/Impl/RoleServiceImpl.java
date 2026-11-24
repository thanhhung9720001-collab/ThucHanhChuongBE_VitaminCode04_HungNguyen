package org.example.vitamincode_pratice.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.vitamincode_pratice.entity.RoleEntity;
import org.example.vitamincode_pratice.mapper.RoleMapper;
import org.example.vitamincode_pratice.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleMapper roleMapper;


    public List<RoleEntity> getAllRoles() {
        return roleMapper.selectAllRoles();
    }

    public List<RoleEntity> getRoleByName(String roleName) {
        if(roleName == null) {
            throw new RuntimeException("Role name is null");
        }
        return roleMapper.selectRoleByName(roleName);
    }

    public RoleEntity insertRole(RoleEntity roleEntity) {
        int result = roleMapper.insertRole(roleEntity);
        if(result > 0) {
            return roleEntity;
        }
        throw new RuntimeException("Tạo role thất bại");
    }

    public RoleEntity updateRole(RoleEntity roleEntity) {
        if (roleEntity.getId()==null){
            throw new RuntimeException("Không thể cập nhập - vì Role ID null");
        }
        int result = roleMapper.updateRole(roleEntity);
        if(result > 0) {
            return roleEntity;
        }
        return roleEntity;
    }

    public int deleteRole(int roleId){
        if (roleId==0) {
            throw new RuntimeException("Không thể xóa - vì Role ID null");
        }
        return roleMapper.deleteRole(roleId);
    }
}
