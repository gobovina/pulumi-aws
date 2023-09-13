// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointState extends com.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointState Empty = new ObjectLambdaAccessPointState();

    /**
     * The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Alias for the S3 Object Lambda Access Point.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return Alias for the S3 Object Lambda Access Point.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<ObjectLambdaAccessPointConfigurationArgs> configuration;

    /**
     * @return A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    public Optional<Output<ObjectLambdaAccessPointConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for this Object Lambda Access Point.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ObjectLambdaAccessPointState() {}

    private ObjectLambdaAccessPointState(ObjectLambdaAccessPointState $) {
        this.accountId = $.accountId;
        this.alias = $.alias;
        this.arn = $.arn;
        this.configuration = $.configuration;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectLambdaAccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLambdaAccessPointState $;

        public Builder() {
            $ = new ObjectLambdaAccessPointState();
        }

        public Builder(ObjectLambdaAccessPointState defaults) {
            $ = new ObjectLambdaAccessPointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param alias Alias for the S3 Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Alias for the S3 Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param configuration A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<ObjectLambdaAccessPointConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder configuration(ObjectLambdaAccessPointConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param name The name for this Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for this Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ObjectLambdaAccessPointState build() {
            return $;
        }
    }

}
