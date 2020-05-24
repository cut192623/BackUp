package szx.phone_admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
@TableId(type = IdType.INPUT)
  private String userId;
  private String userName;
  private String userLoginAccount;
  private String userLoginPwd;
  private String remark;
  private String userType;
  private String enabled;
  private String loginTime;
  private String roleId;
  private String userIcon;




}
