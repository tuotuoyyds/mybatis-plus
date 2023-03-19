package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("acl_user")
public class User {

  private long id;
  private String username;
  private String password;
  private String nickName;
  private String avatar;
  private String phone;
  private String token;
  private long isDeleted;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModified;




}
