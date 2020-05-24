package szx.phone_admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import szx.phone_admin.dao.RoleMapper;
import szx.phone_admin.entity.Role;
import szx.phone_admin.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
