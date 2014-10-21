package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

  @Override
  public void save () {
    System.out.println ("save in oracle DB!");
  }

}
