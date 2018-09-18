package com.edu.common.code.error;

import com.edu.common.code.Enum.Enumeratablecode;

import java.io.Serializable;

/**
 * @ClassName BizError
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-18
 **/
public class BizError<T>  implements Serializable {
    private String code;
    private String message;
    private T data;

    public BizError(String code) {
        this.code = code;
    }

    public BizError(Enumeratablecode enumeratableCode) {
        this.code = enumeratableCode.val();
    }

    public BizError(Enumeratablecode enumeratableCode, String message) {
        this.code = enumeratableCode.val();
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BizError)) {
            return false;
        } else {
            BizError<?> other = (BizError)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BizError;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "BizError(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    public BizError() {
    }

    public BizError(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
