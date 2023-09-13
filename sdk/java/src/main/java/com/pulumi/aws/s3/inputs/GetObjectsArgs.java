// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectsArgs Empty = new GetObjectsArgs();

    /**
     * Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Character used to group keys (Default: none)
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return Character used to group keys (Default: none)
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
     * 
     */
    @Import(name="encodingType")
    private @Nullable Output<String> encodingType;

    /**
     * @return Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
     * 
     */
    public Optional<Output<String>> encodingType() {
        return Optional.ofNullable(this.encodingType);
    }

    /**
     * Boolean specifying whether to populate the owner list (Default: false)
     * 
     */
    @Import(name="fetchOwner")
    private @Nullable Output<Boolean> fetchOwner;

    /**
     * @return Boolean specifying whether to populate the owner list (Default: false)
     * 
     */
    public Optional<Output<Boolean>> fetchOwner() {
        return Optional.ofNullable(this.fetchOwner);
    }

    /**
     * Maximum object keys to return (Default: 1000)
     * 
     */
    @Import(name="maxKeys")
    private @Nullable Output<Integer> maxKeys;

    /**
     * @return Maximum object keys to return (Default: 1000)
     * 
     */
    public Optional<Output<Integer>> maxKeys() {
        return Optional.ofNullable(this.maxKeys);
    }

    /**
     * Limits results to object keys with this prefix (Default: none)
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Limits results to object keys with this prefix (Default: none)
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. If included, the only valid value is `requester`.
     * 
     */
    @Import(name="requestPayer")
    private @Nullable Output<String> requestPayer;

    /**
     * @return Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. If included, the only valid value is `requester`.
     * 
     */
    public Optional<Output<String>> requestPayer() {
        return Optional.ofNullable(this.requestPayer);
    }

    /**
     * Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
     * 
     */
    @Import(name="startAfter")
    private @Nullable Output<String> startAfter;

    /**
     * @return Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
     * 
     */
    public Optional<Output<String>> startAfter() {
        return Optional.ofNullable(this.startAfter);
    }

    private GetObjectsArgs() {}

    private GetObjectsArgs(GetObjectsArgs $) {
        this.bucket = $.bucket;
        this.delimiter = $.delimiter;
        this.encodingType = $.encodingType;
        this.fetchOwner = $.fetchOwner;
        this.maxKeys = $.maxKeys;
        this.prefix = $.prefix;
        this.requestPayer = $.requestPayer;
        this.startAfter = $.startAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectsArgs $;

        public Builder() {
            $ = new GetObjectsArgs();
        }

        public Builder(GetObjectsArgs defaults) {
            $ = new GetObjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param delimiter Character used to group keys (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter Character used to group keys (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param encodingType Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
         * 
         * @return builder
         * 
         */
        public Builder encodingType(@Nullable Output<String> encodingType) {
            $.encodingType = encodingType;
            return this;
        }

        /**
         * @param encodingType Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
         * 
         * @return builder
         * 
         */
        public Builder encodingType(String encodingType) {
            return encodingType(Output.of(encodingType));
        }

        /**
         * @param fetchOwner Boolean specifying whether to populate the owner list (Default: false)
         * 
         * @return builder
         * 
         */
        public Builder fetchOwner(@Nullable Output<Boolean> fetchOwner) {
            $.fetchOwner = fetchOwner;
            return this;
        }

        /**
         * @param fetchOwner Boolean specifying whether to populate the owner list (Default: false)
         * 
         * @return builder
         * 
         */
        public Builder fetchOwner(Boolean fetchOwner) {
            return fetchOwner(Output.of(fetchOwner));
        }

        /**
         * @param maxKeys Maximum object keys to return (Default: 1000)
         * 
         * @return builder
         * 
         */
        public Builder maxKeys(@Nullable Output<Integer> maxKeys) {
            $.maxKeys = maxKeys;
            return this;
        }

        /**
         * @param maxKeys Maximum object keys to return (Default: 1000)
         * 
         * @return builder
         * 
         */
        public Builder maxKeys(Integer maxKeys) {
            return maxKeys(Output.of(maxKeys));
        }

        /**
         * @param prefix Limits results to object keys with this prefix (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Limits results to object keys with this prefix (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param requestPayer Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. If included, the only valid value is `requester`.
         * 
         * @return builder
         * 
         */
        public Builder requestPayer(@Nullable Output<String> requestPayer) {
            $.requestPayer = requestPayer;
            return this;
        }

        /**
         * @param requestPayer Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. If included, the only valid value is `requester`.
         * 
         * @return builder
         * 
         */
        public Builder requestPayer(String requestPayer) {
            return requestPayer(Output.of(requestPayer));
        }

        /**
         * @param startAfter Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
         * 
         * @return builder
         * 
         */
        public Builder startAfter(@Nullable Output<String> startAfter) {
            $.startAfter = startAfter;
            return this;
        }

        /**
         * @param startAfter Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
         * 
         * @return builder
         * 
         */
        public Builder startAfter(String startAfter) {
            return startAfter(Output.of(startAfter));
        }

        public GetObjectsArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
