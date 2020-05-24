package szx.phone_admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user_role")
public class UserRole {
  @TableId(type = IdType.INPUT)
  private long id;
  private String userId;
  private String roleId;



}
