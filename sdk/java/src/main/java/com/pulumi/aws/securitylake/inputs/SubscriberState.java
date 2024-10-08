// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securitylake.inputs;

import com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs;
import com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs;
import com.pulumi.aws.securitylake.inputs.SubscriberTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriberState extends com.pulumi.resources.ResourceArgs {

    public static final SubscriberState Empty = new SubscriberState();

    /**
     * The Amazon S3 or Lake Formation access type.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return The Amazon S3 or Lake Formation access type.
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * ARN of the Data Lake.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the Data Lake.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
     * 
     */
    @Import(name="resourceShareArn")
    private @Nullable Output<String> resourceShareArn;

    /**
     * @return The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
     * 
     */
    public Optional<Output<String>> resourceShareArn() {
        return Optional.ofNullable(this.resourceShareArn);
    }

    /**
     * The name of the resource share.
     * 
     */
    @Import(name="resourceShareName")
    private @Nullable Output<String> resourceShareName;

    /**
     * @return The name of the resource share.
     * 
     */
    public Optional<Output<String>> resourceShareName() {
        return Optional.ofNullable(this.resourceShareName);
    }

    /**
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * 
     */
    @Import(name="s3BucketArn")
    private @Nullable Output<String> s3BucketArn;

    /**
     * @return The ARN for the Amazon Security Lake Amazon S3 bucket.
     * 
     */
    public Optional<Output<String>> s3BucketArn() {
        return Optional.ofNullable(this.s3BucketArn);
    }

    /**
     * The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
     * 
     */
    @Import(name="source")
    private @Nullable Output<SubscriberSourceArgs> source;

    /**
     * @return The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
     * 
     */
    public Optional<Output<SubscriberSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The description for your subscriber account in Security Lake.
     * 
     */
    @Import(name="subscriberDescription")
    private @Nullable Output<String> subscriberDescription;

    /**
     * @return The description for your subscriber account in Security Lake.
     * 
     */
    public Optional<Output<String>> subscriberDescription() {
        return Optional.ofNullable(this.subscriberDescription);
    }

    /**
     * The subscriber endpoint to which exception messages are posted.
     * 
     */
    @Import(name="subscriberEndpoint")
    private @Nullable Output<String> subscriberEndpoint;

    /**
     * @return The subscriber endpoint to which exception messages are posted.
     * 
     */
    public Optional<Output<String>> subscriberEndpoint() {
        return Optional.ofNullable(this.subscriberEndpoint);
    }

    /**
     * The AWS identity used to access your data. See `subscriber_identity` Block below.
     * 
     */
    @Import(name="subscriberIdentity")
    private @Nullable Output<SubscriberSubscriberIdentityArgs> subscriberIdentity;

    /**
     * @return The AWS identity used to access your data. See `subscriber_identity` Block below.
     * 
     */
    public Optional<Output<SubscriberSubscriberIdentityArgs>> subscriberIdentity() {
        return Optional.ofNullable(this.subscriberIdentity);
    }

    /**
     * The name of your Security Lake subscriber account.
     * 
     */
    @Import(name="subscriberName")
    private @Nullable Output<String> subscriberName;

    /**
     * @return The name of your Security Lake subscriber account.
     * 
     */
    public Optional<Output<String>> subscriberName() {
        return Optional.ofNullable(this.subscriberName);
    }

    /**
     * The subscriber status of the Amazon Security Lake subscriber account.
     * 
     */
    @Import(name="subscriberStatus")
    private @Nullable Output<String> subscriberStatus;

    /**
     * @return The subscriber status of the Amazon Security Lake subscriber account.
     * 
     */
    public Optional<Output<String>> subscriberStatus() {
        return Optional.ofNullable(this.subscriberStatus);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="timeouts")
    private @Nullable Output<SubscriberTimeoutsArgs> timeouts;

    public Optional<Output<SubscriberTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private SubscriberState() {}

    private SubscriberState(SubscriberState $) {
        this.accessType = $.accessType;
        this.arn = $.arn;
        this.resourceShareArn = $.resourceShareArn;
        this.resourceShareName = $.resourceShareName;
        this.roleArn = $.roleArn;
        this.s3BucketArn = $.s3BucketArn;
        this.source = $.source;
        this.subscriberDescription = $.subscriberDescription;
        this.subscriberEndpoint = $.subscriberEndpoint;
        this.subscriberIdentity = $.subscriberIdentity;
        this.subscriberName = $.subscriberName;
        this.subscriberStatus = $.subscriberStatus;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriberState $;

        public Builder() {
            $ = new SubscriberState();
        }

        public Builder(SubscriberState defaults) {
            $ = new SubscriberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessType The Amazon S3 or Lake Formation access type.
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType The Amazon S3 or Lake Formation access type.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param arn ARN of the Data Lake.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the Data Lake.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param resourceShareArn The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareArn(@Nullable Output<String> resourceShareArn) {
            $.resourceShareArn = resourceShareArn;
            return this;
        }

        /**
         * @param resourceShareArn The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareArn(String resourceShareArn) {
            return resourceShareArn(Output.of(resourceShareArn));
        }

        /**
         * @param resourceShareName The name of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(@Nullable Output<String> resourceShareName) {
            $.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * @param resourceShareName The name of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(String resourceShareName) {
            return resourceShareName(Output.of(resourceShareName));
        }

        /**
         * @param roleArn The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param s3BucketArn The ARN for the Amazon Security Lake Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(@Nullable Output<String> s3BucketArn) {
            $.s3BucketArn = s3BucketArn;
            return this;
        }

        /**
         * @param s3BucketArn The ARN for the Amazon Security Lake Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(String s3BucketArn) {
            return s3BucketArn(Output.of(s3BucketArn));
        }

        /**
         * @param source The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<SubscriberSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
         * 
         * @return builder
         * 
         */
        public Builder source(SubscriberSourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param subscriberDescription The description for your subscriber account in Security Lake.
         * 
         * @return builder
         * 
         */
        public Builder subscriberDescription(@Nullable Output<String> subscriberDescription) {
            $.subscriberDescription = subscriberDescription;
            return this;
        }

        /**
         * @param subscriberDescription The description for your subscriber account in Security Lake.
         * 
         * @return builder
         * 
         */
        public Builder subscriberDescription(String subscriberDescription) {
            return subscriberDescription(Output.of(subscriberDescription));
        }

        /**
         * @param subscriberEndpoint The subscriber endpoint to which exception messages are posted.
         * 
         * @return builder
         * 
         */
        public Builder subscriberEndpoint(@Nullable Output<String> subscriberEndpoint) {
            $.subscriberEndpoint = subscriberEndpoint;
            return this;
        }

        /**
         * @param subscriberEndpoint The subscriber endpoint to which exception messages are posted.
         * 
         * @return builder
         * 
         */
        public Builder subscriberEndpoint(String subscriberEndpoint) {
            return subscriberEndpoint(Output.of(subscriberEndpoint));
        }

        /**
         * @param subscriberIdentity The AWS identity used to access your data. See `subscriber_identity` Block below.
         * 
         * @return builder
         * 
         */
        public Builder subscriberIdentity(@Nullable Output<SubscriberSubscriberIdentityArgs> subscriberIdentity) {
            $.subscriberIdentity = subscriberIdentity;
            return this;
        }

        /**
         * @param subscriberIdentity The AWS identity used to access your data. See `subscriber_identity` Block below.
         * 
         * @return builder
         * 
         */
        public Builder subscriberIdentity(SubscriberSubscriberIdentityArgs subscriberIdentity) {
            return subscriberIdentity(Output.of(subscriberIdentity));
        }

        /**
         * @param subscriberName The name of your Security Lake subscriber account.
         * 
         * @return builder
         * 
         */
        public Builder subscriberName(@Nullable Output<String> subscriberName) {
            $.subscriberName = subscriberName;
            return this;
        }

        /**
         * @param subscriberName The name of your Security Lake subscriber account.
         * 
         * @return builder
         * 
         */
        public Builder subscriberName(String subscriberName) {
            return subscriberName(Output.of(subscriberName));
        }

        /**
         * @param subscriberStatus The subscriber status of the Amazon Security Lake subscriber account.
         * 
         * @return builder
         * 
         */
        public Builder subscriberStatus(@Nullable Output<String> subscriberStatus) {
            $.subscriberStatus = subscriberStatus;
            return this;
        }

        /**
         * @param subscriberStatus The subscriber status of the Amazon Security Lake subscriber account.
         * 
         * @return builder
         * 
         */
        public Builder subscriberStatus(String subscriberStatus) {
            return subscriberStatus(Output.of(subscriberStatus));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder timeouts(@Nullable Output<SubscriberTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(SubscriberTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public SubscriberState build() {
            return $;
        }
    }

}
