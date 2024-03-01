// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CoreNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CoreNetworkArgs Empty = new CoreNetworkArgs();

    /**
     * Sets the base policy document for the core network. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     * 
     */
    @Import(name="basePolicyDocument")
    private @Nullable Output<String> basePolicyDocument;

    /**
     * @return Sets the base policy document for the core network. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     * 
     */
    public Optional<Output<String>> basePolicyDocument() {
        return Optional.ofNullable(this.basePolicyDocument);
    }

    /**
     * The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     * @deprecated
     * Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider.
     * 
     */
    @Deprecated /* Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider. */
    @Import(name="basePolicyRegion")
    private @Nullable Output<String> basePolicyRegion;

    /**
     * @return The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     * @deprecated
     * Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider.
     * 
     */
    @Deprecated /* Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider. */
    public Optional<Output<String>> basePolicyRegion() {
        return Optional.ofNullable(this.basePolicyRegion);
    }

    /**
     * A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     */
    @Import(name="basePolicyRegions")
    private @Nullable Output<List<String>> basePolicyRegions;

    /**
     * @return A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     */
    public Optional<Output<List<String>>> basePolicyRegions() {
        return Optional.ofNullable(this.basePolicyRegions);
    }

    /**
     * Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
     * 
     */
    @Import(name="createBasePolicy")
    private @Nullable Output<Boolean> createBasePolicy;

    /**
     * @return Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
     * 
     */
    public Optional<Output<Boolean>> createBasePolicy() {
        return Optional.ofNullable(this.createBasePolicy);
    }

    /**
     * Description of the Core Network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Core Network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the global network that a core network will be a part of.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network that a core network will be a part of.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CoreNetworkArgs() {}

    private CoreNetworkArgs(CoreNetworkArgs $) {
        this.basePolicyDocument = $.basePolicyDocument;
        this.basePolicyRegion = $.basePolicyRegion;
        this.basePolicyRegions = $.basePolicyRegions;
        this.createBasePolicy = $.createBasePolicy;
        this.description = $.description;
        this.globalNetworkId = $.globalNetworkId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CoreNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CoreNetworkArgs $;

        public Builder() {
            $ = new CoreNetworkArgs();
        }

        public Builder(CoreNetworkArgs defaults) {
            $ = new CoreNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basePolicyDocument Sets the base policy document for the core network. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder basePolicyDocument(@Nullable Output<String> basePolicyDocument) {
            $.basePolicyDocument = basePolicyDocument;
            return this;
        }

        /**
         * @param basePolicyDocument Sets the base policy document for the core network. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder basePolicyDocument(String basePolicyDocument) {
            return basePolicyDocument(Output.of(basePolicyDocument));
        }

        /**
         * @param basePolicyRegion The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider.
         * 
         */
        @Deprecated /* Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider. */
        public Builder basePolicyRegion(@Nullable Output<String> basePolicyRegion) {
            $.basePolicyRegion = basePolicyRegion;
            return this;
        }

        /**
         * @param basePolicyRegion The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider.
         * 
         */
        @Deprecated /* Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider. */
        public Builder basePolicyRegion(String basePolicyRegion) {
            return basePolicyRegion(Output.of(basePolicyRegion));
        }

        /**
         * @param basePolicyRegions A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
         * 
         * @return builder
         * 
         */
        public Builder basePolicyRegions(@Nullable Output<List<String>> basePolicyRegions) {
            $.basePolicyRegions = basePolicyRegions;
            return this;
        }

        /**
         * @param basePolicyRegions A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
         * 
         * @return builder
         * 
         */
        public Builder basePolicyRegions(List<String> basePolicyRegions) {
            return basePolicyRegions(Output.of(basePolicyRegions));
        }

        /**
         * @param basePolicyRegions A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
         * 
         * @return builder
         * 
         */
        public Builder basePolicyRegions(String... basePolicyRegions) {
            return basePolicyRegions(List.of(basePolicyRegions));
        }

        /**
         * @param createBasePolicy Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
         * 
         * @return builder
         * 
         */
        public Builder createBasePolicy(@Nullable Output<Boolean> createBasePolicy) {
            $.createBasePolicy = createBasePolicy;
            return this;
        }

        /**
         * @param createBasePolicy Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
         * 
         * @return builder
         * 
         */
        public Builder createBasePolicy(Boolean createBasePolicy) {
            return createBasePolicy(Output.of(createBasePolicy));
        }

        /**
         * @param description Description of the Core Network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Core Network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param globalNetworkId The ID of the global network that a core network will be a part of.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network that a core network will be a part of.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param tags Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CoreNetworkArgs build() {
            if ($.globalNetworkId == null) {
                throw new MissingRequiredPropertyException("CoreNetworkArgs", "globalNetworkId");
            }
            return $;
        }
    }

}
