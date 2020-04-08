package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/2/21 01:20
 */
@TableName(value = "oauth")
public class OAuthEntity {
  private Integer id;
  private Long userId;
  private String OAuthName;
  private String OAuthId;
  private String OAuthAccessToken;
  private String OAuthExpires;

  @TableLogic
  @TableField(select = false)
  private Boolean isActive;
}
