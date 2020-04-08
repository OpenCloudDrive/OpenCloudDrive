package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.geektop.account.constant.Gender;

import java.time.LocalDateTime;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/1/13 23:55
 */
@Data
@TableName(value = "sys_user")
public class UserEntity {
  private Long id;
  private String name;
  private String nickName;
  private String email;
  private String telephone;
  private LocalDateTime birthday;
  private Gender gender;
  private String timezone;
  private String language;

  @TableLogic
  @TableField(select = false)
  private Boolean isActive;
}
