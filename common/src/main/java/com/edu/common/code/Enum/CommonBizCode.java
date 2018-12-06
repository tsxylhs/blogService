package com.edu.common.code.Enum;

public enum CommonBizCode  implements Enumeratablecode{
    PARAMS_INVALID("params_invalid"),
    PARAM_BAD_FORMAT("param_bad_format"),
    PARAM_EMPTY("param_empty"),
    RIGHT_INSUFFICIENT("right_insufficient"),
    NOT_FOUND("not_found"),
    NOT_MATCH("not_match"),
    EXPIRED("expired");

    private String code;

    private CommonBizCode(String code) {
        this.code = code;
    }

    public String val() {
        return this.code;
    }
}
