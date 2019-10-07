package com.xuehaizi.sell.form;

import lombok.Data;

@Data
public class CategoryForm {

    private Integer categoryId;
    //    category_namevarchar(64) NOT NULL类目名字
    private String categoryName;
    //    category_typeint(11) NOT NULL类目编号
    private Integer categoryType;

}
