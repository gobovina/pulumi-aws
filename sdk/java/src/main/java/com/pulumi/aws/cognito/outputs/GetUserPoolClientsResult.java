// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserPoolClientsResult {
    /**
     * @return List of Cognito user pool client IDs.
     * 
     */
    private List<String> clientIds;
    /**
     * @return List of Cognito user pool client names.
     * 
     */
    private List<String> clientNames;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String userPoolId;

    private GetUserPoolClientsResult() {}
    /**
     * @return List of Cognito user pool client IDs.
     * 
     */
    public List<String> clientIds() {
        return this.clientIds;
    }
    /**
     * @return List of Cognito user pool client names.
     * 
     */
    public List<String> clientNames() {
        return this.clientNames;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String userPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> clientIds;
        private List<String> clientNames;
        private String id;
        private String userPoolId;
        public Builder() {}
        public Builder(GetUserPoolClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIds = defaults.clientIds;
    	      this.clientNames = defaults.clientNames;
    	      this.id = defaults.id;
    	      this.userPoolId = defaults.userPoolId;
        }

        @CustomType.Setter
        public Builder clientIds(List<String> clientIds) {
            this.clientIds = Objects.requireNonNull(clientIds);
            return this;
        }
        public Builder clientIds(String... clientIds) {
            return clientIds(List.of(clientIds));
        }
        @CustomType.Setter
        public Builder clientNames(List<String> clientNames) {
            this.clientNames = Objects.requireNonNull(clientNames);
            return this;
        }
        public Builder clientNames(String... clientNames) {
            return clientNames(List.of(clientNames));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetUserPoolClientsResult build() {
            final var o = new GetUserPoolClientsResult();
            o.clientIds = clientIds;
            o.clientNames = clientNames;
            o.id = id;
            o.userPoolId = userPoolId;
            return o;
        }
    }
}
