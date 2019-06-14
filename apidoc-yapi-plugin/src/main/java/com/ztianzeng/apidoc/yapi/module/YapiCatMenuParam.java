package com.ztianzeng.apidoc.yapi.module;


import com.ztianzeng.apidoc.yapi.constant.YapiConstant;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * 新增菜单
 *
 * @author chengsheng@qbb6.com
 * @date 2019/2/1 10:44 AM
 */
public class YapiCatMenuParam implements Serializable {
    /**
     * 描述
     */
    private String desc = "工具上传临时文件夹";
    /**
     * 名字
     */
    private String name;
    /**
     * 项目id
     */
    private String project_id;
    /**
     * token
     */
    private String token;


    public YapiCatMenuParam() {
    }

    public YapiCatMenuParam(String desc, String name, String project_id, String token) {
        this.desc = desc;
        this.name = name;
        this.project_id = project_id;
        this.token = token;
    }

    public YapiCatMenuParam(String project_id, String token) {
        this.project_id = project_id;
        this.token = token;
    }

    public YapiCatMenuParam(String name, String project_id, String token) {
        this.name = name;
        this.project_id = project_id;
        this.token = token;
        if (StringUtils.isEmpty(name)) {
            this.name = YapiConstant.menu;
        }
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
