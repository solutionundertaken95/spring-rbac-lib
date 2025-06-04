package com.yourcompany.rbac;

import java.util.*;

public class RbacPermissionEvaluator {

    private final Map<String, Set<String>> rolePermissions = Map.of(
            "ADMIN", Set.of("READ", "WRITE", "DELETE"),
            "USER", Set.of("READ")
    );

    public boolean hasPermission(String role, String permission) {
        return rolePermissions.getOrDefault(role, Collections.emptySet())
                .contains(permission.toUpperCase());
    }
}
