package net.geektop.account.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.constant
 * @date 2020/3/28 17:30
 */
@Getter
@AllArgsConstructor
public enum Gender {
  MAN(0, "Man"),
  WOMAN(1, "Woman"),
  UNKNOWN(2, "unknown");

  @EnumValue
  private Integer value;
  private String description;
}
