// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs Empty = new BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs();

    /**
     * Specifies the partition date source for the partitioned prefix. Valid values: `EventTime`, `DeliveryTime`.
     * 
     */
    @Import(name="partitionDateSource", required=true)
    private Output<String> partitionDateSource;

    /**
     * @return Specifies the partition date source for the partitioned prefix. Valid values: `EventTime`, `DeliveryTime`.
     * 
     */
    public Output<String> partitionDateSource() {
        return this.partitionDateSource;
    }

    private BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs() {}

    private BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs(BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs $) {
        this.partitionDateSource = $.partitionDateSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs $;

        public Builder() {
            $ = new BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs();
        }

        public Builder(BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs defaults) {
            $ = new BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionDateSource Specifies the partition date source for the partitioned prefix. Valid values: `EventTime`, `DeliveryTime`.
         * 
         * @return builder
         * 
         */
        public Builder partitionDateSource(Output<String> partitionDateSource) {
            $.partitionDateSource = partitionDateSource;
            return this;
        }

        /**
         * @param partitionDateSource Specifies the partition date source for the partitioned prefix. Valid values: `EventTime`, `DeliveryTime`.
         * 
         * @return builder
         * 
         */
        public Builder partitionDateSource(String partitionDateSource) {
            return partitionDateSource(Output.of(partitionDateSource));
        }

        public BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs build() {
            if ($.partitionDateSource == null) {
                throw new MissingRequiredPropertyException("BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs", "partitionDateSource");
            }
            return $;
        }
    }

}
