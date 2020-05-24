package szx.phone_admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import szx.phone_admin.entity.ModuleTreeNode;
import szx.phone_admin.entity.Module;

import java.util.List;

public interface


IModuleService extends IService<Module> {
    /**
     * 通过用户名查询两级模块菜单
     * @param account
     * @return
     */
    List<ModuleTreeNode> getModuleTreeNodeByAccount(String account);
    List<ModuleTreeNode> getModuleTreeNodeByRoleName(String roleName);
}
