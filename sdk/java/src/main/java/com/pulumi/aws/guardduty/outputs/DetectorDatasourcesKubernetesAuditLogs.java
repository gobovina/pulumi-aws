// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class DetectorDatasourcesKubernetesAuditLogs {
    /**
     * @return If true, enables Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * Defaults to `true`.
     * 
     */
    private Boolean enable;

    private DetectorDatasourcesKubernetesAuditLogs() {}
    /**
     * @return If true, enables Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * Defaults to `true`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesKubernetesAuditLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        public Builder() {}
        public Builder(DetectorDatasourcesKubernetesAuditLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public DetectorDatasourcesKubernetesAuditLogs build() {
            final var o = new DetectorDatasourcesKubernetesAuditLogs();
            o.enable = enable;
            return o;
        }
    }
}
