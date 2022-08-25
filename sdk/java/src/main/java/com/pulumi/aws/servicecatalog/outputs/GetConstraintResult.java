// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConstraintResult {
    private @Nullable String acceptLanguage;
    /**
     * @return Description of the constraint.
     * 
     */
    private String description;
    private String id;
    /**
     * @return Owner of the constraint.
     * 
     */
    private String owner;
    /**
     * @return Constraint parameters in JSON format.
     * 
     */
    private String parameters;
    /**
     * @return Portfolio identifier.
     * 
     */
    private String portfolioId;
    /**
     * @return Product identifier.
     * 
     */
    private String productId;
    /**
     * @return Constraint status.
     * 
     */
    private String status;
    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    private String type;

    private GetConstraintResult() {}
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * @return Description of the constraint.
     * 
     */
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Owner of the constraint.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Constraint parameters in JSON format.
     * 
     */
    public String parameters() {
        return this.parameters;
    }
    /**
     * @return Portfolio identifier.
     * 
     */
    public String portfolioId() {
        return this.portfolioId;
    }
    /**
     * @return Product identifier.
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return Constraint status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstraintResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String description;
        private String id;
        private String owner;
        private String parameters;
        private String portfolioId;
        private String productId;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetConstraintResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.owner = defaults.owner;
    	      this.parameters = defaults.parameters;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConstraintResult build() {
            final var o = new GetConstraintResult();
            o.acceptLanguage = acceptLanguage;
            o.description = description;
            o.id = id;
            o.owner = owner;
            o.parameters = parameters;
            o.portfolioId = portfolioId;
            o.productId = productId;
            o.status = status;
            o.type = type;
            return o;
        }
    }
}
