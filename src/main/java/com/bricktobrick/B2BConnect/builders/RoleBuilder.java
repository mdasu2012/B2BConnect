package com.bricktobrick.B2BConnect.builders;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.entity.Role;
@Component
public class RoleBuilder {

	public Role updatedRole(Role existingRole, Role newRole) {
		existingRole.setDescription(newRole.getDescription());
		existingRole.setId(newRole.getId());
		existingRole.setRoleDisplayName(newRole.getRoleDisplayName());
		existingRole.setRoleName(newRole.getRoleName());

		return existingRole;

	}
}
