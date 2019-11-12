package org.launchcode.upblogz.Models.Data;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {
}
