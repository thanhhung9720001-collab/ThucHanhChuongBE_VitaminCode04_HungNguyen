package org.example.vitamincode_pratice.service;

import org.example.vitamincode_pratice.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity> getAllRoles();
    RoleEntity insertRole(RoleEntity roleEntity);
    RoleEntity updateRole(RoleEntity roleEntity);
    int deleteRole(int roleId);
}