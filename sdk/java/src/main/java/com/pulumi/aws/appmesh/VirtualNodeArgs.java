// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeArgs Empty = new VirtualNodeArgs();

    /**
     * Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName", required=true)
    private Output<String> meshName;

    /**
     * @return Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> meshName() {
        return this.meshName;
    }

    /**
     * AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable Output<String> meshOwner;

    /**
     * @return AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    public Optional<Output<String>> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * Name to use for the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name to use for the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Virtual node specification to apply.
     * 
     */
    @Import(name="spec", required=true)
    private Output<VirtualNodeSpecArgs> spec;

    /**
     * @return Virtual node specification to apply.
     * 
     */
    public Output<VirtualNodeSpecArgs> spec() {
        return this.spec;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private VirtualNodeArgs() {}

    private VirtualNodeArgs(VirtualNodeArgs $) {
        this.meshName = $.meshName;
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.spec = $.spec;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeArgs $;

        public Builder() {
            $ = new VirtualNodeArgs();
        }

        public Builder(VirtualNodeArgs defaults) {
            $ = new VirtualNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param meshName Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(Output<String> meshName) {
            $.meshName = meshName;
            return this;
        }

        /**
         * @param meshName Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(String meshName) {
            return meshName(Output.of(meshName));
        }

        /**
         * @param meshOwner AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        /**
         * @param meshOwner AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(String meshOwner) {
            return meshOwner(Output.of(meshOwner));
        }

        /**
         * @param name Name to use for the virtual node. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name to use for the virtual node. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param spec Virtual node specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<VirtualNodeSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Virtual node specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(VirtualNodeSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public VirtualNodeArgs build() {
            $.meshName = Objects.requireNonNull($.meshName, "expected parameter 'meshName' to be non-null");
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            return $;
        }
    }

}
