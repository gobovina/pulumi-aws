// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.oam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSinkArgs Empty = new GetSinkArgs();

    /**
     * ARN of the sink.
     * 
     */
    @Import(name="sinkIdentifier", required=true)
    private Output<String> sinkIdentifier;

    /**
     * @return ARN of the sink.
     * 
     */
    public Output<String> sinkIdentifier() {
        return this.sinkIdentifier;
    }

    /**
     * Tags assigned to the sink.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags assigned to the sink.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSinkArgs() {}

    private GetSinkArgs(GetSinkArgs $) {
        this.sinkIdentifier = $.sinkIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSinkArgs $;

        public Builder() {
            $ = new GetSinkArgs();
        }

        public Builder(GetSinkArgs defaults) {
            $ = new GetSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sinkIdentifier ARN of the sink.
         * 
         * @return builder
         * 
         */
        public Builder sinkIdentifier(Output<String> sinkIdentifier) {
            $.sinkIdentifier = sinkIdentifier;
            return this;
        }

        /**
         * @param sinkIdentifier ARN of the sink.
         * 
         * @return builder
         * 
         */
        public Builder sinkIdentifier(String sinkIdentifier) {
            return sinkIdentifier(Output.of(sinkIdentifier));
        }

        /**
         * @param tags Tags assigned to the sink.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags assigned to the sink.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetSinkArgs build() {
            $.sinkIdentifier = Objects.requireNonNull($.sinkIdentifier, "expected parameter 'sinkIdentifier' to be non-null");
            return $;
        }
    }

}
