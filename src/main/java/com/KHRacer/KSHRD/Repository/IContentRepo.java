package com.KHRacer.KSHRD.Repository;

import com.KHRacer.KSHRD.Model.KHContentModel;
import com.KHRacer.KSHRD.Model.TypingContentModel;
import com.KHRacer.KSHRD.Repository.Provider.ContentProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IContentRepo {

    @SelectProvider(value = ContentProvider.class,method = "SelectRandomContentSQL")
    @Result(column = "content_id",property = "id")
    @Result(column = "kh_content",property = "khContent")
    @Result(column = "content_title",property = "title")
    @Result(column = "content_description",property = "description")
    @Result(column = "content_author",property = "author")
    TypingContentModel selectRandomContent();

    @InsertProvider(value = ContentProvider.class, method = "InsertContentSQL")
    boolean InsertContent(TypingContentModel typingContentModel);

    @DeleteProvider(value = ContentProvider.class, method="DeleteContentSQL")
    boolean DeleteContent(int id);

    @UpdateProvider(value = ContentProvider.class,method = "UpdateKHContentSQL")
    boolean UpdateKHContent(KHContentModel khContentModel);
}
