package com.edu.common.code.Enum;

public enum OrderByType {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private OrderByType(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value.toUpperCase();
        }

        public boolean isReverse() {
            return this == DESC;
        }
    }

