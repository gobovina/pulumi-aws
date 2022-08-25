// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentSegmentAction {
    /**
     * @return The action to take for the chosen segment. Valid values `create-route` or `share`.
     * 
     */
    private String action;
    /**
     * @return A user-defined string describing the segment action.
     * 
     */
    private @Nullable String description;
    /**
     * @return List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
     * 
     */
    private @Nullable List<String> destinationCidrBlocks;
    /**
     * @return A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
     * 
     */
    private @Nullable List<String> destinations;
    /**
     * @return A string. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return The name of the segment.
     * 
     */
    private String segment;
    /**
     * @return A set subtraction of segments to not share with.
     * 
     */
    private @Nullable List<String> shareWithExcepts;
    /**
     * @return A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
     * 
     */
    private @Nullable List<String> shareWiths;

    private GetCoreNetworkPolicyDocumentSegmentAction() {}
    /**
     * @return The action to take for the chosen segment. Valid values `create-route` or `share`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return A user-defined string describing the segment action.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
     * 
     */
    public List<String> destinationCidrBlocks() {
        return this.destinationCidrBlocks == null ? List.of() : this.destinationCidrBlocks;
    }
    /**
     * @return A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
     * 
     */
    public List<String> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * @return A string. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The name of the segment.
     * 
     */
    public String segment() {
        return this.segment;
    }
    /**
     * @return A set subtraction of segments to not share with.
     * 
     */
    public List<String> shareWithExcepts() {
        return this.shareWithExcepts == null ? List.of() : this.shareWithExcepts;
    }
    /**
     * @return A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
     * 
     */
    public List<String> shareWiths() {
        return this.shareWiths == null ? List.of() : this.shareWiths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentSegmentAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String description;
        private @Nullable List<String> destinationCidrBlocks;
        private @Nullable List<String> destinations;
        private @Nullable String mode;
        private String segment;
        private @Nullable List<String> shareWithExcepts;
        private @Nullable List<String> shareWiths;
        public Builder() {}
        public Builder(GetCoreNetworkPolicyDocumentSegmentAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.destinationCidrBlocks = defaults.destinationCidrBlocks;
    	      this.destinations = defaults.destinations;
    	      this.mode = defaults.mode;
    	      this.segment = defaults.segment;
    	      this.shareWithExcepts = defaults.shareWithExcepts;
    	      this.shareWiths = defaults.shareWiths;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationCidrBlocks(@Nullable List<String> destinationCidrBlocks) {
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }
        public Builder destinationCidrBlocks(String... destinationCidrBlocks) {
            return destinationCidrBlocks(List.of(destinationCidrBlocks));
        }
        @CustomType.Setter
        public Builder destinations(@Nullable List<String> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder segment(String segment) {
            this.segment = Objects.requireNonNull(segment);
            return this;
        }
        @CustomType.Setter
        public Builder shareWithExcepts(@Nullable List<String> shareWithExcepts) {
            this.shareWithExcepts = shareWithExcepts;
            return this;
        }
        public Builder shareWithExcepts(String... shareWithExcepts) {
            return shareWithExcepts(List.of(shareWithExcepts));
        }
        @CustomType.Setter
        public Builder shareWiths(@Nullable List<String> shareWiths) {
            this.shareWiths = shareWiths;
            return this;
        }
        public Builder shareWiths(String... shareWiths) {
            return shareWiths(List.of(shareWiths));
        }
        public GetCoreNetworkPolicyDocumentSegmentAction build() {
            final var o = new GetCoreNetworkPolicyDocumentSegmentAction();
            o.action = action;
            o.description = description;
            o.destinationCidrBlocks = destinationCidrBlocks;
            o.destinations = destinations;
            o.mode = mode;
            o.segment = segment;
            o.shareWithExcepts = shareWithExcepts;
            o.shareWiths = shareWiths;
            return o;
        }
    }
}
