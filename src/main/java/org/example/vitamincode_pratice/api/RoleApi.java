package org.example.vitamincode_pratice.api;


import lombok.RequiredArgsConstructor;
import org.apache.ibatis.jdbc.Null;
import org.example.vitamincode_pratice.entity.RoleEntity;
import org.example.vitamincode_pratice.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RoleApi {
    private final RoleService roleService;

    @GetMapping("/roles")
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("/roles/{roleName}")
    public ResponseEntity<List<RoleEntity>> getRoleByName(@PathVariable ("roleName") String roleName) {
        return ResponseEntity.ok(roleService.getRoleByName(roleName));
    }

    @PostMapping("/roles")
    public ResponseEntity<RoleEntity> insertRole(@RequestBody RoleEntity roleEntity) {
        RoleEntity savedRole =roleService.insertRole(roleEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRole);
    }

    @PutMapping("/roles")
    public Map<Object, RoleEntity> updateRole(@RequestBody RoleEntity roleEntity) {
        HashMap result = new HashMap();
        try{
            result.put("status", 200);
            result.put("message", "Call API thành công");
            result.put("data", roleService.updateRole(roleEntity));
        }catch(Exception e){
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("data", null);

        }
        return result;
    }

    @DeleteMapping("/roles/{roleId}")
    public Map<Object, RoleEntity> deleteRole(@PathVariable("roleId") int roleId) {
        HashMap result = new HashMap();
        try{
            result.put("status", 200);
            result.put("message", "Call API thành công");
            result.put("data", roleService.deleteRole(roleId));
        }catch(Exception e){
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("data", null);

        }
        return result;
    }
}
