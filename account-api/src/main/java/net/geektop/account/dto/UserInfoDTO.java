package net.geektop.account.dto;

import lombok.Getter;
import lombok.Setter;
import net.geektop.account.constant.Gender;

import java.time.LocalDateTime;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.dto
 * @date 2020/3/18 22:32
 */
@Getter
@Setter
public class UserInfoDTO {
  private Long id;
  private String name;
  private String password;
  private String nickName;
  private String email;
  private String telephone;
  private LocalDateTime birthday;
  private Gender gender;
  private String timezone;
  private String language;
}
