// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs;
import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureState;
import com.pulumi.aws.guardduty.outputs.OrganizationConfigurationFeatureAdditionalConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a single Amazon GuardDuty [organization configuration feature](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-features-activation-model.html#guardduty-features).
 * 
 * &gt; **NOTE:** Deleting this resource does not disable the organization configuration feature, the resource in simply removed from state instead.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.guardduty.Detector;
 * import com.pulumi.aws.guardduty.DetectorArgs;
 * import com.pulumi.aws.guardduty.OrganizationConfigurationFeature;
 * import com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Detector("example", DetectorArgs.builder()
 *             .enable(true)
 *             .build());
 * 
 *         var eksRuntimeMonitoring = new OrganizationConfigurationFeature("eksRuntimeMonitoring", OrganizationConfigurationFeatureArgs.builder()
 *             .detectorId(example.id())
 *             .name("EKS_RUNTIME_MONITORING")
 *             .autoEnable("ALL")
 *             .additionalConfigurations(OrganizationConfigurationFeatureAdditionalConfigurationArgs.builder()
 *                 .name("EKS_ADDON_MANAGEMENT")
 *                 .autoEnable("NEW")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:guardduty/organizationConfigurationFeature:OrganizationConfigurationFeature")
public class OrganizationConfigurationFeature extends com.pulumi.resources.CustomResource {
    /**
     * The additional information that will be configured for the organization See below.
     * 
     */
    @Export(name="additionalConfigurations", refs={List.class,OrganizationConfigurationFeatureAdditionalConfiguration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OrganizationConfigurationFeatureAdditionalConfiguration>> additionalConfigurations;

    /**
     * @return The additional information that will be configured for the organization See below.
     * 
     */
    public Output<Optional<List<OrganizationConfigurationFeatureAdditionalConfiguration>>> additionalConfigurations() {
        return Codegen.optional(this.additionalConfigurations);
    }
    /**
     * The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
     * 
     */
    @Export(name="autoEnable", refs={String.class}, tree="[0]")
    private Output<String> autoEnable;

    /**
     * @return The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
     * 
     */
    public Output<String> autoEnable() {
        return this.autoEnable;
    }
    /**
     * The ID of the detector that configures the delegated administrator.
     * 
     */
    @Export(name="detectorId", refs={String.class}, tree="[0]")
    private Output<String> detectorId;

    /**
     * @return The ID of the detector that configures the delegated administrator.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`, `RUNTIME_MONITORING`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`, `RUNTIME_MONITORING`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationConfigurationFeature(String name) {
        this(name, OrganizationConfigurationFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationConfigurationFeature(String name, OrganizationConfigurationFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationConfigurationFeature(String name, OrganizationConfigurationFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationConfigurationFeature:OrganizationConfigurationFeature", name, args == null ? OrganizationConfigurationFeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConfigurationFeature(String name, Output<String> id, @Nullable OrganizationConfigurationFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationConfigurationFeature:OrganizationConfigurationFeature", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OrganizationConfigurationFeature get(String name, Output<String> id, @Nullable OrganizationConfigurationFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationConfigurationFeature(name, id, state, options);
    }
}
