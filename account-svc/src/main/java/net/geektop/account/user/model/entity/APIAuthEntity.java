package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/2/21 01:21
 */
@TableName(value = "api_auth")
public class APIAuthEntity {
  private Integer id;
  private Long userId;
  private String apiKey;
  private String apiSecret;

  @TableLogic
  @TableField(select = false)
  private Boolean isActive;
}
