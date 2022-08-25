// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrokerEncryptionOption {
    private String kmsKeyId;
    private Boolean useAwsOwnedKey;

    private GetBrokerEncryptionOption() {}
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public Boolean useAwsOwnedKey() {
        return this.useAwsOwnedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerEncryptionOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyId;
        private Boolean useAwsOwnedKey;
        public Builder() {}
        public Builder(GetBrokerEncryptionOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.useAwsOwnedKey = defaults.useAwsOwnedKey;
        }

        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder useAwsOwnedKey(Boolean useAwsOwnedKey) {
            this.useAwsOwnedKey = Objects.requireNonNull(useAwsOwnedKey);
            return this;
        }
        public GetBrokerEncryptionOption build() {
            final var o = new GetBrokerEncryptionOption();
            o.kmsKeyId = kmsKeyId;
            o.useAwsOwnedKey = useAwsOwnedKey;
            return o;
        }
    }
}
