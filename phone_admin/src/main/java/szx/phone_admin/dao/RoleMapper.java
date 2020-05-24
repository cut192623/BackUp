package szx.phone_admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import szx.phone_admin.entity.Role;

import java.util.List;

/*
*
* */
public interface RoleMapper extends BaseMapper<Role> {
    //通过登陆的账号查询角色
    List<Role> selectRoleByAccount( String account);
}
