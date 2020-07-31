package cn.sy.service.imp;

import cn.sy.pojo.UserAddress;
import cn.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.FaultAction;
import java.util.List;

@Service
public class OrderServiceImp {
    @Autowired
    private UserService userService;

    public void createOrders(){
        List<UserAddress> userAddressList = userService.getUserAddressList("66");
        System.out.println(userAddressList.get(0));
    }
}
