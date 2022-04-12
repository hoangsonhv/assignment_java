package com.example.assignment.entity;

import java.time.LocalDateTime;

public class Account {

    private String username;
    private String fullName;
    private String passwordHash;
    private String salt;
    private String createAt;
    private int status;
    private int failureCount;
    private int role;
    private LocalDateTime lockTime;


    public Account() {
    }

    public Account(String userName, String fullName, String passwordHash, String salt, String createAt, int status, int failureCount, LocalDateTime lockTime) {
        this.username = userName;
        this.fullName = fullName;
        this.passwordHash = passwordHash;
        this.salt = salt;
        this.createAt = createAt;
        this.status = status;
        this.failureCount = failureCount;
        this.lockTime = lockTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", createAt='" + createAt + '\'' +
                ", status=" + status +
                ", failureCount=" + failureCount +
                ", lockTime=" + lockTime +
                '}';
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }

    public LocalDateTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
