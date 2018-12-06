package com.edu.common.code.model;

import com.edu.common.code.Enum.Enumeratablecode;
import com.edu.common.code.error.BizError;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Errors
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-19
 **/
public class Errors extends BizError {
    private List<BizError> errors;

    public Errors(Enumeratablecode code, String message) {
        super(code, message);
    }

    public Errors(Enumeratablecode code) {
        this(code, (String)null);
    }

    public Errors add(BizError error) {
        if (this.errors == null) {
            this.errors = new ArrayList();
        }

        this.errors.add(error);
        return this;
    }

    public boolean hasError() {
        return this.errors != null && this.errors.size() > 0;
    }

    public List<BizError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<BizError> errors) {
        this.errors = errors;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Errors)) {
            return false;
        } else {
            Errors other = (Errors)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$errors = this.getErrors();
                Object other$errors = other.getErrors();
                if (this$errors == null) {
                    if (other$errors != null) {
                        return false;
                    }
                } else if (!this$errors.equals(other$errors)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Errors;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $errors = this.getErrors();
         result = result * 59 + ($errors == null ? 43 : $errors.hashCode());
        return result;
    }

    public String toString() {
        return "Errors(errors=" + this.getErrors() + ")";
    }
}
