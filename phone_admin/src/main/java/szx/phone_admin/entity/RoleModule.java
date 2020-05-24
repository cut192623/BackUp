package szx.phone_admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_role_module")
public class RoleModule {
  @TableId(type = IdType.INPUT)
  private long id;
  private String moduleId;
  private String roleId;




}
