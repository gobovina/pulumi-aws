// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.aws.iot.outputs.TopicRuleTimestreamDimension;
import com.pulumi.aws.iot.outputs.TopicRuleTimestreamTimestamp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleTimestream {
    /**
     * @return The name of an Amazon Timestream database.
     * 
     */
    private String databaseName;
    /**
     * @return Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     * 
     */
    private List<TopicRuleTimestreamDimension> dimensions;
    /**
     * @return The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * 
     */
    private String roleArn;
    /**
     * @return The name of the database table into which to write the measure records.
     * 
     */
    private String tableName;
    /**
     * @return Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record&#39;s timestamp in the time column. Nested arguments below.
     * 
     */
    private @Nullable TopicRuleTimestreamTimestamp timestamp;

    private TopicRuleTimestream() {}
    /**
     * @return The name of an Amazon Timestream database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     * 
     */
    public List<TopicRuleTimestreamDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The name of the database table into which to write the measure records.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record&#39;s timestamp in the time column. Nested arguments below.
     * 
     */
    public Optional<TopicRuleTimestreamTimestamp> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private List<TopicRuleTimestreamDimension> dimensions;
        private String roleArn;
        private String tableName;
        private @Nullable TopicRuleTimestreamTimestamp timestamp;
        public Builder() {}
        public Builder(TopicRuleTimestream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.dimensions = defaults.dimensions;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
    	      this.timestamp = defaults.timestamp;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(List<TopicRuleTimestreamDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(TopicRuleTimestreamDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(@Nullable TopicRuleTimestreamTimestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public TopicRuleTimestream build() {
            final var o = new TopicRuleTimestream();
            o.databaseName = databaseName;
            o.dimensions = dimensions;
            o.roleArn = roleArn;
            o.tableName = tableName;
            o.timestamp = timestamp;
            return o;
        }
    }
}
