package com.edu.common.code.page;

import com.edu.common.code.Enum.OrderByType;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PageRequest
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-20
 **/
    public class PageRequest implements Serializable {
        private int totalCount;
        private int page;
        private int pageSize;
        private String orderBy;
        private OrderByType order;
        private Map<String, String> conditions;
        private transient int start;
        private transient int offset;

        public PageRequest() {
        }

        public int getStart() {
            this.start = (this.getPage() - 1) * this.getPageSize();
            return this.start;
        }

        public int getOffset() {
            this.offset = this.getPageSize();
            return this.offset;
        }

        public Map<String, String> getConditions() {
            return (Map)(this.conditions == null ? new HashMap() : this.conditions);
        }

        public void setConditions(Map<String, String> conditions) {
            this.conditions = conditions;
        }

        public int getTotalCount() {
            return this.totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPage() {
            return this.page <= 0 ? 1 : this.page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageSize() {
            return this.pageSize <= 0 ? 10 : this.pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getOrderBy() {
            return this.orderBy;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }

        public OrderByType getOrder() {
            return this.order == null ? OrderByType.ASC : this.order;
        }

        public void setOrder(OrderByType order) {
            this.order = order;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("{RestPage,totalCount=");
            builder.append(this.totalCount);
            builder.append(",page=");
            builder.append(this.page);
            builder.append(",pageSize=");
            builder.append(this.pageSize);
            builder.append(",orderBy=");
            builder.append(this.orderBy);
            builder.append(",order=");
            builder.append(this.order);
            builder.append(",conditions=");
            builder.append(this.conditions);
            builder.append("}");
            return builder.toString();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (!(o instanceof PageRequest)) {
                return false;
            } else {
                PageRequest restPage = (PageRequest)o;
                if (this.totalCount != restPage.totalCount) {
                    return false;
                } else if (this.page != restPage.page) {
                    return false;
                } else if (this.pageSize != restPage.pageSize) {
                    return false;
                } else {
                    label54: {
                        if (this.orderBy != null) {
                            if (this.orderBy.equals(restPage.orderBy)) {
                                break label54;
                            }
                        } else if (restPage.orderBy == null) {
                            break label54;
                        }

                        return false;
                    }

                    if (this.order != null) {
                        if (!this.order.equals(restPage.order)) {
                            return false;
                        }
                    } else if (restPage.order != null) {
                        return false;
                    }

                    boolean var10000;
                    label78: {
                        if (this.conditions != null) {
                            if (this.conditions.equals(restPage.conditions)) {
                                break label78;
                            }
                        } else if (restPage.conditions == null) {
                            break label78;
                        }

                        var10000 = false;
                        return var10000;
                    }

                    var10000 = true;
                    return var10000;
                }
            }
        }

        public int hashCode() {
            int result1 = this.totalCount;
            result1 = 31 * result1 + this.page;
            result1 = 31 * result1 + this.pageSize;
            result1 = 31 * result1 + (this.orderBy != null ? this.orderBy.hashCode() : 0);
            result1 = 31 * result1 + (this.order != null ? this.order.hashCode() : 0);
            result1 = 31 * result1 + (this.conditions != null ? this.conditions.hashCode() : 0);
            return result1;
        }
    }


