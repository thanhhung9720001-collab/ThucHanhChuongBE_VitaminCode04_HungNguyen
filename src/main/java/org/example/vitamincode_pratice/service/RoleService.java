package org.example.vitamincode_pratice.service;

import org.example.vitamincode_pratice.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity> getAllRoles();
    List<RoleEntity> getRoleByName(String roleName);
    RoleEntity insertRole(RoleEntity roleEntity);
    RoleEntity updateRole(RoleEntity roleEntity);
    int deleteRole(int roleId);
}