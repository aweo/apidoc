package com.ztianzeng.apidoc.model;

import com.ztianzeng.apidoc.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 参数实体
 *
 * @author zhaotianzeng
 * @version V1.0
 * @date 2019-06-05 13:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parameters {
    /**
     * 是否必须
     */
    private boolean required;

    /**
     * 字段名
     */
    private String name;

    /**
     * 字段描述
     */
    private String description;

    /**
     * 字段类型
     */
    private String type;

    public static Parameters.ParametersBuilder builder(){
        return new Parameters.ParametersBuilder();
    }



}