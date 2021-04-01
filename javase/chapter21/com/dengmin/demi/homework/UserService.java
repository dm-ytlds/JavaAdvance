package com.dengmin.demi.homework;

/**
 * 写注释很重要
 */
public class UserService {
    /**
     *
     * @param name 用户名
     * @param passwd 密码
     * @throws UsernameException 当同户名不合法时，会返回相应的异常信息
     */
    public void register(String name, String passwd) throws UsernameException {
        // name == null不如写成 null == name
        if(null == name || name.length() < 6 || name.length() > 14) {
            throw new UsernameException("您输入的用户名违规，用户名长度必须在[6,14]之间");
        }
        System.out.println("用户" + name + "注册成功");
    }
}
