package cn.bzu.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description (user)表实体类
 * @author 高玉津
 * @date 2020-04-14 21:07:55
 */
 
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     id
     */
    private Long id;
    /**
      用户名 
    */
    private String userName;
    
    /**
      用户密码 
    */
    private String userPassword;
    
    /**
      用户性别  “1” 男，“2” 女 
    */
    private String gender;
    
    /**
      用户手机 
    */
    private String phone;
    
    /**
      用户邮箱 
    */
    private String email;
    
    /**
      用户生日 
    */
    private Date birthday;
    
    /**
      删除标识，0未删除，1已删除 
    */
    private Integer isDeleted;
    
}