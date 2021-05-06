package com.dengmin.demi.reflect;
class userService {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Result login(String name, String password) {
        if("admin".equals(name) && "1234.".equals(password)) {
            return Result.登录成功;
        }
        return Result.登录失败;
    }
}
enum Result {
    登录成功, 登录失败;
}