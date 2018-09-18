package com.edu.common.code.error;

import com.edu.common.code.Enum.CommonBizCode;
import com.edu.common.code.Enum.Enumeratablecode;

/**
 * @ClassName ParamError
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-18
 **/
public class ParamError extends BizError {
    public static final String ROOT = "_root";
    private String resource;
    private String field;

    public ParamError(String resource, String field, Enumeratablecode code) {
        super(code);
        this.resource = resource;
        this.field = field;
    }

    public ParamError(String field, Enumeratablecode code) {
        this((String)null, field, code);
    }

    public static ParamError empty(String field) {
        return new ParamError(field, CommonBizCode.PARAM_EMPTY);
    }

    public static ParamError empty(String resource, String field) {
        return new ParamError(resource, field, CommonBizCode.PARAM_EMPTY);
    }

    public static ParamError badFormat(String resource, String field) {
        return new ParamError(resource, field, CommonBizCode.PARAM_BAD_FORMAT);
    }

    public static ParamError badFormat(String field) {
        return new ParamError(field, CommonBizCode.PARAM_BAD_FORMAT);
    }

    public String getResource() {
        return this.resource;
    }

    public String getField() {
        return this.field;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ParamError)) {
            return false;
        } else {
            ParamError other = (ParamError)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$resource = this.getResource();
                Object other$resource = other.getResource();
                if (this$resource == null) {
                    if (other$resource != null) {
                        return false;
                    }
                } else if (!this$resource.equals(other$resource)) {
                    return false;
                }

                Object this$field = this.getField();
                Object other$field = other.getField();
                if (this$field == null) {
                    if (other$field != null) {
                        return false;
                    }
                } else if (!this$field.equals(other$field)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ParamError;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $resource = this.getResource();
         result = result * 59 + ($resource == null ? 43 : $resource.hashCode());
        Object $field = this.getField();
        result = result * 59 + ($field == null ? 43 : $field.hashCode());
        return result;
    }

    public String toString() {
        return "ParamError(resource=" + this.getResource() + ", field=" + this.getField() + ")";
    }

    public ParamError(String resource, String field) {
        this.resource = resource;
        this.field = field;
    }
}
