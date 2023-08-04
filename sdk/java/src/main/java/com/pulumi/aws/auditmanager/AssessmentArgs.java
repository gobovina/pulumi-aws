// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs;
import com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs;
import com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssessmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentArgs Empty = new AssessmentArgs();

    /**
     * Assessment report storage destination configuration. See `assessment_reports_destination` below.
     * 
     */
    @Import(name="assessmentReportsDestination")
    private @Nullable Output<AssessmentAssessmentReportsDestinationArgs> assessmentReportsDestination;

    /**
     * @return Assessment report storage destination configuration. See `assessment_reports_destination` below.
     * 
     */
    public Optional<Output<AssessmentAssessmentReportsDestinationArgs>> assessmentReportsDestination() {
        return Optional.ofNullable(this.assessmentReportsDestination);
    }

    /**
     * Description of the assessment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the assessment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the framework the assessment will be created from.
     * 
     */
    @Import(name="frameworkId", required=true)
    private Output<String> frameworkId;

    /**
     * @return Unique identifier of the framework the assessment will be created from.
     * 
     */
    public Output<String> frameworkId() {
        return this.frameworkId;
    }

    /**
     * Name of the assessment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the assessment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of roles for the assessment. See `roles` below.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<AssessmentRoleArgs>> roles;

    /**
     * @return List of roles for the assessment. See `roles` below.
     * 
     */
    public Output<List<AssessmentRoleArgs>> roles() {
        return this.roles;
    }

    /**
     * Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="scope")
    private @Nullable Output<AssessmentScopeArgs> scope;

    /**
     * @return Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<AssessmentScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AssessmentArgs() {}

    private AssessmentArgs(AssessmentArgs $) {
        this.assessmentReportsDestination = $.assessmentReportsDestination;
        this.description = $.description;
        this.frameworkId = $.frameworkId;
        this.name = $.name;
        this.roles = $.roles;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentArgs $;

        public Builder() {
            $ = new AssessmentArgs();
        }

        public Builder(AssessmentArgs defaults) {
            $ = new AssessmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assessmentReportsDestination Assessment report storage destination configuration. See `assessment_reports_destination` below.
         * 
         * @return builder
         * 
         */
        public Builder assessmentReportsDestination(@Nullable Output<AssessmentAssessmentReportsDestinationArgs> assessmentReportsDestination) {
            $.assessmentReportsDestination = assessmentReportsDestination;
            return this;
        }

        /**
         * @param assessmentReportsDestination Assessment report storage destination configuration. See `assessment_reports_destination` below.
         * 
         * @return builder
         * 
         */
        public Builder assessmentReportsDestination(AssessmentAssessmentReportsDestinationArgs assessmentReportsDestination) {
            return assessmentReportsDestination(Output.of(assessmentReportsDestination));
        }

        /**
         * @param description Description of the assessment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the assessment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param frameworkId Unique identifier of the framework the assessment will be created from.
         * 
         * @return builder
         * 
         */
        public Builder frameworkId(Output<String> frameworkId) {
            $.frameworkId = frameworkId;
            return this;
        }

        /**
         * @param frameworkId Unique identifier of the framework the assessment will be created from.
         * 
         * @return builder
         * 
         */
        public Builder frameworkId(String frameworkId) {
            return frameworkId(Output.of(frameworkId));
        }

        /**
         * @param name Name of the assessment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the assessment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roles List of roles for the assessment. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<AssessmentRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles List of roles for the assessment. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<AssessmentRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles List of roles for the assessment. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(AssessmentRoleArgs... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param scope Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<AssessmentScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder scope(AssessmentScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AssessmentArgs build() {
            $.frameworkId = Objects.requireNonNull($.frameworkId, "expected parameter 'frameworkId' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
