// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleElasticsearch {
    /**
     * @return The endpoint of your Elasticsearch domain.
     * 
     */
    private String endpoint;
    /**
     * @return The unique identifier for the document you are storing.
     * 
     */
    private String id;
    /**
     * @return The Elasticsearch index where you want to store your data.
     * 
     */
    private String index;
    /**
     * @return The IAM role ARN that has access to Elasticsearch.
     * 
     */
    private String roleArn;
    /**
     * @return The type of document you are storing.
     * 
     */
    private String type;

    private TopicRuleElasticsearch() {}
    /**
     * @return The endpoint of your Elasticsearch domain.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The unique identifier for the document you are storing.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Elasticsearch index where you want to store your data.
     * 
     */
    public String index() {
        return this.index;
    }
    /**
     * @return The IAM role ARN that has access to Elasticsearch.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The type of document you are storing.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleElasticsearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private String id;
        private String index;
        private String roleArn;
        private String type;
        public Builder() {}
        public Builder(TopicRuleElasticsearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder index(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TopicRuleElasticsearch build() {
            final var o = new TopicRuleElasticsearch();
            o.endpoint = endpoint;
            o.id = id;
            o.index = index;
            o.roleArn = roleArn;
            o.type = type;
            return o;
        }
    }
}
