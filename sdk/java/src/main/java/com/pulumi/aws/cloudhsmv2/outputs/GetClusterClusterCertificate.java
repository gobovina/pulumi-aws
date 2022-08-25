// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterClusterCertificate {
    private String awsHardwareCertificate;
    private String clusterCertificate;
    private String clusterCsr;
    private String hsmCertificate;
    private String manufacturerHardwareCertificate;

    private GetClusterClusterCertificate() {}
    public String awsHardwareCertificate() {
        return this.awsHardwareCertificate;
    }
    public String clusterCertificate() {
        return this.clusterCertificate;
    }
    public String clusterCsr() {
        return this.clusterCsr;
    }
    public String hsmCertificate() {
        return this.hsmCertificate;
    }
    public String manufacturerHardwareCertificate() {
        return this.manufacturerHardwareCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String awsHardwareCertificate;
        private String clusterCertificate;
        private String clusterCsr;
        private String hsmCertificate;
        private String manufacturerHardwareCertificate;
        public Builder() {}
        public Builder(GetClusterClusterCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        @CustomType.Setter
        public Builder awsHardwareCertificate(String awsHardwareCertificate) {
            this.awsHardwareCertificate = Objects.requireNonNull(awsHardwareCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder clusterCertificate(String clusterCertificate) {
            this.clusterCertificate = Objects.requireNonNull(clusterCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder clusterCsr(String clusterCsr) {
            this.clusterCsr = Objects.requireNonNull(clusterCsr);
            return this;
        }
        @CustomType.Setter
        public Builder hsmCertificate(String hsmCertificate) {
            this.hsmCertificate = Objects.requireNonNull(hsmCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder manufacturerHardwareCertificate(String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = Objects.requireNonNull(manufacturerHardwareCertificate);
            return this;
        }
        public GetClusterClusterCertificate build() {
            final var o = new GetClusterClusterCertificate();
            o.awsHardwareCertificate = awsHardwareCertificate;
            o.clusterCertificate = clusterCertificate;
            o.clusterCsr = clusterCsr;
            o.hsmCertificate = hsmCertificate;
            o.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
            return o;
        }
    }
}
