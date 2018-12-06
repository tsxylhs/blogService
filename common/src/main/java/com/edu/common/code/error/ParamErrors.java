package com.edu.common.code.error;

import com.edu.common.code.Enum.CommonBizCode;
import com.edu.common.code.model.Errors;
import org.springframework.util.StringUtils;


/**
 * @ClassName ParamErrors
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-19
 **/
public class ParamErrors  extends Errors {
    private String resource;

    public ParamErrors() {
        this((String)null);
    }

    public ParamErrors(String resource) {
        super(CommonBizCode.PARAMS_INVALID);
        this.resource = resource;
    }

    public ParamErrors addIfEmpty(String resource, String field, Object value) {
        if (value == null || value instanceof String && StringUtils.isEmpty((String)value)) {
            this.add(ParamError.empty(resource, field));
        }

        return this;
    }

    public ParamErrors addIfEmpty(String field, Object value) {
        return this.addIfEmpty((String)null, field, value);
    }
}
