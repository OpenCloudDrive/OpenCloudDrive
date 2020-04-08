package net.geektop.account.user.controller;

import lombok.extern.slf4j.Slf4j;
import net.geektop.account.dto.UserInfoDTO;
import net.geektop.account.user.service.IUserService;
import net.geektop.web.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.controller
 * @date 2020/1/17 17:09
 */
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {
  private IUserService userService;

  @Autowired
  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @PostMapping("/add")
  public boolean addUser(@RequestBody UserInfoDTO userInfoDTO) {
    log.info("Call add user");
    return userService.addUser(userInfoDTO);
  }

  @GetMapping("/checkName")
  public ApiResult checkName() {
    return null;
  }

  @GetMapping("/{userId}")
  public String getUserDetail(@PathVariable Long userId) {
    log.info("Get user with id: {}", userId);
    return "123";
  }
}
