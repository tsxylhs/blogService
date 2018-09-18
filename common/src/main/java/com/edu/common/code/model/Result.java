package com.edu.common.code.model;

import com.edu.common.code.Enum.CommonBizCode;
import com.edu.common.code.error.BizError;
import com.edu.common.code.error.ParamError;
import com.edu.common.code.error.ParamErrors;
import com.edu.common.code.page.PageData;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Result
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-19
 **/

public class Result implements Serializable {
    private boolean ok;
    private BizError error;
    private Object data;
    private PageData pager;

    public Result(boolean ok) {
        this.ok = ok;
    }

    public Result(boolean ok, Object data, BizError error) {
        this.ok = ok;
        this.data = data;
        this.error = error;
    }

    public Result(boolean ok, Object data, PageData pager, BizError error) {
        this.ok = ok;
        this.data = data;
        this.pager = pager;
        this.error = error;
    }

    public Result put(String key, Object value) {
        if (this.data != null) {
            if (!(this.data instanceof Map)) {
                throw new ResultStructureError();
            }
        } else {
            this.data = new HashMap();
        }

        ((Map)this.data).put(key, value);
        return this;
    }

    public Result data(Object data) {
        this.data = data;
        return this;
    }

    public Result data(PageData pager, Object data) {
        this.pager = pager;
        this.data = data;
        return this;
    }

    public static Result ok() {
        return new Result(true);
    }

    public static Result ok(Object data) {
        return new Result(true, data, (BizError)null);
    }

    public static Result ok(PageData pager, Object data) {
        return new Result(true, data, pager, (BizError)null);
    }

    public static Result ok(String key, Object value) {
        Map map = new HashMap();
        return new Result(true, map, (BizError)null);
    }

    public static Result failure(BizError error) {
        Result result = new Result(false);
        result.setError(error);
        return result;
    }

    public static Result notFound() {
        return failure(new BizError(CommonBizCode.NOT_FOUND));
    }

    public static Result paramEmpty(String resource, String field) {
        return failure((new ParamErrors(resource)).add(ParamError.empty(field)));
    }

    public static Result paramBadFormat(String resource, String field) {
        return failure((new ParamErrors(resource)).add(ParamError.badFormat(field)));
    }

    public Integer integer(String key) {
        return this.data instanceof Map ? (Integer)((Map)this.data).get(key) : null;
    }

    public boolean isOk() {
        return this.ok;
    }

    public BizError getError() {
        return this.error;
    }

    public Object getData() {
        return this.data;
    }

    public PageData getPager() {
        return this.pager;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setError(BizError error) {
        this.error = error;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setPager(PageData pager) {
        this.pager = pager;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Result)) {
            return false;
        } else {
            Result other = (Result)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.isOk() != other.isOk()) {
                return false;
            } else {
                label49: {
                    Object this$error = this.getError();
                    Object other$error = other.getError();
                    if (this$error == null) {
                        if (other$error == null) {
                            break label49;
                        }
                    } else if (this$error.equals(other$error)) {
                        break label49;
                    }

                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                Object this$pager = this.getPager();
                Object other$pager = other.getPager();
                if (this$pager == null) {
                    if (other$pager != null) {
                        return false;
                    }
                } else if (!this$pager.equals(other$pager)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Result;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + (this.isOk() ? 79 : 97);
        Object $error = this.getError();
        result = result * 59 + ($error == null ? 43 : $error.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $pager = this.getPager();
        result = result * 59 + ($pager == null ? 43 : $pager.hashCode());
        return result;
    }

    public String toString() {
        return "Result(ok=" + this.isOk() + ", error=" + this.getError() + ", data=" + this.getData() + ", pager=" + this.getPager() + ")";
    }

    public Result() {
    }
}

