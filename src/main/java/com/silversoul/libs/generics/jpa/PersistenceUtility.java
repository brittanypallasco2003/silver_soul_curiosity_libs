package com.silversoul.libs.generics.jpa;


import java.time.OffsetDateTime;

import com.silversoul.libs.core.domain.BaseModel;
import com.silversoul.libs.core.enums.StatusEnum;

public class PersistenceUtility {

    public static <T extends BaseModel> void softDelete(T entity){
        entity.setStatus(StatusEnum.DEPRECATED);
        entity.setDeletedAt(OffsetDateTime.now());
    }
}
