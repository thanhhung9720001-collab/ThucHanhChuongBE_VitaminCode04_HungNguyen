package org.example.vitamincode_pratice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.vitamincode_pratice.entity.RoleEntity;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<RoleEntity> selectAllRoles();
    List<RoleEntity> selectRoleByName(@Param("roleName") String roleName);
    int insertRole(RoleEntity roleEntity);
    int updateRole(RoleEntity roleEntity);
    int deleteRole(@Param("id") int roleId);
}
