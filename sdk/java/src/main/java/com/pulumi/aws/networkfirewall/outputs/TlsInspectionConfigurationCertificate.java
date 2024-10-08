// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TlsInspectionConfigurationCertificate {
    /**
     * @return ARN of the certificate.
     * 
     */
    private String certificateArn;
    /**
     * @return Serial number of the certificate.
     * 
     */
    private String certificateSerial;
    /**
     * @return Status of the certificate.
     * 
     */
    private String status;
    /**
     * @return Details about the certificate status, including information about certificate errors.
     * 
     */
    private String statusMessage;

    private TlsInspectionConfigurationCertificate() {}
    /**
     * @return ARN of the certificate.
     * 
     */
    public String certificateArn() {
        return this.certificateArn;
    }
    /**
     * @return Serial number of the certificate.
     * 
     */
    public String certificateSerial() {
        return this.certificateSerial;
    }
    /**
     * @return Status of the certificate.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Details about the certificate status, including information about certificate errors.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsInspectionConfigurationCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateArn;
        private String certificateSerial;
        private String status;
        private String statusMessage;
        public Builder() {}
        public Builder(TlsInspectionConfigurationCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.certificateSerial = defaults.certificateSerial;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        @CustomType.Setter
        public Builder certificateArn(String certificateArn) {
            if (certificateArn == null) {
              throw new MissingRequiredPropertyException("TlsInspectionConfigurationCertificate", "certificateArn");
            }
            this.certificateArn = certificateArn;
            return this;
        }
        @CustomType.Setter
        public Builder certificateSerial(String certificateSerial) {
            if (certificateSerial == null) {
              throw new MissingRequiredPropertyException("TlsInspectionConfigurationCertificate", "certificateSerial");
            }
            this.certificateSerial = certificateSerial;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("TlsInspectionConfigurationCertificate", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder statusMessage(String statusMessage) {
            if (statusMessage == null) {
              throw new MissingRequiredPropertyException("TlsInspectionConfigurationCertificate", "statusMessage");
            }
            this.statusMessage = statusMessage;
            return this;
        }
        public TlsInspectionConfigurationCertificate build() {
            final var _resultValue = new TlsInspectionConfigurationCertificate();
            _resultValue.certificateArn = certificateArn;
            _resultValue.certificateSerial = certificateSerial;
            _resultValue.status = status;
            _resultValue.statusMessage = statusMessage;
            return _resultValue;
        }
    }
}
