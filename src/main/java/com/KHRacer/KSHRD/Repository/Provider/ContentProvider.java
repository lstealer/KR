package com.KHRacer.KSHRD.Repository.Provider;

import org.apache.ibatis.jdbc.SQL;

public class ContentProvider {
    public String SelectRandomContentSQL() {
        return new SQL() {
            {
                SELECT("*");
                FROM("finalproject.typing_content");
                ORDER_BY("random()");
                LIMIT(1);
            }
        }.toString();
    }
    public String InsertContentSQL(){
        return new SQL(){{
            INSERT_INTO("finalproject.typing_content");
            VALUES("kh_content","#{khContent}");
            VALUES("content_regex","#{regex}");
            VALUES("content_title","#{title}");
            VALUES("content_description","#{description}");
            VALUES("content_author","#{author}");
        }}.toString();
    }
    public String DeleteContentSQL(){
        return new SQL(){{
            DELETE_FROM("finalproject.typing_content");
            WHERE("content_id=#{id}");
        }}.toString();
    }
    public String UpdateKHContentSQL(){
        return new SQL(){{
            UPDATE("finalproject.typing_content");
            SET("kh_content=#{khContent}");
            WHERE("content_id=#{id}");
        }}.toString();
    }
}
