package com.ygy.config;

import com.ygy.model.SysRole;
import com.ygy.model.Sysuser;
import com.ygy.service.UserDao;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ygy 17/12/4
 * 用于将用户权限交给springsecurity进行管理
 */
public class CustomUserService implements UserDetailsService {
    @Autowired
    UserDao dao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Sysuser user=dao.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        List<SimpleGrantedAuthority> authorities=new ArrayList<SimpleGrantedAuthority>();
        //用于添加用户权限
        for(SysRole sysrole:user.getRoles()){
            authorities.add(new SimpleGrantedAuthority(sysrole.getName()));
            System.out.println(sysrole.getName());
        }
        return new User(user.getUsername(),user.getPassword(),authorities);

    }
}
