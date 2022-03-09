package com.example.springsecurityapi.enums;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springsecurityapi.enums.UserPermission.*;

public enum UserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE));

    private final Set<UserPermission> userPermission;

    UserRole(Set<UserPermission> userPermission) {
        this.userPermission = userPermission;
    }

    public Set<UserPermission> getUserPermission() {
        return userPermission;
    }
}
