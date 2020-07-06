package com.KHRacer.KSHRD.Repository;

import com.KHRacer.KSHRD.Model.UserModel;
import com.KHRacer.KSHRD.Repository.Provider.UserProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo {
    @SelectProvider(value= UserProvider.class,method = "getUserByIDSQL")
    public UserModel getUserByID(int id);
}
