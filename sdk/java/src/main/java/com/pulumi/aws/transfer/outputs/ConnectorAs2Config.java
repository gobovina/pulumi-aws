// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorAs2Config {
    /**
     * @return Specifies weather AS2 file is compressed. The valud values are ZLIB and  DISABLED.
     * 
     */
    private String compression;
    /**
     * @return The algorithm that is used to encrypt the file. The valid values are AES128_CBC | AES192_CBC | AES256_CBC | NONE.
     * 
     */
    private String encryptionAlgorithm;
    /**
     * @return The unique identifier for the AS2 local profile.
     * 
     */
    private String localProfileId;
    /**
     * @return Used for outbound requests to determine if a partner response for transfers is synchronous or asynchronous. The valid values are SYNC and NONE.
     * 
     */
    private String mdnResponse;
    /**
     * @return The signing algorithm for the Mdn response. The valid values are SHA256 | SHA384 | SHA512 | SHA1 | NONE | DEFAULT.
     * 
     */
    private @Nullable String mdnSigningAlgorithm;
    /**
     * @return Used as the subject HTTP header attribute in AS2 messages that are being sent with the connector.
     * 
     */
    private @Nullable String messageSubject;
    /**
     * @return The unique identifier for the AS2 partner profile.
     * 
     */
    private String partnerProfileId;
    /**
     * @return The algorithm that is used to sign AS2 messages sent with the connector. The valid values are SHA256 | SHA384 | SHA512 | SHA1 | NONE .
     * 
     */
    private String signingAlgorithm;

    private ConnectorAs2Config() {}
    /**
     * @return Specifies weather AS2 file is compressed. The valud values are ZLIB and  DISABLED.
     * 
     */
    public String compression() {
        return this.compression;
    }
    /**
     * @return The algorithm that is used to encrypt the file. The valid values are AES128_CBC | AES192_CBC | AES256_CBC | NONE.
     * 
     */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * @return The unique identifier for the AS2 local profile.
     * 
     */
    public String localProfileId() {
        return this.localProfileId;
    }
    /**
     * @return Used for outbound requests to determine if a partner response for transfers is synchronous or asynchronous. The valid values are SYNC and NONE.
     * 
     */
    public String mdnResponse() {
        return this.mdnResponse;
    }
    /**
     * @return The signing algorithm for the Mdn response. The valid values are SHA256 | SHA384 | SHA512 | SHA1 | NONE | DEFAULT.
     * 
     */
    public Optional<String> mdnSigningAlgorithm() {
        return Optional.ofNullable(this.mdnSigningAlgorithm);
    }
    /**
     * @return Used as the subject HTTP header attribute in AS2 messages that are being sent with the connector.
     * 
     */
    public Optional<String> messageSubject() {
        return Optional.ofNullable(this.messageSubject);
    }
    /**
     * @return The unique identifier for the AS2 partner profile.
     * 
     */
    public String partnerProfileId() {
        return this.partnerProfileId;
    }
    /**
     * @return The algorithm that is used to sign AS2 messages sent with the connector. The valid values are SHA256 | SHA384 | SHA512 | SHA1 | NONE .
     * 
     */
    public String signingAlgorithm() {
        return this.signingAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorAs2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String compression;
        private String encryptionAlgorithm;
        private String localProfileId;
        private String mdnResponse;
        private @Nullable String mdnSigningAlgorithm;
        private @Nullable String messageSubject;
        private String partnerProfileId;
        private String signingAlgorithm;
        public Builder() {}
        public Builder(ConnectorAs2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.localProfileId = defaults.localProfileId;
    	      this.mdnResponse = defaults.mdnResponse;
    	      this.mdnSigningAlgorithm = defaults.mdnSigningAlgorithm;
    	      this.messageSubject = defaults.messageSubject;
    	      this.partnerProfileId = defaults.partnerProfileId;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
        }

        @CustomType.Setter
        public Builder compression(String compression) {
            if (compression == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "compression");
            }
            this.compression = compression;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            if (encryptionAlgorithm == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "encryptionAlgorithm");
            }
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder localProfileId(String localProfileId) {
            if (localProfileId == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "localProfileId");
            }
            this.localProfileId = localProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder mdnResponse(String mdnResponse) {
            if (mdnResponse == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "mdnResponse");
            }
            this.mdnResponse = mdnResponse;
            return this;
        }
        @CustomType.Setter
        public Builder mdnSigningAlgorithm(@Nullable String mdnSigningAlgorithm) {

            this.mdnSigningAlgorithm = mdnSigningAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder messageSubject(@Nullable String messageSubject) {

            this.messageSubject = messageSubject;
            return this;
        }
        @CustomType.Setter
        public Builder partnerProfileId(String partnerProfileId) {
            if (partnerProfileId == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "partnerProfileId");
            }
            this.partnerProfileId = partnerProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder signingAlgorithm(String signingAlgorithm) {
            if (signingAlgorithm == null) {
              throw new MissingRequiredPropertyException("ConnectorAs2Config", "signingAlgorithm");
            }
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }
        public ConnectorAs2Config build() {
            final var _resultValue = new ConnectorAs2Config();
            _resultValue.compression = compression;
            _resultValue.encryptionAlgorithm = encryptionAlgorithm;
            _resultValue.localProfileId = localProfileId;
            _resultValue.mdnResponse = mdnResponse;
            _resultValue.mdnSigningAlgorithm = mdnSigningAlgorithm;
            _resultValue.messageSubject = messageSubject;
            _resultValue.partnerProfileId = partnerProfileId;
            _resultValue.signingAlgorithm = signingAlgorithm;
            return _resultValue;
        }
    }
}
