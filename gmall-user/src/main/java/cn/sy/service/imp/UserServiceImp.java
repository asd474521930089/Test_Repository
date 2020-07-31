package cn.sy.service.imp;

import cn.sy.pojo.UserAddress;
import cn.sy.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress=new UserAddress(1,"苏州",userId,"苏州","苏州","苏州");
        List<UserAddress> userAddresses=new ArrayList<UserAddress>();
        userAddresses.add(userAddress);
        return userAddresses;
    }

}

