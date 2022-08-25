// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationAppversionLifecycle {
    /**
     * @return Specifies whether delete a version&#39;s source bundle from S3 when the application version is deleted.
     * 
     */
    private Boolean deleteSourceFromS3;
    /**
     * @return The number of days to retain an application version.
     * 
     */
    private Integer maxAgeInDays;
    /**
     * @return The maximum number of application versions to retain.
     * 
     */
    private Integer maxCount;
    /**
     * @return The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    private String serviceRole;

    private GetApplicationAppversionLifecycle() {}
    /**
     * @return Specifies whether delete a version&#39;s source bundle from S3 when the application version is deleted.
     * 
     */
    public Boolean deleteSourceFromS3() {
        return this.deleteSourceFromS3;
    }
    /**
     * @return The number of days to retain an application version.
     * 
     */
    public Integer maxAgeInDays() {
        return this.maxAgeInDays;
    }
    /**
     * @return The maximum number of application versions to retain.
     * 
     */
    public Integer maxCount() {
        return this.maxCount;
    }
    /**
     * @return The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    public String serviceRole() {
        return this.serviceRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationAppversionLifecycle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteSourceFromS3;
        private Integer maxAgeInDays;
        private Integer maxCount;
        private String serviceRole;
        public Builder() {}
        public Builder(GetApplicationAppversionLifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteSourceFromS3 = defaults.deleteSourceFromS3;
    	      this.maxAgeInDays = defaults.maxAgeInDays;
    	      this.maxCount = defaults.maxCount;
    	      this.serviceRole = defaults.serviceRole;
        }

        @CustomType.Setter
        public Builder deleteSourceFromS3(Boolean deleteSourceFromS3) {
            this.deleteSourceFromS3 = Objects.requireNonNull(deleteSourceFromS3);
            return this;
        }
        @CustomType.Setter
        public Builder maxAgeInDays(Integer maxAgeInDays) {
            this.maxAgeInDays = Objects.requireNonNull(maxAgeInDays);
            return this;
        }
        @CustomType.Setter
        public Builder maxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }
        @CustomType.Setter
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }
        public GetApplicationAppversionLifecycle build() {
            final var o = new GetApplicationAppversionLifecycle();
            o.deleteSourceFromS3 = deleteSourceFromS3;
            o.maxAgeInDays = maxAgeInDays;
            o.maxCount = maxCount;
            o.serviceRole = serviceRole;
            return o;
        }
    }
}
