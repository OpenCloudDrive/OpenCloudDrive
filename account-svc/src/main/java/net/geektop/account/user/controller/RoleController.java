package net.geektop.account.user.controller;

import net.geektop.account.user.model.entity.RoleEntity;
import net.geektop.web.model.ApiResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.controller
 * @date 2020/3/27 03:08
 */
@RestController
@RequestMapping("/role")
public class RoleController {
  @PostMapping
  public ApiResult addRole(@RequestBody @Validated RoleEntity roleEntity) {
    return null;
  }

  @GetMapping
  public ApiResult getRoles(@RequestParam(value = "Id", required = false) Long Id,
                            @RequestParam(value = "name", required = false) String name) {
    return null;
  }

}
