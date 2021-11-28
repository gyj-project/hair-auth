package cn.bzu.persistence;






import cn.bzu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * (User)表Mapper接口
 *
 * @author 高玉津
 * @since 2020-04-14 14:00:34
 */

public interface UserMapper  {

    User selectUserByCode(@Param("userName") String userName);


}