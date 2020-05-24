package szx.phone_admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_role")
public class Role {

  private String roleId;
  private String roleName;
  private String roleDesc;
  private long roleOrder;
  private long roleType;



}
