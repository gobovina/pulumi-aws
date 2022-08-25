// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.aws.guardduty.outputs.DetectorDatasourcesKubernetes;
import com.pulumi.aws.guardduty.outputs.DetectorDatasourcesMalwareProtection;
import com.pulumi.aws.guardduty.outputs.DetectorDatasourcesS3Logs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorDatasources {
    /**
     * @return Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes and Kubernetes Audit Logs below for more details.
     * 
     */
    private @Nullable DetectorDatasourcesKubernetes kubernetes;
    /**
     * @return Configures [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html).
     * See Malware Protection, Scan EC2 instance with findings and EBS volumes below for more details.
     * 
     */
    private @Nullable DetectorDatasourcesMalwareProtection malwareProtection;
    /**
     * @return Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
     * See S3 Logs below for more details.
     * 
     */
    private @Nullable DetectorDatasourcesS3Logs s3Logs;

    private DetectorDatasources() {}
    /**
     * @return Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes and Kubernetes Audit Logs below for more details.
     * 
     */
    public Optional<DetectorDatasourcesKubernetes> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }
    /**
     * @return Configures [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html).
     * See Malware Protection, Scan EC2 instance with findings and EBS volumes below for more details.
     * 
     */
    public Optional<DetectorDatasourcesMalwareProtection> malwareProtection() {
        return Optional.ofNullable(this.malwareProtection);
    }
    /**
     * @return Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
     * See S3 Logs below for more details.
     * 
     */
    public Optional<DetectorDatasourcesS3Logs> s3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DetectorDatasourcesKubernetes kubernetes;
        private @Nullable DetectorDatasourcesMalwareProtection malwareProtection;
        private @Nullable DetectorDatasourcesS3Logs s3Logs;
        public Builder() {}
        public Builder(DetectorDatasources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetes = defaults.kubernetes;
    	      this.malwareProtection = defaults.malwareProtection;
    	      this.s3Logs = defaults.s3Logs;
        }

        @CustomType.Setter
        public Builder kubernetes(@Nullable DetectorDatasourcesKubernetes kubernetes) {
            this.kubernetes = kubernetes;
            return this;
        }
        @CustomType.Setter
        public Builder malwareProtection(@Nullable DetectorDatasourcesMalwareProtection malwareProtection) {
            this.malwareProtection = malwareProtection;
            return this;
        }
        @CustomType.Setter
        public Builder s3Logs(@Nullable DetectorDatasourcesS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }
        public DetectorDatasources build() {
            final var o = new DetectorDatasources();
            o.kubernetes = kubernetes;
            o.malwareProtection = malwareProtection;
            o.s3Logs = s3Logs;
            return o;
        }
    }
}
