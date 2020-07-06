package com.KHRacer.KSHRD.Repository.Provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
    public String getUserByIDSQL(){
        return new SQL(){{
            SELECT("*");
            FROM("finalproject.user");
            WHERE("user_id=#{id}");
        }}.toString();
    }
}
