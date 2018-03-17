package io.github.isliqian.service.impl;


import io.github.isliqian.bean.Userlogin;
import io.github.isliqian.dao.IUserloginDao;
import io.github.isliqian.service.IUserloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiQian_Nice on 2018/2/19
 *
 * 维护用户登陆接口的实现类
 */
@Service("userloginService")
public class UserloginServiceImpl implements IUserloginService {

    @Resource
    private IUserloginDao userloginDao;


    public List<Userlogin> findAll() {
        return userloginDao.findAll();
    }

    public void add(Userlogin userlogin) {
        userloginDao.add(userlogin);
    }

    public Userlogin findById(String id) {
        return userloginDao.findById(id);
    }

    public void delete(String id) {
        userloginDao.delete(id);
    }

    public List<Userlogin> findAllByType(String type) {
        return userloginDao.findAllByType(type);
    }

    public String getTypeById(String id) {
        return userloginDao.getTypeById(id);
    }

    public void update(Userlogin userlogin) {
        userloginDao.update(userlogin);
    }

    public Userlogin doUserLogin(Userlogin userLogin) {
        return userloginDao.doUserLogin(userLogin);
    }
}
