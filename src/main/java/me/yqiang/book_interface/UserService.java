package me.yqiang.book_interface;

import me.yqiang.book_pojo.User;
import me.yqiang.pojo.BResult;

public interface UserService {
    BResult addUser(User user);
    BResult login(String userName,String password);
    User findUser(Long userId);
    BResult changeAddress(Long userId,String address,String phone);
}
