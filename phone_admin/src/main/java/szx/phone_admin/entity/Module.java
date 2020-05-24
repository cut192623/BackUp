package szx.phone_admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_module")
public class Module {

  private String moduleId;
  private String moduleCode;
  private String moduleName;
  private String linkUrl;
  private long moduleOrder;
  private String parentModule;
  private String moduleDesc;
  private String expanded;
  private String leaf;



}
