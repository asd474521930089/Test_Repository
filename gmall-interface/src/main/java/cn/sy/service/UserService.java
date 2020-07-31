package cn.sy.service;

import cn.sy.pojo.UserAddress;
import java.util.List;

public interface UserService{
    public List<UserAddress> getUserAddressList(String userId);
}
