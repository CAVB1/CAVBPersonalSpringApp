package com.cavb.CAVBPersonalApp.DAO;

import com.cavb.CAVBPersonalApp.ML.Result;
import com.cavb.CAVBPersonalApp.ML.User;

public interface UserDAO {
    Result GetAllJPA();
    Result AddJPA(User user);
}
